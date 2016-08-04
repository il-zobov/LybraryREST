package jsonsender.data.serveroutput;

import com.google.gson.annotations.SerializedName;

class Outcomes
{

   @SerializedName("Probability")
   private float probability;
    @SerializedName("Outcome")
    private String outcome;

   Outcomes(String key, float value) {
       this.outcome = key;
       this.probability = value;
   }
}



