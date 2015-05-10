package com.allfinish.app;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Application;

public class AppApplication extends Application {
	private static AppApplication mAppApplication;
	public ArrayList<Activity> activityList;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mAppApplication = this;
	}

	public static AppApplication getApp() {
		if (mAppApplication == null) {
			mAppApplication = new AppApplication();
		}
		return mAppApplication;
	}

	public void addActivity(Activity acitivity) {
		if (activityList == null) {
			activityList = new ArrayList<Activity>();
		}
		activityList.add(acitivity);
	}

	public void clearActivity() {
		activityList.clear();
	}

	public void exit() {
		for (Activity activity : activityList) {
			activity.finish();
		}
		clearActivity();
		System.exit(0);
	}
}
