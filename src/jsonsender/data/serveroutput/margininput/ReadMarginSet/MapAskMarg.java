package jsonsender.data.serveroutput.margininput.ReadMarginSet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Read Margin Set
 */
class MapAskMarg {

    @SerializedName("Name")
    private  String name;

    @SerializedName("MarginSetID")
    private  String marginSetID;

    @SerializedName("Markets")
    private List<ReadMargMarkets> markets ;

    @SerializedName("Token")
    private String token;

    @SerializedName("RequestType")
    private String requestType;


    public MapAskMarg(String name, List<ReadMargMarkets> markets) {
        this.name = name;
        this.markets = markets;
    }
}
