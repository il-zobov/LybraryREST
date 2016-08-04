package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.ToServer;

/**
 * Apply Margin Set to an event or someplace within the hierarchy
 */
public class SetMargingSetEvent extends ToServer{


    @SerializedName("SID")
    private  int sid;

    @SerializedName("CategoryID")
    private  int categoryID;

    @SerializedName("LeagueID")
    private  int leagueID;

    @SerializedName("EventID")
    private  int eventID;

    @SerializedName("MarginSetID")
    private  int marginSetID;

    @SerializedName("Token")
    private  String token;

    public SetMargingSetEvent(int sid, int categoryID, int leagueID, int eventID, int marginSetID, String token, int requestType) {
        this.sid = sid;
        this.categoryID = categoryID;
        this.leagueID = leagueID;
        this.eventID = eventID;
        this.marginSetID = marginSetID;
        this.token = token;

        this.requestType = requestType;
    }
}
