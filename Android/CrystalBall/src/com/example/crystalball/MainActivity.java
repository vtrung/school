package com.example.crystalball;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final CrystalBall mCrystalBall = new CrystalBall();
        //Declaring Variables
        final TextView mainTextLabel = (TextView)findViewById(R.id.textView1);
        Button mainButton = (Button)findViewById(R.id.button1);
        
        mainButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				mainTextLabel.setText(mCrystalBall.get_answer());
			}
			
		} );
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
