package jsonsender.data.serverinput.marginoutput.EditMargSet;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.ToServer;
import jsonsender.data.serverinput.marginoutput.Map;

/**
 * Edit Margin Set.
 */
public class EditSet extends ToServer {

    @SerializedName("SID")
    private  int sid;

    @SerializedName("Map")
    private MapEdit map;

    @SerializedName("Token")
    private  String token;

    public EditSet(int sid, MapEdit map, String token, int requestType ) {
        this.sid = sid;
        this.map = map;
        this.token = token;
        this.requestType = requestType;
    }
}
