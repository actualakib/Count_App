package com.akiblabs.counter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class user_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText username;
        EditText blood_group;
        EditText phone;
        EditText gmail;
        Button save_button;

        TextView output_username;
        TextView output_blood_group;
        TextView output_phone;
        TextView output_gmail;

        username = findViewById(R.id.enter_name);
        blood_group = findViewById(R.id.enter_blood);
        phone = findViewById(R.id.enter_number);
        gmail = findViewById(R.id.enter_email);
        save_button = findViewById(R.id.save_info);

        output_username = findViewById(R.id.display_name);
        output_blood_group = findViewById(R.id.display_blood);
        output_phone = findViewById(R.id.display_phone);
        output_gmail = findViewById(R.id.display_email);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getText().toString() returns the user input
                String nameText = username.getText().toString().trim();
                String bloodText = blood_group.getText().toString().trim();
                String phoneText = phone.getText().toString().trim();
                String gmailText = gmail.getText().toString().trim();

                output_username.setText(""+nameText);
                output_phone.setText(""+phoneText);
                output_blood_group.setText(""+bloodText);
                output_gmail.setText(""+gmailText);
            }
        });


    }
}