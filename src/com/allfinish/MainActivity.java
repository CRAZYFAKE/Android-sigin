package com.allfinish;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.allfinish.base.BaseActivity;

public class MainActivity extends BaseActivity implements OnClickListener {
	public Button btn_method_first;
	public Button btn_method_second;
	public Button btn_method_third;
	public Button btn_method_fourth;
	public Button btn_method_fifth;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initView();
	}

	private void initView() {
		btn_method_first = (Button) findViewById(R.id.btn_method_first);
		btn_method_second = (Button) findViewById(R.id.btn_method_second);
		btn_method_third = (Button) findViewById(R.id.btn_method_third);
		btn_method_fourth = (Button) findViewById(R.id.btn_method_fourth);
		btn_method_fifth = (Button) findViewById(R.id.btn_method_fifth);
		btn_method_first.setOnClickListener(this);
		btn_method_second.setOnClickListener(this);
		btn_method_third.setOnClickListener(this);
		btn_method_fourth.setOnClickListener(this);
		btn_method_fifth.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_method_first:
			startActivity(new Intent(INTENT_METHOD_FIRST_SINGUP));
			break;
		case R.id.btn_method_second:
			startActivity(new Intent(INTENT_METHOD_SECOND_SINGUP));
			break;
		case R.id.btn_method_third:
			startActivity(new Intent(INTENT_METHOD_THIRD_SINGUP));
			break;
		case R.id.btn_method_fourth:
			startActivity(new Intent(INTENT_METHOD_FOURTH_SINGUP));
			break;
		case R.id.btn_method_fifth:
			startActivity(new Intent(INTENT_METHOD_FIFTH_SINGUP));
			break;
		default:
			break;
		}
	}

}
