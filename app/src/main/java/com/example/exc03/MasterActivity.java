package com.example.exc03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MasterActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_master ,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sP)
        {
            intent = new Intent(getApplicationContext() , MainActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.rF)
        {
            intent = new Intent(getApplicationContext() , RawActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.iF)
        {
            intent = new Intent(getApplicationContext() , InternalActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.eF)
        {
            intent = new Intent(getApplicationContext() , ExternalActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}