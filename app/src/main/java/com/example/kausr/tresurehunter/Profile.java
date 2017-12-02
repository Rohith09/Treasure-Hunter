package com.example.kausr.tresurehunter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
}
