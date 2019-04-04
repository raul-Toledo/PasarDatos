package com.example.pasardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btOk;
    EditText edNname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOk=(Button)findViewById(R.id.btNombre);
        edNname=(EditText)findViewById(R.id.edtNname);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                intent.putExtra("nombre",edNname.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
