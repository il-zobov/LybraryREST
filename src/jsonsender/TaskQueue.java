package jsonsender;

import jsonsender.data.ServerData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
/** Klass to make queue of AsyncRequests */
public class TaskQueue {

    /** @value Length of maximum of task queue, so the count of sports to ask should not be grater then this   */
    private static final int LENGTH_OF_QUEUE= 100;

    private static final int MINIMUM_COUNT_THREADS= 1;
    /** @value In one time no more then 20 threads will be started   */
    private static final int MAXIMUM_COUNT_THREADS= 20;
    /** @value Length of maximum of task queue, so the count of sports to ask should not be grater then this   */
    private static final   long TIME_OF_THREAD_EXECUTE= 5L;
    private static final int TIME_WAIT_FOR_SERVER_ANSWER= 5; // seconds


  private  LinkedBlockingQueue queue = new LinkedBlockingQueue(LENGTH_OF_QUEUE);
    private ThreadPoolExecutor executor = new ThreadPoolExecutor(MINIMUM_COUNT_THREADS,MAXIMUM_COUNT_THREADS,TIME_OF_THREAD_EXECUTE,
            TimeUnit.MILLISECONDS, queue);
    private String server;
    private String port;

    public TaskQueue(String server, String port) {
        /// </summary>
        this.server = server;
        this.port = port;
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }


    /** Start executing input queue
     * @param DataArr  - array of input data
     * @return Array with data recieved from server
     * */
    public ServerData[]  ExecuteTasks(ServerData[] DataArr)
    {
        long startTime = System.nanoTime();

      List<Callable<ServerData>> taskList = new ArrayList<Callable<ServerData>>();


            for(int i = 0; i<DataArr.length; i++)
            {
                taskList.add(new AsyncRequest(server, port, DataArr[i]));
            }
            try {
            List<Future<ServerData>> resultFuture = executor.invokeAll(taskList);
            for (int i = (DataArr.length-1); i>=0; i-- )
            {
                DataArr[i] = resultFuture.remove(i).get(TIME_WAIT_FOR_SERVER_ANSWER,TimeUnit.SECONDS);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        return  DataArr;
    }

}
