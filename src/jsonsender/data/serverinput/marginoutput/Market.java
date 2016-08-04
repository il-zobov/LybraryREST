package jsonsender.data.serverinput.marginoutput;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilia on 7/19/16.
 */
public class Market {
    /*
    "ID": 2,

            "Line": "",

            "UseMargin": 1,

            "TotalMargin": 140,

            "AllowNegative": 0,

            "BiasSeverity": 0.65,

            "BiasedMargin": 0,

            "BalancedMargin": 40
            */


    @SerializedName("ID")
    private  int id;

    @SerializedName("Line")
    private  String line;

    @SerializedName("UseMargin")
    private  int useMargin;

    @SerializedName("TotalMargin")
    private  int totalMargin;

    @SerializedName("AllowNegative")
    private  int allowNegative;

    @SerializedName("BiasSeverity")
    private  float biasSeverity;

    @SerializedName("BiasedMargin")
    private  float biasedMargin;

    @SerializedName("BalancedMargin")
    private  int balancedMargin;

    public Market(int id, String line, int useMargin, int totalMargin, int allowNegative, float biasSeverity, float biasedMargin, int balancedMargin) {
        this.id = id;
        this.line = line;
        this.useMargin = useMargin;
        this.totalMargin = totalMargin;
        this.allowNegative = allowNegative;
        this.biasSeverity = biasSeverity;
        this.biasedMargin = biasedMargin;
        this.balancedMargin = balancedMargin;
    }
}
