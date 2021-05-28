package com.example.loksevasaw_mill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpg extends Activity{
TextView t1,t2;
EditText e1,e2;
Button b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginpg);
		t1=(TextView)findViewById(R.id.textView1_qty);
		t2=(TextView)findViewById(R.id.textView2_len);
		e1=(EditText)findViewById(R.id.editText33);
		e2=(EditText)findViewById(R.id.editText44);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String uname=e1.getText().toString();
			String pwd=e2.getText().toString();
			if(uname.equals("admin") && pwd.equals("adminsa"))
			{
			Intent i=new Intent(loginpg.this,homepg.class);
			i.putExtra("uname", uname);
			startActivity(i);
			}
			else
			{
				Toast.makeText(getApplicationContext(), "Invalid Username/Password", Toast.LENGTH_SHORT).show();
			}
			}
		});

		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				e1.setText("");
				e2.setText("");
			}
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
