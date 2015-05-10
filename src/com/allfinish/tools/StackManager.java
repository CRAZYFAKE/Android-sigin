package com.allfinish.tools;

import java.util.Stack;
import android.app.Activity;

public class StackManager {
	@SuppressWarnings("rawtypes")
	private static Stack mActivityStack;
	private static StackManager mInstance;

	public static StackManager getStackManager() {
		if (mInstance == null) {
			mInstance = new StackManager();
		}
		return mInstance;
	}

	public void popActivity(Activity activity) {
		if (activity != null) {
			activity.finish();
			mActivityStack.remove(activity);
			activity = null;
		}
	}

	public Activity currentActivity() {
		if (mActivityStack == null || mActivityStack.size() == 0) {
			return null;
		}
		Activity activity = (Activity) mActivityStack.lastElement();
		return activity;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void pushActivity(Activity activity) {
		if (mActivityStack == null) {
			mActivityStack = new Stack();
		}
		mActivityStack.add(activity);
	}

	@SuppressWarnings("rawtypes")
	public void popTopActivitys(Class clsss) {
		while (true) {
			Activity activity = currentActivity();
			if (activity == null) {
				break;
			}
			if (activity.getClass().equals(clsss)) {
				break;
			}
			popActivity(activity);
		}
	}

	public void popAllActivitys() {
		while (true) {
			Activity activity = currentActivity();
			if (activity == null) {
				break;
			}
			popActivity(activity);
		}
	}
}
