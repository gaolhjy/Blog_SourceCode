package com.bws.activitydemo.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.bws.activitydemo.R;

public class A1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a1_layout);
		
		TextView tv_text = (TextView) findViewById(R.id.tv_text);
		tv_text.setText(this.toString());
		
		Button btn_goA1 = (Button) findViewById(R.id.btn_goA1);
		btn_goA1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(A1.this, A1.class);
				startActivity(intent);
			}
		});
	}

}
