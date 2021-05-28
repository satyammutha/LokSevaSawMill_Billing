package com.example.loksevasaw_mill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class finalbill extends Activity{
TextView t1,t2,t3;
Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finalbill);
		t1=(TextView)findViewById(R.id.textView1_qty);
		t2=(TextView)findViewById(R.id.textView2_len);
		t3=(TextView)findViewById(R.id.textView5);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		
		Intent in=getIntent();
        String s=in.getStringExtra("custname");
        t3.setText("CUSTOMER NAME: "+s);
		
		b1.setOnClickListener(new View.OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Intent i1=new Intent(finalbill.this,billingsummery.class);
		startActivity(i1);
		}
	});
    
	b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),"Order Successfully Entered..",Toast.LENGTH_SHORT).show();
		Intent i2=new Intent(finalbill.this,vieworder.class);	
		startActivity(i2);
		}
	});
	
	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Intent i3=new Intent(finalbill.this,homepg.class);	
		startActivity(i3);
		}
	});
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
