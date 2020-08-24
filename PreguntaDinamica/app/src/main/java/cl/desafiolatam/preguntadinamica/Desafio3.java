package cl.desafiolatam.preguntadinamica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.desafiolatam.preguntadinamica.ui.desafio3.Desafio3Fragment;

public class Desafio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desafio3_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Desafio3Fragment.newInstance())
                    .commitNow();
        }
    }
}
