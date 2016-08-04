package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class MapIceHockey {

   // {"limit":0.5,"2":4.0,"Over":1.8,"1":2.0,"1P Ratio":0.3116,"Under":1.8,"marginSetID":82.0,"3P Ratio":0.3522,"X":3.0,"2P Ratio":0.3362}

    @SerializedName("limit")
    private  float limit;

    @SerializedName("2")
    private  float second;


    @SerializedName("Over")
    private  float over;

    @SerializedName("1")
    private  float first;

    @SerializedName("1P Ratio")
    private  float firsPRatio;

    @SerializedName("Under")
    private  float under;

    private  float marginSetID;

    @SerializedName("3P Ratio")
    private  float thirdPRatio;

    @SerializedName("X")
    private  float x;

    @SerializedName("2P Ratio")
    private  float secondPRatio;


    public MapIceHockey(float limit, float second, float over, float first, float firsPRatio, float under, float marginSetID,
                        float thirdPRatio, float x, float secondPRatio) {
        this.limit = limit;
        this.second = second;
        this.over = over;
        this.first = first;
        this.firsPRatio = firsPRatio;
        this.under = under;
        this.marginSetID = marginSetID;
        this.thirdPRatio = thirdPRatio;
        this.x = x;
        this.secondPRatio = secondPRatio;
    }
}
