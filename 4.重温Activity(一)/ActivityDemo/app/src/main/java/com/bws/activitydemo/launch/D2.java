package com.bws.activitydemo.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.bws.activitydemo.R;

public class D2 extends Activity {
	
	TextView tv_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
setContentView(R.layout.d_layout);
		
		tv_text = (TextView) findViewById(R.id.tv_text);
		tv_text.setText(this.toString() + "  taskId: " + getTaskId());
		
		Button btn_goD1 = (Button) findViewById(R.id.btn_goD1);
		btn_goD1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(D2.this, D1.class);
				startActivity(intent);
			}
		});
		Button btn_goD2 = (Button) findViewById(R.id.btn_goD2);
		btn_goD2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(D2.this, D2.class);
				startActivity(intent);
			}
		});
		Button btn_goD3 = (Button) findViewById(R.id.btn_goD3);
		btn_goD3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(D2.this, D3.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("D2 call onDestory()");
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		
		tv_text.setText(this.toString() + "  taskId: " + getTaskId() + "\n" + "onNewIntent() called");
	}

}
