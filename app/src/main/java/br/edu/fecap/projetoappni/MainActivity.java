package br.edu.fecap.projetoappni;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {




    int[] listaImg = {R.drawable.hmb, R.drawable.hamburguer, R.drawable.img };
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;



        //Instanciamento do AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar título E mensagem
        dialog.setTitle("Bem-Vindo!");
        dialog.setMessage("Monte seu Pedido");

        dialog.setIcon(android.R.drawable.presence_online);

        //Configurar ações para Sim e Não:
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Usuário clicou no OK",
                        Toast.LENGTH_LONG
                ).show();

            }
        });


        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }

    public  void alterarLanche(View view){
        ImageView imgLancheInicial = findViewById(R.id.imageView);

        if(contador == 2){
            contador = 0;
        }else{
            contador++;
        }


        imgLancheInicial.setImageResource(listaImg[contador]);
    }

}