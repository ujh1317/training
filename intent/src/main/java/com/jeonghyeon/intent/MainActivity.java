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
                        startActivityForResult(intent,10);
                    }else{
                    }
                }
            });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //만약 requestcode가 10이고 requestcode가 20인 경우 이 코드는 로그아웃한 사람이 누군지 알려주는 텍스트뷰를 작성
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && requestCode == 20) {

        }

    }
}
