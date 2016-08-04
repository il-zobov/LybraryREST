package jsonsender;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

/** Async request  to server thread
 */
class  SendTask implements SendTaskIn
{
    private String jSon;
    private Socket remoteServSocket;

    SendTask(String jSon, Socket remoteServSocket)
    {
        this.jSon = jSon;
        this.remoteServSocket = remoteServSocket;
    }
    SendTask()
    {

    }

    @Override
    public void SendAsyncRequest(String jSon,  Socket remoteSerSockett) {

            try {
                if (remoteServSocket.isConnected())
                {

                    GZIPOutputStream gzipOut = new GZIPOutputStream(remoteServSocket.getOutputStream());
                    ObjectOutputStream out = new ObjectOutputStream(gzipOut);
                    out.writeObject(jSon);
                    System.out.println(" Sending request to Server ");
                    out.flush();
                    gzipOut.finish();

                }
            }catch ( IOException ex)
            {
                ex.printStackTrace();
            }

    }

    @Override
    public void run() {
        SendAsyncRequest(jSon, remoteServSocket);
    }
}
