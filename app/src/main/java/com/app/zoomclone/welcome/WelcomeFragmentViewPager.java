package com.app.zoomclone.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.app.zoomclone.R;

public class WelcomeFragmentViewPager extends Fragment {


    public static Fragment newInstanced(String title, String desc, int image) {
        WelcomeFragmentViewPager fragmentViewPager = new WelcomeFragmentViewPager();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        bundle.putString("desc",desc);
        bundle.putInt("image",image);
        fragmentViewPager.setArguments(bundle);

        return fragmentViewPager;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmet_welcome_viewpager,container,false);

        TextView textViewTitle =  view.findViewById(R.id.textViewTitle);
        TextView textViewDesc =  view.findViewById(R.id.textViewDescription);
        ImageView imageView =  view.findViewById(R.id.image);

        imageView.setBackgroundResource(getArguments().getInt("image"));
        textViewTitle.setText(getArguments().getString("title"));
        textViewDesc.setText(getArguments().getString("desc"));


        return  view;
    }
}
