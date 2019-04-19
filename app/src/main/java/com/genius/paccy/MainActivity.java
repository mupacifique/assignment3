package com.genius.paccy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button Login;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username =(EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        Login = findViewById(R.id.ButtonLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
                String Username,Password;
                Username = username.getText().toString();
                Password = password.getText().toString();

                if (Username.equals("") && Password.equals("")){
                    Toast.makeText(MainActivity.this,"Fill the form",Toast.LENGTH_SHORT).show();
                }else if(Username.equals("Admin") && Password.equals("123456")){
                    Intent intent = new Intent(MainActivity.this,welcome.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Wrong Username or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
