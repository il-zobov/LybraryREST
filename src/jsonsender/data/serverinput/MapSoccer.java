package jsonsender.data.serverinput;

import com.google.gson.annotations.SerializedName;


// TODO: 6/16/16 Make legal comments to variables

public class MapSoccer
{

    /// imit 	2.5 	the line of the over
    private  float limit;

    /// how many Asian handicap lines you wish to keep for the 1st and 2nd half
    @SerializedName("Asian Handicap Halfs")
    private  float asianHandicapHalfs;

    ///  	over odd for the line given by "limit"
    @SerializedName("Over")
    private  float over;

    ///  	over odd for the line given by "limit"
    private  float marginSetID;

    ///  	over odd for the line given by "limit"
    @SerializedName("Asian Totals")
    private  float asianTotals;

    ///  	over odd for the line given by "limit"
    @SerializedName("Yes")
    private  float yes;

    ///  	over odd for the line given by "limit"
    @SerializedName("HgeAgeRatio_1HT")
    private  float hgeAgeRatio_1HT;

    ///  	over odd for the line given by "limit"
    @SerializedName("No")
    private  float no;

    ///  	over odd for the line given by "limit"
    @SerializedName("Trailing margin")
    private  float trailingMargin;

    ///  	over odd for the line given by "limit"
    @SerializedName("Asian Totals Halfs")
    private  float asianTotalsHalfs;

    ///  	over odd for the line given by "limit"
    @SerializedName("2nd half draw inflation ratio")
    private  float secondDraw;

    ///  	over odd for the line given by "limit"
    @SerializedName("2")
    private  float two;

    ///  	over odd for the line given by "limit"
    @SerializedName("Asian Handicaps")
    private  float asianHandicaps;

    ///  	over odd for the line given by "limit"
    @SerializedName("1")
    private  float one;

    ///  	over odd for the line given by "limit"
    @SerializedName("Under")
    private  float under;

    ///  	over odd for the line given by "limit"
    @SerializedName("HgeAgeRatio_2HT")
    private  float hgeAgeRatio_2HT;

    ///  	over odd for the line given by "limit"
    @SerializedName("Is applied bias")
    private  float isAppliedB;

    ///  	over odd for the line given by "limit"
    @SerializedName("1st half draw inflation ratio")
    private  float  firstHalfDr;

    ///  	over odd for the line given by "limit"
    @SerializedName("X")
    private  float x;

    ///  	over odd for the line given by "limit"
    @SerializedName("Dispersion")
    protected   float dispersion;

    public MapSoccer(float limit, float asianHandicapHalfs, float over, float marginSetID, float asianTotals, float yes, float hgeAgeRatio_1HT, float no, float trailingMargin, float asianTotalsHalfs, float secondDraw, float two, float asianHandicaps, float one, float under, float hgeAgeRatio_2HT, float isAppliedB, float firstHalfDr, float x, float dispersion) {
        // TODO: 6/16/16  Add test to constructor to make it more safe
        this.limit = limit;
        this.asianHandicapHalfs = asianHandicapHalfs;
        this.over = over;

        this.marginSetID = marginSetID;
        this.asianTotals = asianTotals;
        this.yes = yes;
        this.hgeAgeRatio_1HT = hgeAgeRatio_1HT;
        this.no = no;
        this.trailingMargin = trailingMargin;
        this.asianTotalsHalfs = asianTotalsHalfs;
        this.secondDraw = secondDraw;
        this.two = two;
        this.asianHandicaps = asianHandicaps;
        this.one = one;
        this.under = under;
        this.hgeAgeRatio_2HT = hgeAgeRatio_2HT;
        this.isAppliedB = isAppliedB;
        this.firstHalfDr = firstHalfDr;
        this.x = x;
        this.dispersion = dispersion;
    }

}

