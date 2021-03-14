package com.rolph.festafimdeano.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.rolph.festafimdeano.R;
import com.rolph.festafimdeano.constant.FimDeAnoConstants;
import com.rolph.festafimdeano.data.SecurityPreferences;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // abaixo temos uma INSTÂNCIA quando oportuno, entender melhor como funciona as hierarquias das nomeclaturas
    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;
    //Variável que receberá a data;
    private static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSecurityPreferences = new SecurityPreferences(this);

        /*findViewById - Localiza uma exibição que foi identificada pelo atributo id do XML que
        foi processado no OnCreate (Bundle) . */
        this.mViewHolder.textToday = findViewById(R.id.text_today);
        this.mViewHolder.textDaysLeft = findViewById(R.id.text_day_left);
        this.mViewHolder.buttonConfirm = findViewById(R.id.button_confirm);

        this.mViewHolder.buttonConfirm.setOnClickListener(this);

        //DATA ATUAL
        this.mViewHolder.textToday.setText(SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()));
        String daysLeft = String.format("%s %s", String.valueOf(this.getDaysLeft()), getString(R.string.dias));
        this.mViewHolder.textDaysLeft.setText(daysLeft);

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.verifyPresence();
    }

    @Override
    public void onClick(View v) {

        String presence = this.mSecurityPreferences.getStoreString(FimDeAnoConstants.PRESENCE_KEY);

        if (v.getId() == R.id.button_confirm) {
            //chama uma INTENÇÃO
            Intent intent = new Intent(this, DetailsActivity.class);
            //putExtra - Carrega dados para a activit destino
            intent.putExtra(FimDeAnoConstants.PRESENCE_KEY,presence);
            //INICIA a intenção
            startActivity(intent);
        }
    }

    public void verifyPresence() {
        //não confirmado - Usuário acabou de instalar o APK (não existe a resposta)
        //Sim - Usuário confirmou a presença
        //Não - Usuário confirmou a ausencia
        String presence = this.mSecurityPreferences.getStoreString(FimDeAnoConstants.PRESENCE_KEY);
        if (presence.equals("")) {
            this.mViewHolder.buttonConfirm.setText(getString(R.string.nao_confirmado));
        } else if (presence.equals(FimDeAnoConstants.CONFIRMATION_YES)){
            this.mViewHolder.buttonConfirm.setText(getString(R.string.sim));
        } else {
            this.mViewHolder.buttonConfirm.setText(getString(R.string.não));
        }

    }

    //Método para calcular os dias restantes para o fim do ano
    private int getDaysLeft (){
        //Data de Hoje
        Calendar calendarToday = Calendar.getInstance();
        int today = calendarToday.get(Calendar.DAY_OF_YEAR);
        //Dia máx do Ano
        //[1-365]
        Calendar calendarLastDay = Calendar.getInstance();
        int dayMax = calendarLastDay.getActualMaximum(Calendar.DAY_OF_YEAR);

        return dayMax - today;
    }

    // lembrar o que significa o STATIC
    private static class ViewHolder {
        TextView textToday;
        TextView textDaysLeft;
        Button buttonConfirm;

    }
}
