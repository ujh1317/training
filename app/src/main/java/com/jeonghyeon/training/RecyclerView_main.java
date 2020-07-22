package com.jeonghyeon.training;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerView_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        RecyclerView view = (RecyclerView) findViewById(R.id.main_recyclerview);

        // 그리드뷰로 만들것으로 정의하는 부분
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        view.setLayoutManager(layoutManager);

        // 어댑터를 연결시켜주는 부분
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
        view.setAdapter(recyclerViewAdapter);

    }


}
