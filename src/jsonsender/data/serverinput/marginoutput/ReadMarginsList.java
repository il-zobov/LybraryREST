package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.ToServer;

/**
 * List all markets and market information for margin
 */
public class ReadMarginsList extends ToServer {
    @SerializedName("SID")
    private  int sid;

    @SerializedName("Token")
    private  String token;

    public ReadMarginsList(int sid, String token, int requestType) {
        this.sid = sid;
        this.token = token;
        this.requestType = requestType;
    }
}
