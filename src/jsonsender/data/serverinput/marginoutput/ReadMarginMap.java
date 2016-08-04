package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/21/16.
 */
public class ReadMarginMap {

    @SerializedName("MarginSetID")
    private  int marginSetID;

    public ReadMarginMap(int marginSetID) {
        this.marginSetID = marginSetID;
    }
}
