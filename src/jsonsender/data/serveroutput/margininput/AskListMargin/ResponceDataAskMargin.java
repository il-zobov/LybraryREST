package jsonsender.data.serveroutput.margininput.AskListMargin;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serveroutput.Responce;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceAskListM;

/**
 * List all markets and market information for margin
 */
public class ResponceDataAskMargin extends Responce {
    @SerializedName("Data")
    private ResponceAskListM data;

    @SerializedName("Error")
    private  String error;

    public ResponceDataAskMargin(ResponceAskListM data, String error) {
        this.data = data;
        this.error = error;
    }
}
