package com.allfinish.method.fifth;

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
	}

	private void initView() {
		Button btn_finish = (Button) findViewById(R.id.btn_finish);
		btn_finish.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setResult(FINISH_RESULTCODE);
				finish();
			}
		});
	}
}
