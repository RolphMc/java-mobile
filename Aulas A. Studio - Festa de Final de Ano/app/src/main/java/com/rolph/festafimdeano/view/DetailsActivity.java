package com.rolph.festafimdeano.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.rolph.festafimdeano.R;
import com.rolph.festafimdeano.constant.FimDeAnoConstants;
import com.rolph.festafimdeano.data.SecurityPreferences;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private viewHolder mViewHolder = new viewHolder();
    /*Instanciar qualquer coisa que use o "This" em contexto, se estiver fora do método, não funcionará, nesse caso somente
    após o onCreate e o contentView*/
    private SecurityPreferences mSecurityPreferences; //= new SecurityPreferences(this); [A] - ao invés de usa-lo aqui

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mSecurityPreferences = new SecurityPreferences(this); //[A] - usa-se aqui após carregar procedimentos

        this.mViewHolder.checkParticipate = findViewById(R.id.check_participate);
        this.mViewHolder.checkParticipate.setOnClickListener(this);

        this.loadDataFromActivit();

    }

    private void loadDataFromActivit() {
        // getExtras retorna uma variável do tipo Bundle
        Bundle extras = getIntent().getExtras();
        //Verificação de segurança no caso de ter diversas activits e a váriável de alguma forma vier descarregada
        if (extras != null) {
            String presence = extras.getString(FimDeAnoConstants.PRESENCE_KEY);
            if (presence != null && presence.equals(FimDeAnoConstants.CONFIRMATION_YES)) {
                this.mViewHolder.checkParticipate.setChecked(true);
            } else {
                this.mViewHolder.checkParticipate.setChecked(false);
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.check_participate) {

            if (this.mViewHolder.checkParticipate.isChecked()) {
                //Salvar a presença
                this.mSecurityPreferences.storeString(FimDeAnoConstants.PRESENCE_KEY, FimDeAnoConstants.CONFIRMATION_YES);
            } else {
                //Salvar a ausência
                this.mSecurityPreferences.storeString(FimDeAnoConstants.PRESENCE_KEY, FimDeAnoConstants.CONFIRMATION_NO);
            }

        }
    }

    private static class viewHolder {
        CheckBox checkParticipate;
    }
}
