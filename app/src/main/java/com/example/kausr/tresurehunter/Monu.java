package com.example.kausr.tresurehunter;

import android.view.View;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Monu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.citypalace_description);
        final TextView tv1;
        tv1= (TextView) findViewById(R.id.textView);

        // Get reference of widgets from XML layout
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Initializing a String Array
        String[] plants = new String[]{
                "City Palce",
                "Jag Mandir",
                "Fateh Sagar Lake",
                "Lake Pichola",
                "Monsoon Palace"};
        final TextView tv=new TextView(this);

        final List<String> plantsList = new ArrayList<>(Arrays.asList(plants));

        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.spinner,plantsList){
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                if(position%2 == 1) {
                    // Set the item background color
                    tv.setBackgroundColor(Color.parseColor("#FFF9A600"));
                }
                else {
                    // Set the alternate item background color
                    tv.setBackgroundColor(Color.parseColor("#FFE49200"));
                }
                return view;
            }
        };

        /*
            public void setPrompt (CharSequence prompt)
                Sets the prompt to display when the dialog is shown.
         */
        spinner.setPrompt("Select an item");

        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        spinner.setAdapter(spinnerArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String a=parent.getItemAtPosition(position).toString();
String message;
                switch(a) {
                    case "City Palace":
                        message = getString(R.string.citypalace);
                        break;
                    case "Jag Mandir":
                        message = getString(R.string.jag);
                        break;
                    case "Fateh Sagar Lake":
                        message = getString(R.string.fateh);
                        break;
                    case "Monsoon Palace":
                        message = getString(R.string.monsoon);
                        break;
                    case "Lake Pichola":
                        message = getString(R.string.lake);
                        break;
                    default:
                        message = "";
                }
                tv1.setText(message);




            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}