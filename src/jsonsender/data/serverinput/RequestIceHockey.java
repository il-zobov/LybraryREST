package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class RequestIceHockey extends  ToServer {

    @SerializedName("SID")
    private    int sid;

    @SerializedName("Map")
    private MapIceHockey Map;

    @SerializedName("Token")
    private String token;

    @SerializedName("MID")
    private   int mid;

   // @SerializedName("RequestType")
  //  public int requestType;

    public RequestIceHockey(int sid, MapIceHockey map, String token, int mid, int requestType) {
        this.sid = sid;
        Map = map;
        this.token = token;
        this.mid = mid;
        this.requestType = requestType;
    }
}
