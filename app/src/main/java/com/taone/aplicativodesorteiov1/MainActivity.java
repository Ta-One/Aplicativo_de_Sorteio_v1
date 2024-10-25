package com.taone.aplicativodesorteiov1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortearNumero(View view){
        // Define uma função pública chamada "sortearNumero" que recebe um objeto View como argumento.
        // Essa função é geralmente chamada quando um botão é clicado em um layout XML,
        // e o objeto View passado como argumento representa o botão que foi clicado.

        TextView num = findViewById(R.id.resultado);
        // Declara uma variável chamada "num" do tipo TextView e a inicializa
        // usando findViewById(R.id.resultado).
        // findViewById é um método que busca um elemento de interface (View) no layout
        // atual da activity pelo seu ID.
        // Nesse caso, está buscando um TextView com o ID "resultado" definido no layout XML.
        // A variável "num" agora representa esse TextView encontrado.

        int numero = new Random().nextInt(101);
        // Declara uma variável chamada "numero" do tipo inteiro e a inicializa
        // com um número aleatório entre 0 e 100 (inclusive).
        // new Random() cria um objeto da classe Random, que é usada para gerar números aleatórios.
        // nextInt(101) é um método da classe Random que retorna um número aleatório
        // entre 0 (inclusive) e o valor passado como argumento (exclusive).
        // Nesse caso, como passamos 101, o número aleatório gerado será entre 0 e 100.

        num.setText("O número sorteado foi: " + numero);
        // Define o texto do TextView "num" (que foi encontrado pelo ID "resultado")
        // para a string "O número sorteado foi: " concatenada com o valor da variável "numero".
        // setText() é um método da classe TextView que define o texto exibido pelo TextView.
        // A concatenação com "+" junta a string "O número sorteado foi: " com o valor
        // numérico da variável "numero", formando a mensagem final a ser exibida no TextView.
    }
}