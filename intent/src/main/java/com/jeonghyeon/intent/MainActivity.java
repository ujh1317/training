package com.jeonghyeon.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Button button = findViewById(R.id.btn_login);
            final EditText id = findViewById(R.id.editText_id);
            final EditText password = findViewById(R.id.editText_password);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(password.getText().toString().equals("1234")) {
                        Intent intent = new Intent(v.getContext(), NextActivity.class);
                        intent.putExtra("id",id.getText().toString());
                        startActivity(intent);
                    }else{
                    }
                }
            });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
