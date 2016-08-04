package jsonsender.data.serveroutput.margininput.ReadMarginSet;

import com.google.gson.annotations.SerializedName;

/**
 * Read Margin Set
 */
class ResponceAskMargins {
    @SerializedName("SID")
    private  int sid;

    @SerializedName("Map")
    private MapAskMarg map;

    @SerializedName("Token")
    private  String token;

        @SerializedName("RequestType")
        public int requestType;


    public ResponceAskMargins(int sid, MapAskMarg map, String token, int requestType) {
        this.sid = sid;
        this.map = map;
        this.token = token;
        this.requestType = requestType;
    }

}
