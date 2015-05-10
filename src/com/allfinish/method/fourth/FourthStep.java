package com.allfinish.method.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.allfinish.R;
import com.allfinish.base.BaseActivity;

public class FourthStep extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fourth_step);
		initView();
		initFinishReceiver();
	}
	
	/**
	 * ���͹㲥�˳����Activity
	 */
	private void sendFinish() {
		getApplicationContext().sendBroadcast(new Intent(INIENT_FINISH));
	}

	private void initView() {
		Button btn_finish = (Button) findViewById(R.id.btn_finish);
		btn_finish.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendFinish();
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
