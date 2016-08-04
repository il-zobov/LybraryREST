package jsonsender;

import jsonsender.data.ServerData;
import jsonsender.data.serveroutput.ResponceFromServ;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceAskListM;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceDataAskMargin;
import jsonsender.data.serveroutput.margininput.ReadMarginSet.ResponceDataAskMarg;

import java.util.concurrent.Callable;

/**
 * Created by ilia on 6/27/16.
 */

interface SocketIn extends Callable<ServerData> {
    int LENGTH_OF_QUEUE= 10;
    int MINIMUM_COUNT_THREADS= 1;
    int MAXIMUM_COUNT_THREADS= 2;
    long TIME_OF_THREAD_EXECUTE= 5L;
    int TIME_WAIT_FOR_SERVER_ANSWER= 3; // seconds
    int COUNT_OF_REPEAT_REQUEST= 2;
    int REQUEST_MATCH = 1;
    int REQUEST_SET_MARGIN = 4;
    int REQUEST_SET_MARGIN_EVENT =9;
    int REQUEST_SET= 5;
    int REQUEST_EDIT_MARGIN_SET =6;
    int REQUEST_MARGIN_LIST= 8;
    int REQUEST_DLETE_SET = 7;



  //  ResponceMarginCreate convJsonToClass(String jS);

    ServerData getDataFromServer(ServerData DataIn);
    String convClassToJson(ServerData Data);
    String convClassToJson(ResponceDataAskMargin Data);

    ResponceFromServ convJsonToClass(String jS);
    ResponceDataAskMargin convJsonToClassMargList(String jS);
    ResponceDataAskMarg convJsonToClassMargSet(String jS);


}
