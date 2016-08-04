package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class MapTennis {

   // { "limit":36.5,"2":1.11,"Alpha":5.0,"Over":1.85,"1":6.27,"Under":1.86,"marginSetID":79.0,"gender":1.0,"numOfSets":5.0}

    @SerializedName("limit")
    private  float limit;

    @SerializedName("2")
    private  float second;

    @SerializedName("Alpha")
    private  float alpha;

    @SerializedName("Over")
    private  float over;

    @SerializedName("1")
    private  float first;

    @SerializedName("Under")
    private  float under;

    private  float marginSetID;

    @SerializedName("gender")
    private  float gender;

    @SerializedName("numOfSets")
    private  float numOfSets;

    public MapTennis(float limit, float second, float alpha, float over, float first, float under, float marginSetID, float gender, float numOfSets) {
        this.limit = limit;
        this.second = second;
        this.alpha = alpha;
        this.over = over;
        this.first = first;
        this.under = under;
        this.marginSetID = marginSetID;
        this.gender = gender;
        this.numOfSets = numOfSets;
    }
}
