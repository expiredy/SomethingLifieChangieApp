package com.example.cloudyapplicationgobrrrrrrr;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudyapplicationgobrrrrrrr.LayoutElements.NavigationButtonActivity;

public class HomePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_layouts);
        this.setActivityForLayoutElements();
    }

    private void setActivityForLayoutElements() {
        findViewById(R.id.home_page_button).setOnClickListener( new NavigationButtonActivity(this, new HomePageActivity()));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}

