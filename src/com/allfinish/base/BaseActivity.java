package com.allfinish.base;


import com.allfinish.tools.StackManager;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BaseActivity extends Activity {
	/** 方法1对应的注册界面 */
	public final static String INTENT_METHOD_FIRST_SINGUP = "com.allfinish.method.first.signupactivity";
	/** 方法2对应的注册界面 */
	public final static String INTENT_METHOD_SECOND_SINGUP = "com.allfinish.method.second.signupactivity";
	/** 方法3对应的注册界面 */
	public final static String INTENT_METHOD_THIRD_SINGUP = "com.allfinish.method.third.signupactivity";
	/** 方法4对应的注册界面 */
	public final static String INTENT_METHOD_FOURTH_SINGUP = "com.allfinish.method.fourth.signupactivity";
	/** 方法5对应的注册界面 */
	public final static String INTENT_METHOD_FIFTH_SINGUP = "com.allfinish.method.fifth.signupactivity";
	/** 退出广播对应的ACTION*/
	public final static String INIENT_FINISH = "com.allfinish.method.finish";
	
	public StackManager mStackManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	/**
	 * 初始化退出广播
	 */
	public void initFinishReceiver() {
		IntentFilter filter = new IntentFilter();
		filter.addAction(INIENT_FINISH);
		registerReceiver(mFinishReceiver, filter);
	}
	
	/**
	 * 监听是否退出的广播
	 */
	public BroadcastReceiver mFinishReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			if (INIENT_FINISH.equals(intent.getAction())) {
				finish();
			}
		}
	};
	
	/** 关闭时候的requestCode请求码 */
	public final static int FINISH_REQUESTCODE = 1;
	/** 关闭时候的resultCode请求码 */
	public final static int FINISH_RESULTCODE = 1;
	/**
	 * 方法5通过回调关闭的时候用到
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if(requestCode == FINISH_REQUESTCODE ){
			if(resultCode == FINISH_RESULTCODE){
				setResult(FINISH_RESULTCODE);
				finish();
			}
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}
