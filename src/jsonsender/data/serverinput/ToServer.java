package jsonsender.data.serverinput;






// TODO: 6/16/16 Make legal comments to variables

import com.google.gson.annotations.SerializedName;

/** Base class for all requests to server */
public abstract class ToServer
{
    /**Type of what we wont corresponds to the response  */
    @SerializedName("RequestType")
    public int requestType;
}