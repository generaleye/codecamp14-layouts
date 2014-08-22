package com.generaleye.layouts;

//import com.generaleye.newhelloworld.R;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	Button swi;
	TextView header; 
	TextView texter;
	int[] he = {R.string.head1,R.string.head2,R.string.head3,R.string.head4,R.string.head5,R.string.head6,R.string.head7};
	int[] te = {R.string.text1,R.string.text2,R.string.text3,R.string.text4,R.string.text5,R.string.text6,R.string.text7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        swi = (Button)this.findViewById(R.id.Button1);
        header = (TextView)this.findViewById(R.id.Heady);
        texter  = (TextView)this.findViewById(R.id.Texty);
        setHeadText();
               
        swi.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		setHeadText();        		
        	}
        });
    }


    public void setHeadText() {
    	Random r = new Random();
		int rand = r.nextInt(7 - 0) + 0;
		header.setText(he[rand]);
		texter.setText(te[rand]);    	
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
