package jsonsender;

import java.net.Socket;
import java.util.concurrent.Callable;

/**
 * Created by ilia on 7/11/16.
 */
interface RecieveTaskIn extends Callable<String> {
      String ReceiveResp(Socket remoteServSocket);
}
