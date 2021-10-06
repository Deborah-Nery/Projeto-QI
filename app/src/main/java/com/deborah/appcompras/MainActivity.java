package com.deborah.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkFeijao, chkLeite, chkMacarrao, chkFafora, chkRefrigerante, chkBatataFrita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkFeijao = (CheckBox) findViewById(R.id.checkFeijao);
        chkLeite = (CheckBox) findViewById(R.id.checkLeite);
        chkMacarrao = (CheckBox) findViewById(R.id.checkMacarrao);
        chkFafora = (CheckBox) findViewById(R.id.checkFarofa);
        chkRefrigerante = (CheckBox) findViewById(R.id.checkRefrigerante);
        chkBatataFrita = (CheckBox) findViewById(R.id.checkBatataFrita);

        Button btTotal = (Button) findViewById(R.id.btTotal);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                String selecionados  = "Itens Selecionados: ";
                if(chkFeijao.isChecked()){
                    total += 2.69;
                selecionados = selecionados.concat("\n - Feijão R$ 2,69"); }
                if(chkLeite.isChecked()){
                    total += 2.70;
                    selecionados = selecionados.concat("\n - Leite R$ 2,70"); }
                if(chkMacarrao.isChecked()){
                    total += 16.70;
                    selecionados = selecionados.concat("\n - Macarrão R$ 16,70"); }
                if(chkFafora.isChecked()){
                    total += 3.38;
                    selecionados = selecionados.concat("\n - Farofa - R$ 3,38");}
                if(chkRefrigerante.isChecked()){
                    total += 3.00;
                    selecionados = selecionados.concat("\n - Refrigerante R$ 5,00");}
                if(chkBatataFrita.isChecked()){
                    total += 5.00;
                    selecionados = selecionados.concat("\n - Batata Frita R$ 5,00");}



                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Itens Selecionados e Total: ");
                dialogo.setMessage(selecionados + "\n \nValor total das compras: \nR$ "+ String.valueOf(total));
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });


    }
}