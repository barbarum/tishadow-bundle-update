/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ma.car.tishadow.bundle.update;

import ma.car.tishadow.bundle.update.tasks.BundleUpdateManager;
import ma.car.tishadow.bundle.update.tasks.TaskContext;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "TishadowBundleUpdate", id = "ma.car.tishadow.bundle.update")
public class TishadowBundleUpdateModule extends KrollModule {

	private static final String TAG = "TishadowBundleUpdateModule";

	public static final long BACKWARD_COMPATIBLE_UID = 1L;

	public TishadowBundleUpdateModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {

		// Do some stuff when the app is created.
		Log.i(TAG, "Tishadow Bundule Update Module loaded.");

	}

	// Public methods
	public void sendBundleUpdateRequest() {

	}

	@Kroll.method
	public void doBundleUpdate() {

		TaskContext context = new TaskContext(getActivity());
		context.setJavascriptContext(getKrollObject());

		new BundleUpdateManager().execute(context);
	}

	@Kroll.method
	public String getBundleUpdateState() {
		return null;
	}

}
