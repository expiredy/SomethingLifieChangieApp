package com.example.cloudyapplicationgobrrrrrrr;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AppRunner extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        if (this.checkForLogin()){
            Intent newIntent = new Intent(this, HomePageActivity.class);
            startActivity(newIntent);
        }
    }

    private boolean checkForLogin() {
        return true;
    }
}
