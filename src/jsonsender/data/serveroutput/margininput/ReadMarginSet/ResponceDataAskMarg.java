package jsonsender.data.serveroutput.margininput.ReadMarginSet;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serveroutput.Responce;
import jsonsender.data.serveroutput.margininput.AskListMargin.ResponceAskListM;

/**
 * Read Margin Set
 */
public class ResponceDataAskMarg extends Responce {


        @SerializedName("Data")
        private ResponceAskMargins data;

        @SerializedName("Error")
        private  String error;

        public ResponceDataAskMarg(ResponceAskMargins data, String error) {
            this.data = data;
            this.error = error;
        }
}
