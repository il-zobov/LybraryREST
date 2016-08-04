package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class MapVolleyball {

   // Map":{"Confidence":8.0,"2":3.6,"Alpha":9.0,"1":1.26,"marginSetID":83.0}


    @SerializedName("Confidence")
    private  float confidence;

    @SerializedName("2")
    private  float second;

    @SerializedName("Alpha")
    private  float alpha;

    @SerializedName("1")
    private  float first;

    private  float marginSetID;


    public MapVolleyball(float confidence, float second, float alpha, float first, float marginSetID) {
        this.confidence = confidence;
        this.second = second;
        this.alpha = alpha;
        this.first = first;
        this.marginSetID = marginSetID;
    }
}
