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
        ((Rowcell)holder).circleImageView.setImageResource(memberDTOs.get(position).image);
        ((Rowcell)holder).name.setText(memberDTOs.get(position).name);
        ((Rowcell)holder).message.setText(memberDTOs.get(position).message);
    }

    @Override
    public int getItemCount() {
        // 카운터

        return memberDTOs.size();
    }

    // 소스코드를 절약해주는 부분
    private static class Rowcell extends RecyclerView.ViewHolder {

        CircleImageView circleImageView;
        TextView name;
        TextView message;

        public Rowcell(View view) {
            super(view);
            circleImageView = view.findViewById(R.id.profile_image);
            name = view.findViewById(R.id.name);
            message = view.findViewById(R.id.message);
        }
    }
}
