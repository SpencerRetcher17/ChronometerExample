package com.example.sretcher.chronometerexample;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Chronometer;


    public class MainActivity extends AppCompatActivity {

        //Credit given to AbhiAndroid Website

        //Make Buttons/Chronometer

        Chronometer simpleChronometer;
        Button start, stop, restart, setFormat, clearFormat;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // Make references to buttons by id
            simpleChronometer = (Chronometer) findViewById(R.id.simpleChronometer);
            start = (Button) findViewById(R.id.startButton);
            stop = (Button) findViewById(R.id.stopButton);
            restart = (Button) findViewById(R.id.restartButton);
            setFormat = (Button) findViewById(R.id.setFormat);
            clearFormat = (Button) findViewById(R.id.clearFormat);
            // perform click  event on start button to start a chronometer
            start.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    simpleChronometer.start();
                }
            });

            // perform click  event on stop button to stop the chronometer
            stop.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    simpleChronometer.stop();
                }
            });

            // perform click  event on restart button to set the base time on chronometer
            restart.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    simpleChronometer.setBase(SystemClock.elapsedRealtime());
                }
            });

            // perform click  event on set Format button to set the format of chronometer
            setFormat.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    simpleChronometer.setFormat("Time (%s)");
                }
            });

            // perform click  event on clear button to clear the current format of chronmeter as you set through set format
            clearFormat.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    simpleChronometer.setFormat(null);
                }
            });
        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
