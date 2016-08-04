package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class RequestBasketball extends ToServer {
    @SerializedName("SID")
    private    int sid;

    @SerializedName("Map")
    private MapBasketball Map;

    @SerializedName("Token")
    private String token;

    @SerializedName("MID")
    private   int mid;

   // @SerializedName("RequestType")
  //  public int requestType;

    public RequestBasketball(int sid, MapBasketball map, String token, int mid, int requestType) {
        this.sid = sid;
        Map = map;
        this.token = token;
        this.mid = mid;
        this.requestType = requestType;
    }
}
