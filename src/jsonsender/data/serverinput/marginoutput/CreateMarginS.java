package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.ToServer;

//"Token": "1b3519570201f096eb6d24a704a9cd88652b90ac",

  //      "RequestType": 4
/**Create Margin Set*/
public class CreateMarginS  extends ToServer{

    @SerializedName("SID")
    private  int sid;

    @SerializedName("Map")
    private  Map map;

    @SerializedName("Token")
    private  String token;


    public CreateMarginS(int sid, Map map, String token, int requestType) {
        this.sid = sid;
        this.map = map;
        this.token = token;
        this.requestType = requestType;
    }
}
