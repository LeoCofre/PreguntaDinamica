package cl.desafiolatam.preguntadinamica.model;

import java.util.List;

public class PreguntaPojo {
    int response_code;
    List<Pregunta> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<Pregunta> getResults() {
        return results;
    }

    public void setResults(List<Pregunta> results) {
        this.results = results;
    }
}
