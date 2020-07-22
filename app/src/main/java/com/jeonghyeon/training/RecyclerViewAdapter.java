package com.jeonghyeon.training;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int images[] = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3};

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // XML 디자인 한 부분 적용

        // 화면의 width 를 3등분 한다
        int width = parent.getResources().getDisplayMetrics().widthPixels / 3;

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);

        view.setLayoutParams(new LinearLayoutCompat.LayoutParams(width, width));

        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        // XML 디자인 한 부분 안의 내용 변경

        ((RowCell)holder).imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {

        // 아이템을 측정하는 카운터터

        return images.length;
    }

    private static class RowCell extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.recyclerview_item_imageview);
        }
    }
}
