package com.app.zoomclone.welcome;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;

import com.app.zoomclone.R;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private TextView textViewSignup, textViewSignIn;
    private AppCompatButton buttonJoinMeeting;
    private SpringDotsIndicator dotsIndicator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        initViews();
        clickListener();
        setPagerAdapter();
    }

    private void setPagerAdapter() {
        viewPager.setAdapter(new WelcomePagerAdapter(this,getSupportFragmentManager()));
        dotsIndicator.setViewPager(viewPager);
    }


    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        textViewSignup = findViewById(R.id.textViewSignup);
        textViewSignIn = findViewById(R.id.textViewSignIn);
        buttonJoinMeeting = findViewById(R.id.btnJoinMeeting);
        dotsIndicator = findViewById(R.id.dots_indicator);

    }

    private void clickListener() {
        textViewSignup.setOnClickListener(this);
        textViewSignIn.setOnClickListener(this);
        buttonJoinMeeting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.textViewSignup:

                break;
            case R.id.textViewSignIn:

                break;
            case R.id.btnJoinMeeting:

                break;


        }

    }
}
