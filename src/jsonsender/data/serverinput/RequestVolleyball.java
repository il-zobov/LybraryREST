package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/** Reqest Volleyball */
public class RequestVolleyball extends ToServer {



    @SerializedName("SID")
    protected   int sid;

    @SerializedName("Map")
    protected MapVolleyball Map;

    @SerializedName("Token")
    protected String token;

    @SerializedName("MID")
    private int mid;

  //  @SerializedName("RequestType")
 //   public int requestType;

    public RequestVolleyball(int sid, MapVolleyball MapS , String token, int mid , int requestType) {
        this.sid = sid;
        this.token = token;
        this.mid = mid;
        this.Map = MapS;
        this.requestType = requestType;
    }

}
