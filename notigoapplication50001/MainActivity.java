package com.example.notigoapplication50001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.notigoapplication50001.services.ServiceContainer;
import com.example.notigoapplication50001.services.user.User;
import com.example.notigoapplication50001.services.user.UserService;

public class MainActivity extends AppCompatActivity {
    ImageView updateImage;
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        updateImage = findViewById(R.id.UpdateImage);
        userService = ServiceContainer.getUserService();

        // onclick
        // userService.login(getText(), getText())
        final Button loginButton = findViewById(R.id.loginButton);
        final EditText emailInput =  findViewById(R.id.emailInput);
        final EditText passwordINput = findViewById(R.id.passwordInput);

        loginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String password = emailInput.getText().toString();
                User attemptedUser = userService.login(email, password);
                if(attemptedUser == null){
                    Toast.makeText(MainActivity.this,
                            "Wrong credentials!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this, "Welcome " + attemptedUser.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }
}