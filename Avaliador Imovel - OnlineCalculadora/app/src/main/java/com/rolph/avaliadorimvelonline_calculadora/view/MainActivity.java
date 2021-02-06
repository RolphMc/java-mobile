package com.rolph.avaliadorimvelonline_calculadora.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rolph.avaliadorimvelonline_calculadora.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//ATRIBUTOS
    private Button buttonApartamento;
    private Button buttonCasa;
    private TextView textHelp;

//MÉTODOS ESPECÍFICOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setButtonApartamento((Button) findViewById(R.id.button_apartamento));
        this.setButtonCasa((Button) findViewById(R.id.button_casa));
        this.setTextHelp((TextView) findViewById(R.id.help_main));

        this.getButtonApartamento().setOnClickListener(this);
        this.getTextHelp().setOnClickListener(this);

        getButtonCasa().setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_apartamento){
            Intent intent = new Intent (this, DetailsActivit.class);
            startActivity(intent);
        } else if (v.getId() == R.id.help_main){
            Intent intent = new Intent (this, HelpActivity.class);
            String mainTitle = getString(R.string.help_sobre_title);
            String mainText = getString(R.string.help_sobre_body);
            intent.putExtra("help_main_title", mainTitle);
            intent.putExtra("help_main_text", mainText);
            startActivity(intent);
        }
    }

//MÉTODOS ESPECIAIS
    public Button getButtonApartamento() {
        return buttonApartamento;
    }
    public void setButtonApartamento(Button buttonApartamento) {
        this.buttonApartamento = buttonApartamento;
    }

    public Button getButtonCasa() {
        return buttonCasa;
    }
    public void setButtonCasa(Button buttonCasa) {
        this.buttonCasa = buttonCasa;
    }

    public TextView getTextHelp() {
        return textHelp;
    }
    public void setTextHelp(TextView textHelp) {
        this.textHelp = textHelp;
    }
}
