package cl.desafiolatam.desafiopregunta.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("response_code")
    private int responseCode;

    public List<Question> getResults() {
        return results;
    }

    private List<Question> results;

    public int getResponseCode(){
        return responseCode;
    }
}
