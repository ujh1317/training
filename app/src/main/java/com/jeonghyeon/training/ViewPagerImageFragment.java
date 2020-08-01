package com.jeonghyeon.training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewPagerImageFragment extends Fragment{

    public static ViewPagerImageFragment newInstance(int imageUrl) {
        
        Bundle args = new Bundle();
        args.putInt("imageUrl", imageUrl);
        
        ViewPagerImageFragment fragment = new ViewPagerImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.viewpager_imagefragment,container,false);
        ImageView imageView = view.findViewById(R.id.imagefragment_imageview);
        imageView.setImageResource(getArguments().getInt("imageUrl"));

        return view;
    }
}
