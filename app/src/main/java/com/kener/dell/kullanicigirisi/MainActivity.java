package com.kener.dell.kullanicigirisi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button login,cancel;
    Context context=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText) findViewById(R.id.etKullanici);
        pass=(EditText) findViewById(R.id.etSifre);
        login=(Button) findViewById(R.id.btnGonder);
        cancel=(Button) findViewById(R.id.btnTemizle);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (user.getText().toString().equalsIgnoreCase("admin") && pass.getText().toString().equals("1234")){

                    Toast.makeText(context,"Giriş Başarılı",Toast.LENGTH_LONG).show();

                } else{
                    Toast.makeText(context,"Tekrar Deneyiniz", Toast.LENGTH_SHORT).show();
                }


            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user.setText("");
                pass.setText("");

            }
        });




    }
}
