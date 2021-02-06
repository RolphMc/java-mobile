package com.rolph.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//IMPLEMENTS - É USADO PARA PERMITIR QUE UMA CLASS SE COMPORTE COMO UMA INTERFACE (RECEBE OS ATRIBUTOS DE UM ONCLICK POR EXEMPLO)

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //O 'M' EN FRENTE AO MVIEWHOLDER AJUDA A IDENTIFICAR TODAS AS VAR CRIADAS PELO PROGRAMADOR
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ONCREATE É A INSTANCIA QUE CRIA A INTERFACA DO APK, CASO AS VAR FOREM CRIADAS ANTES, OS ELEMENTOS AINDA NÃO ESTARÃO CARREGADOS.

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calculate){

            //CÓDIGO PARA BUSCA DO VALOR
            String value = this.mViewHolder.editValue.getText().toString();
            //toString - Serve para converter o valor obrigatóriamente em string
            if ("".equals(value)){
                Toast.makeText(this, this.getString(R.string.Informe_valor), Toast.LENGTH_LONG).show();
            } else {
                Double real = Double.valueOf(value);

                this.mViewHolder.textDolar.setText(String.format("%.2f",(real/4.63)));
                this.mViewHolder.textEuro.setText(String.format("%.2f",(real/5.27)));
            }
        }
    }

    //
    private void clearValues () {
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    //STATIC GARANTE QUE UMA CLASSE SEJA CHAMADA APENAS UMA ÚNICA VEZ
    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;
    }
}
