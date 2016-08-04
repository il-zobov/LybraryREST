package jsonsender.data.serveroutput.margininput.AskListMargin;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * List all markets and market information for margin
 */
class MarketList {

    @SerializedName("Lines")
    private List<String> lines ;

    @SerializedName("Dynamic")
    private   boolean dynamic;

    @SerializedName("ID")
    private   int id;

    public MarketList(int id, List<String> lines, boolean dynamic) {
        this.id = id;
        this.lines = lines;
        this.dynamic = dynamic;
    }
}
