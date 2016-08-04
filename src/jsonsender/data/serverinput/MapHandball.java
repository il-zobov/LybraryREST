package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class MapHandball {

  //  {"2":1.01,"1":15.5,"marginSetID":92.0,"X":19.0}
// {"2":1.01,
// "1":18.25,
// "2st_half":0.526,
// "marginSetID":140.0,
// "equal":0.089,"X":18.75,"1st_half":0.385}



    @SerializedName("2")
    private  float second;


    @SerializedName("1")
    private  float first;

    @SerializedName("2st_half")
    private  float secondHalf;

    private  float marginSetID;

    @SerializedName("equal")
    private  float equal;

    @SerializedName("X")
    private  float x;

    @SerializedName("1st_half")
    private  float firstHalf;

    public MapHandball(float second, float first, float secondHalf, float marginSetID, float equal, float x, float firstHalf) {
        this.second = second;
        this.first = first;
        this.secondHalf = secondHalf;
        this.marginSetID = marginSetID;
        this.equal = equal;
        this.x = x;
        this.firstHalf = firstHalf;
    }
}
