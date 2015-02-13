package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = (Button) findViewById(R.id.btnShowResults);

        calculate.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
//                setupActivity();
                Intent i = new Intent(MainActivity.this, ResultsActivity.class);

                startActivity(i);
            }
        });
    }

//    public void setupActivity() {
//        Intent i = new Intent(this, ResultsActivity.class);
//        startActivity(i);
//    }

//    public void onClick(){
//        Intent i = new Intent(this, ResultsActivity.class);
//        startActivity(i);
//    }
}
