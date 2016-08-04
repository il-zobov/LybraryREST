package jsonsender.data.serveroutput.margininput.AskListMargin;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * List all markets and market information for margin
 */
class MapList {


    @SerializedName("Markets")
    private List<MarketList> markets ;


    public MapList( List<MarketList> markets) {

        this.markets = markets;
    }
}
