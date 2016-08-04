package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;


/**
 * Created by ilia on 7/1/16.
 */


public class RequestSoccer extends ToServer {

    @SerializedName("SID")
    private   int sid;

    @SerializedName("Map")
    private MapSoccer Map;

    @SerializedName("Token")
    private String token;

    @SerializedName("MID")
    private   int mid;

   // @SerializedName("RequestType")
   // public int requestType;

   public RequestSoccer(int sid, MapSoccer MapS , String token, int mid , int requestType) {
        this.sid = sid;
        this.token = token;
        this.mid = mid;
        Map = MapS;
        this.requestType = requestType;
    }
}
