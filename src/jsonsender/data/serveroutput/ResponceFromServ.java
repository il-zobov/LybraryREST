package jsonsender.data.serveroutput;

import com.google.gson.annotations.SerializedName;
import jsonsender.data.serveroutput.FromServer;

import java.util.ArrayList;
import java.util.List;


public class ResponceFromServ extends  Responce
{
    @SerializedName("Data")
    private  List<FromServer> data;
    @SerializedName("Error")
    private   String error;

    ResponceFromServ() {
        data = new ArrayList<>();
    }
}


// TODO: 6/16/16 Make legal comments to variables

