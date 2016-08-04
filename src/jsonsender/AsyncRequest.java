package jsonsender;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jsonsender.data.ServerData;
import jsonsender.data.serveroutput.Responce;
import jsonsender.data.serveroutput.ResponceFromServ;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceAskListM;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceDataAskMargin;
import jsonsender.data.serveroutput.margininput.ReadMarginSet.ResponceDataAskMarg;

import java.net.Socket;
import java.util.concurrent.*;

/**
 * Created by ilia on 7/11/16.
 */
public class AsyncRequest implements SocketIn
{
   private String server;
   private String sendPort;
    private Socket remoteSerSocket;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private  boolean localLock = false;
    private ServerData InternelData;

    private LinkedBlockingQueue queue = new LinkedBlockingQueue(LENGTH_OF_QUEUE);
    private ThreadPoolExecutor executor = new ThreadPoolExecutor(MINIMUM_COUNT_THREADS,MAXIMUM_COUNT_THREADS,TIME_OF_THREAD_EXECUTE,
            TimeUnit.MILLISECONDS, queue);




  protected   AsyncRequest(String server, String sendPort, ServerData internelData)
    {
        this.server = server;
        this.sendPort = sendPort;
        InternelData = internelData;
        // Thread pool & socket init
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        try {
            remoteSerSocket = new Socket(server, Integer.parseInt(sendPort));
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
    /**  Just for test  */
    public   AsyncRequest() {}

    @Override
    public ServerData  call() throws Exception {
        return  getDataFromServer(InternelData);
    }

    /** this make a Json for all kind of request
     * @param Data input class to be converted
     * @return String output Json
     * */
    @Override
    public String convClassToJson(ServerData Data) {
        return GSON.toJson(Data.getRequestData());
    }

    /** Just for testing purpose */
    public String convClassToJson(ResponceDataAskMargin  Data) {
        return GSON.toJson(Data);
    }
    /** Just for testing purpose */
    public String convClassToJson(Responce Data) {
        return GSON.toJson(Data);
    }


    @Override
    public ResponceFromServ convJsonToClass(String jS) {
            try {
                return GSON.fromJson(jS, ResponceFromServ.class);
            } catch (com.google.gson.JsonSyntaxException ex)
            {
                ex.printStackTrace();
                return  null;
            }catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }

    }

    @Override
    public ResponceDataAskMargin convJsonToClassMargList(String jS) {
        // TODO: 6/30/16  How better to act with Data
        try {
            return GSON.fromJson(jS,  ResponceDataAskMargin.class);
        } catch (com.google.gson.JsonSyntaxException ex)
        {
            ex.printStackTrace();
            return  null;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public ResponceDataAskMarg convJsonToClassMargSet(String jS) {
        // TODO: 6/30/16  How better to act with Data
        try {
            return GSON.fromJson(jS,  ResponceDataAskMarg.class);
        } catch (com.google.gson.JsonSyntaxException ex)
        {
            ex.printStackTrace();
            return  null;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }

    /**   Request the data from server asyncroniously corresponding the type of request data
     * @param DataIn input data with filled ToServer and free Responce
     * @return ServerData with filled fields To Server and Responce or Responce can be null if Error
     * */
    @Override
    public ServerData getDataFromServer(ServerData DataIn)
    {
        Boolean validResp = false;
        int repeats = 0;
        String result = null;
        if(!localLock)
        {
            Runnable SendRequestTask = new SendTask(convClassToJson(DataIn),remoteSerSocket);
            executor.execute(SendRequestTask);

            Future<String> future = executor.submit(new ReceiveTask(remoteSerSocket));

            while (!validResp ) {
                try {
                    result = future.get(TIME_WAIT_FOR_SERVER_ANSWER, TimeUnit.SECONDS);
                    validResp = true;
                    try {
                        remoteSerSocket.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    validResp = true;
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    validResp = true;
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    if (repeats <= COUNT_OF_REPEAT_REQUEST) {
                        repeats++;
                        System.out.println(" Time out for answer resending request ");
                        executor.execute(SendRequestTask);
                    } else {
                        validResp = true;
                        try {
                            remoteSerSocket.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
        if (result!=null) {

            switch (DataIn.getRequestData().requestType)
            {
                case REQUEST_MATCH:{
                    DataIn.setResponceData(convJsonToClass(result));
                    break;
                }
                case REQUEST_SET_MARGIN:{
                    if(result.contains("successfully")) {
                        // OK
                    }
                    else {
                        System.out.println(" Got Error  ");
                    }
                    break;
                }
                case REQUEST_SET:{
                    System.out.println(result);
                    DataIn.setResponceData(convJsonToClassMargSet(result));
                    break;
                }
                case REQUEST_MARGIN_LIST:
                {
                    System.out.println(result);
                    DataIn.setResponceData(convJsonToClassMargList(result));
                    break;
                }
                case REQUEST_SET_MARGIN_EVENT:{
                    if(result.contains("successfully")) {
                    }
                    else {
                        System.out.println(" Got Error  ");
                    }
                    break;
                }
                case REQUEST_EDIT_MARGIN_SET:{
                    if(result.contains("successfully")) {

                    }
                    else {
                        System.out.println(" Got Error  ");
                    }
                    break;
                }
                case REQUEST_DLETE_SET:{
                    if(result.contains("successfully")) {
                    }
                    else {
                        System.out.println(" Got Error  ");
                    }
                    break;
                }

            }
            System.out.println(" Got valid data from server all done waiting for next request ");

            return DataIn;
        }
        else
        {
            return null;
        }
   }
}
