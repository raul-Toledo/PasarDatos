package com.example.pasardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ValidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valida);

        Bundle bundle = getIntent().getExtras();
        String strUser = bundle.getString("user");
        String strPass = bundle.getString("pass");

        Intent i = new Intent();
        if(strUser.matches("raul") && strPass.matches("123")){
            i.putExtra("resul","OK");
            setResult(RESULT_OK,i);
        } else {
            i.putExtra("resul","NO");
            setResult(RESULT_CANCELED,i);
        }
        finish();
    }
}
