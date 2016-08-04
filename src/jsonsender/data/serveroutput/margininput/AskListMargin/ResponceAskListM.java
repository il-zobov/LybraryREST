package jsonsender.data.serveroutput.margininput.AskListMargin;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serveroutput.margininput.AskListMargin.MapList;

/**
 * List all markets and market information for margin
 */
public class ResponceAskListM  {


        @SerializedName("SID")
        private  int sid;

        @SerializedName("Map")
        private MapList map;

        @SerializedName("Token")
        private String token;

        @SerializedName("RequestType")
        public int requestType;

        public ResponceAskListM(MapList markets, String token) {
                this.token = token;
                this.sid = 1;
                this.map = markets;

        }
}
