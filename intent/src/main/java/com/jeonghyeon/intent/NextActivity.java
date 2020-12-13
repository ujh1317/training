package com.jeonghyeon.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        final TextView textView = findViewById(R.id.user_name);
        textView.setText(getIntent().getStringExtra("id"));

        Button button = findViewById(R.id.btn_close);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("logout_user", textView.getText().toString()+"님이 로그아웃 하셨습니다.");
                setResult(20,intent);
                finish();
            }
        });
    }
}