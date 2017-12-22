package com.bws.activitydemo.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.bws.activitydemo.R;

public class C3 extends Activity {
	
	TextView tv_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c_layout);
		
		tv_text = (TextView) findViewById(R.id.tv_text);
		tv_text.setText(this.toString() + "  taskId: " + getTaskId());
		
		Button btn_goC1 = (Button) findViewById(R.id.btn_goC1);
		btn_goC1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(C3.this, C1.class);
				startActivity(intent);
			}
		});
		Button btn_goC2 = (Button) findViewById(R.id.btn_goC2);
		btn_goC2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(C3.this, C2.class);
				startActivity(intent);
			}
		});
		Button btn_goC3 = (Button) findViewById(R.id.btn_goC3);
		btn_goC3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(C3.this, C3.class);
				startActivity(intent);
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("C3 call onDestory()");
	}

}
