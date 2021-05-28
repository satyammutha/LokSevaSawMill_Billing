package com.example.loksevasaw_mill;

import com.example.loksevasaw_mill.DatabaseHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class orderpg extends Activity
{
	EditText e1,e2,e3,e4;
	int qty,len,wid,bre;
	DatabaseHandler dbh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orderpg);
		e1=(EditText)findViewById(R.id.editText11);
		e2=(EditText)findViewById(R.id.editText22);
		e3=(EditText)findViewById(R.id.editText33);
		e4=(EditText)findViewById(R.id.editText44);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
	
	public void insert(View v)
	{
		qty=Integer.parseInt(e1.getText().toString());
		len=Integer.parseInt(e2.getText().toString());
		wid=Integer.parseInt(e3.getText().toString());
		bre=Integer.parseInt(e4.getText().toString());
		
		dbh=new DatabaseHandler(getBaseContext());
		dbh.Open();
		dbh.insertdata(qty,len,wid,bre);
		Toast.makeText(getApplicationContext(), "DAta Inserted",Toast.LENGTH_SHORT).show();
		dbh.closedata();
	}	
}