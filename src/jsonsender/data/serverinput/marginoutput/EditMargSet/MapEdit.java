package jsonsender.data.serverinput.marginoutput.EditMargSet;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serverinput.marginoutput.Market;

import java.util.List;

/**
 * Edit Margin Set.
 */
public class MapEdit {

    @SerializedName("MarginSetID")
    private  int marginSetID;

    @SerializedName("Markets")
    private List<Market> markets ;

    public MapEdit(int marginSetID, List<Market> markets) {
        this.marginSetID = marginSetID;
        this.markets = markets;
    }
}
