package com.Jiannan.Harry.funfact;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class mainActivity extends Activity {
    private mFactBook mFact = new mFactBook();
    private mColorWheel mColor = new mColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declare our view variable and assign the view from the layout file;
        final TextView factLabel = (TextView) findViewById(R.id.funFactTextView);
        final Button showFactButton = (Button) findViewById(R.id.funFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.backgroundScreen);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //the button is clicked so the text will be up dated
                int color = mColor.GetColors();
                String fact = "";
                fact = mFact.getFacts();
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        Toast.makeText(this, "testing", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
