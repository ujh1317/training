package com.jeonghyeon.recyclerviewlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<MemberDTO> memberDTOs = new ArrayList<>();
    public MyRecyclerViewAdapter() {
        memberDTOs.add(new MemberDTO(R.drawable.image_1,"1","hihihi"));
        memberDTOs.add(new MemberDTO(R.drawable.image_1,"2","hahahah"));
        memberDTOs.add(new MemberDTO(R.drawable.image_1,"3","byebyebye"));

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // XML 가져오는 부분
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new Rowcell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // 데이터를 넣어주는 부분

    }

    @Override
    public int getItemCount() {
        // 카운터

        return 0;
    }

    private class Rowcell extends RecyclerView.ViewHolder {

        public Rowcell(View view) {
            super(view);
        }
    }
}
