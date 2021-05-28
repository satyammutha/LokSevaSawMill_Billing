package com.example.loksevasaw_mill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class entcustname extends Activity{
TextView t1;
EditText e1;
Button b1;
public String custname;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entcustname);
		t1=(TextView)findViewById(R.id.textView1_qty);
		e1=(EditText)findViewById(R.id.editText33);
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			custname=e1.getText().toString();
			Intent i=new Intent(entcustname.this,orderpg.class);
			i.putExtra("custname", e1.getText().toString());
			startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
