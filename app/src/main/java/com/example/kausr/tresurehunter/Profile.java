package com.example.kausr.tresurehunter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by honey on 2/12/17.
 */

public class Profile extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name=(TextView) findViewById(R.id.name1);
        String username=getIntent().getExtras().getString("name");
        name.setText(username);

    }
    public void Monument(View view)
    {
        Intent i=new Intent(getApplicationContext(),Monu.class);
        startActivity(i);

    }
}
