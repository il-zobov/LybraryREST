package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * Created by ilia on 7/19/16.
 */
public class Map {

    @SerializedName("Name")
    private  String name;

    @SerializedName("Markets")
    private List<Market> markets ;

    public Map(String name, List<Market> markets) {
        this.name = name;
        this.markets = markets;
    }
}
