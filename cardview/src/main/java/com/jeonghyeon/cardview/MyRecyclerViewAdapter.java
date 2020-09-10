package com.jeonghyeon.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<CardViewItemDTO> cardViewItemDTOs = new ArrayList<>();
    public MyRecyclerViewAdapter() {

        cardViewItemDTOs.add(new CardViewItemDTO(R.drawable.first,"첫번째","풍경1"));
        cardViewItemDTOs.add(new CardViewItemDTO(R.drawable.second,"두번째","풍경2"));
        cardViewItemDTOs.add(new CardViewItemDTO(R.drawable.third,"세번째","풍경3"));
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // xml 셋팅
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item,parent,false);
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        // 아이템 셋팅
    }

    @Override
    public int getItemCount() {

        // 이미지 카운터
        return cardViewItemDTOs.size();
    }

    private class RowCell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView title;
        public TextView subtitle;

        public RowCell(View view) {
            super(view);
            imageView = view.findViewById(R.id.cardview_imageview);
            title = view.findViewById(R.id.cardview_title);
            subtitle = view.findViewById(R.id.cardview_subtitle);
        }
    }
}
