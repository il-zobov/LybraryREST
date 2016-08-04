package jsonsender;

import java.net.Socket;

/**
 * Created by ilia on 7/11/16.
 */
interface SendTaskIn extends  Runnable  {
    void SendAsyncRequest(String jSon, Socket remoteServSocket);
}
