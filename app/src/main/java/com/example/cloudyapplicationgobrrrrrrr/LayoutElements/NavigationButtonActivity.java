package com.example.cloudyapplicationgobrrrrrrr.LayoutElements;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NavigationButtonActivity implements  View.OnClickListener{
    Intent newIntend = null;

    public NavigationButtonActivity(AppCompatActivity currentActivityClass,
                                    AppCompatActivity newActivityClass){
        this.newIntend = new Intent(currentActivityClass, newActivityClass.getClass());
    }

    @Override
    public void onClick(View v) {

    }
}
