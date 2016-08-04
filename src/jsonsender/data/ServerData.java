package jsonsender.data;


import jsonsender.data.serveroutput.Responce;
import jsonsender.data.serveroutput.ResponceFromServ;
import jsonsender.data.serverinput.*;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceAskListM;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceDataAskMargin;
import jsonsender.data.serveroutput.margininput.ReadMarginSet.ResponceDataAskMarg;

/** Base Class for storing request and responce on each sport or margin */
public class ServerData {
    /** Common data sending to server  */
    private ToServer RequestData;
    /** Common responce from server */
    private Responce ResponceData;

    public ServerData(ToServer requestData) {
        RequestData = requestData;
    }


    public ToServer getRequestData() {
        return RequestData;
    }
    /** Setter for responce of sport  */
    public void setResponceData(ResponceFromServ responceData) {
        ResponceData = responceData;
    }
    /** Setter for responce of Margins */
    public void setResponceData(ResponceDataAskMargin responceData) {
        ResponceData = responceData;
    }
    /** Setter for responce of List of Margins */
    public void setResponceData(ResponceDataAskMarg responceData) {
        ResponceData = responceData;
    }

}
