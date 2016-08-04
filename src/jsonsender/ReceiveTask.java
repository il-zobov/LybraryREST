package jsonsender;

import org.junit.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

/** Recieve of responce thread take's the same socket input as the request thread
 *  so it runs in one tcp stream and automatically corresponds to the request*/
class ReceiveTask implements RecieveTaskIn
{
    private Socket remoteServSocket;
    private String inJson = "";

    ReceiveTask(Socket remoteServSocket) {
        this.remoteServSocket = remoteServSocket;
    }

    /**
     * @param remoteServSocket socket  where we put the request in, socket must be connected
     * @return responce json from the server (string)
     * */
    @Override
    public String ReceiveResp(Socket remoteServSocket)

    {

        if (remoteServSocket.isConnected())
       {

           try {
               // had to sleep to be sure thet request has gone to server
               Thread.sleep(150);
               ObjectInputStream in= new ObjectInputStream(new GZIPInputStream(remoteServSocket.getInputStream()));
               inJson = (String) in.readObject();

               System.out.println("Got response from server processing it ");
             //  System.out.println(inJson);
               // TODO: 7/11/16 think about simplyfy becasue of loose in speed
               // this is needed because of wrong Json structure extra \ sibols and "

               //{"Data":","Error":"There was an error with the calcualtion process. Odds are currently not calculated. Please contact the administrator.nSorry!"}
               inJson = inJson.replaceAll("\\\\","");
                if (inJson.length()<200) {
                    inJson = inJson.replaceAll("\"Data\":\"\"", "\"Data\":[]");
                }
               else
                {
                    inJson = inJson.replaceAll("\"Data\":\"", "\"Data\":");
                }
              inJson = inJson.replaceAll("\",\"Error\":\"\"",",\"Error\":\"\"");

               in.close();
           }
            catch (IOException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }        catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
        return inJson;
    }

    @Override
    public String call() throws Exception {

        return  ReceiveResp(remoteServSocket);
    }
}
