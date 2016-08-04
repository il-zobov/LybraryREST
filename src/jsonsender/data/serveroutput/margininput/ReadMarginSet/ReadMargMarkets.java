package jsonsender.data.serveroutput.margininput.ReadMarginSet;

import com.google.gson.annotations.SerializedName;

/**
 * Read Margin Set
 */
class ReadMargMarkets {

    @SerializedName("BalancedMargin")
    private  float balancedMargin;

    @SerializedName("BiasSeverity")
    private  float biasSeverity;

    @SerializedName("UseMargin")
    private  int useMargin;

    @SerializedName("TotalMargin")
    private  float totalMargin;

    @SerializedName("ID")
    private  int id;

    @SerializedName("BiasedMargin")
    private  float biasedMargin;

    @SerializedName("AllowNegative")
    private  int allowNegative;

    @SerializedName("Line")
    private  String line;


}
