package com.allfinish.method.fifth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.allfinish.base.BaseActivity;
import com.allfinish.R;

/**
 * @author RA
 * @描述 注册界面：
 * @方法 方法5：
 */
public class SignUpActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		initView();
	}

	private void initView() {
		Button btn_signup = (Button)findViewById(R.id.btn_signup);
		btn_signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),FirstStep.class);
				startActivity(intent);
			}
		});
	}
}
