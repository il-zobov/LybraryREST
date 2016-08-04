package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/12/16.
 */
public class MapBasketball {

/*
    {"Total Spreads":5.0,"Number_of_halftime_spreads":4.0,"CutOff":0.0,"deviation":11.5,"Points Spreads":5.0,
            "Under":1.8,"1_2way":1.18,"points":-10.5,"Number_of_fulltime_spreads":4.0,"Total Quarters":5.0,
            "Number_of_quarter_spreads":2.0,"limit":120.5,"4th_quarter":0.25,"2st_quarter":0.25,"Over":1.8,
            "1st_quarter":0.25,"equals":0.07,"marginSetID":81.0,"3rd_quarter":0.25,"Trailing margin":-1.0,
            "2":1.8,"1":1.9,"2_2way":4.4,"Points Spread Quarters":5.0,"possesion":200.0,"Spread point movement":5.0,
            "Points Spread Halfs":5.0,"Total Halfs":5.0}
*/


    @SerializedName("Total Spreads")
    private  float totalSpreads;

    @SerializedName("Number_of_halftime_spreads")
    private  float numberOfHalfSpreads;

    @SerializedName("CutOff")
    private  float cutOff;

    private  float deviation;

    @SerializedName("Points Spreads")
    private  float pointsSpreads;

    @SerializedName("Under")
    private  float under;

    @SerializedName("1_2way")
    private  float wayOneTwo;

    private  float points;

    @SerializedName("Number_of_fulltime_spreads")
    private  float numberOfFullSpreads;

    @SerializedName("Total Quarters")
    private  float totalQuarters;

    @SerializedName("Number_of_quarter_spreads")
    private  float numberQuarterSpreads;

    @SerializedName("limit")
    private  float limit;

    @SerializedName("4th_quarter")
    private  float fourQuarter;

    @SerializedName("2st_quarter")
    private  float secondQuarter;

    @SerializedName("Over")
    private  float over;

    @SerializedName("1st_quarter")
    private  float firstQuarter;

    @SerializedName("equals")
    private  float equals;

    @SerializedName("marginSetID")
    private  float pmarginSetID;

    @SerializedName("3rd_quarter")
    private  float thirdQuarter;

    @SerializedName("Trailing margin")
    private  float trailingMargin;

    @SerializedName("2")
    private  float two;

    @SerializedName("1")
    private  float one;

    @SerializedName("2_2way")
    private  float twoWTwoWay;

    @SerializedName("Points Spread Quarters")
    private  float pointSpreadQuarters;

    @SerializedName("possesion")
    private  float possesion;

    @SerializedName("Spread point movement")
    private  float spreadPointMovement;


    @SerializedName("Points Spread Halfs")
    private  float pointsSpreadHalfs;

    @SerializedName("Total Halfs")
    private  float totalHalfs;


    public MapBasketball(float totalSpreads, float numberOfHalfSpreads, float cutOff, float deviation, float pointsSpreads,
                         float under, float wayOneTwo, float points, float numberOfFullSpreads, float totalQuarters, float numberQuarterSpreads,
                         float limit, float fourQuarter, float secondQuarter, float over, float firstQuarter, float equals, float pmarginSetID,
                         float thirdQuarter, float trailingMargin, float two, float one, float twoWTwoWay, float pointSpreadQuarters,
                         float possesion, float spreadPointMovement, float pointsSpreadHalfs, float totalHalfs) {

        this.totalSpreads = totalSpreads;
        this.numberOfHalfSpreads = numberOfHalfSpreads;
        this.cutOff = cutOff;
        this.deviation = deviation;
        this.pointsSpreads = pointsSpreads;
        this.under = under;
        this.wayOneTwo = wayOneTwo;
        this.points = points;
        this.numberOfFullSpreads = numberOfFullSpreads;
        this.totalQuarters = totalQuarters;
        this.numberQuarterSpreads = numberQuarterSpreads;
        this.limit = limit;
        this.fourQuarter = fourQuarter;
        this.secondQuarter = secondQuarter;
        this.over = over;
        this.firstQuarter = firstQuarter;
        this.equals = equals;
        this.pmarginSetID = pmarginSetID;
        this.thirdQuarter = thirdQuarter;
        this.trailingMargin = trailingMargin;
        this.two = two;
        this.one = one;
        this.twoWTwoWay = twoWTwoWay;
        this.pointSpreadQuarters = pointSpreadQuarters;
        this.possesion = possesion;
        this.spreadPointMovement = spreadPointMovement;
        this.pointsSpreadHalfs = pointsSpreadHalfs;
        this.totalHalfs = totalHalfs;
    }
}
