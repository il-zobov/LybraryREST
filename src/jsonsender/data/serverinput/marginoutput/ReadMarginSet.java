package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.ToServer;

/**
 * Read Margin Set
 */
public class ReadMarginSet extends ToServer {

    @SerializedName("SID")
    private  int sid;

    @SerializedName("Map")
    private  ReadMarginMap map;

    @SerializedName("Token")
    private  String token;


    public ReadMarginSet(int sid, ReadMarginMap map, String token, int requestType) {
        this.requestType = requestType;
        this.sid = sid;
        this.map = map;
        this.token = token;
    }
}
