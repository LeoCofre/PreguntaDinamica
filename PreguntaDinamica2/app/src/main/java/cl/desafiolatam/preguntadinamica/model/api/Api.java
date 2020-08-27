package cl.desafiolatam.preguntadinamica.model.api;

import cl.desafiolatam.preguntadinamica.model.PreguntaPojo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api.php?amount=1&category=18&difficulty=medium&type=boolean")
    Call<PreguntaPojo> llamarPregunta();

}
