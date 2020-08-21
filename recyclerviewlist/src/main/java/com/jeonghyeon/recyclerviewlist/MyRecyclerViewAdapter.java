package com.jeonghyeon.recyclerviewlist;

import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
