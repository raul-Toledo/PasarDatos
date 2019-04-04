package com.example.pasardatos;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btLogin;
    EditText edUser, edPass;
    TextView txNombre;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 2019 && resultCode == RESULT_OK){
            Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"NO VALIDO", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String strNombe ="";

        btLogin = (Button)findViewById(R.id.btLogin);
        edPass = (EditText)findViewById(R.id.edtPass);
        edUser = (EditText)findViewById(R.id.edtUser);
        txNombre = (TextView)findViewById(R.id.txvNombre);

        Bundle bundle = getIntent().getExtras();
        strNombe = bundle.getString("nombre");

        txNombre.setText("Hola: " + strNombe);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ValidaActivity.class);
                i.putExtra("user",edUser.getText().toString());
                i.putExtra("pass", edPass.getText().toString());
                startActivityForResult(i,2019);
            }
        });
    }
}
