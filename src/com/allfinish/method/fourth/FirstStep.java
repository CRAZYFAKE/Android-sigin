package com.allfinish.method.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.allfinish.R;
import com.allfinish.base.BaseActivity;

public class FirstStep extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_step);
		initView();
		initFinishReceiver();
	}


	private void initView() {
		Button btn_next_step = (Button) findViewById(R.id.btn_next_step);
		btn_next_step.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(),
						SecondStep.class));
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		unregisterReceiver(mFinishReceiver);
		super.onDestroy();
	}
}