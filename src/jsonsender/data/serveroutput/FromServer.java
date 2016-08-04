package jsonsender.data.serveroutput;

import  com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

/** Responce from server on sports request */
class FromServer
{
    @SerializedName("Maxodd")
    public float maxOdd;
    @SerializedName("SBV")
    public String sBv;
    @SerializedName("Deps")
    public List<FromServer> deps = new ArrayList<>();
    @SerializedName("Outcomes")
    public List<Outcomes> outcomes = new ArrayList<>();
    @SerializedName("OT")
    public int ot ;
    @SerializedName("Level")
    public int level ;

}



