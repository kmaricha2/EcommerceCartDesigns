package com.tutorialsee.database.http;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.tutorialsee.database.R;
import com.tutorialsee.database.R.layout;
import com.tutorialsee.database.R.style;


public class MyProgressDialog extends Dialog {

	static MyProgressDialog dialog;

	public static MyProgressDialog show(Context context) {
		dialog = new MyProgressDialog(context);
		dialog.setCancelable(false);
		
		dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
		dialog.getWindow().setDimAmount(0.6f);
		dialog.addContentView(new ProgressBar(context), new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		
		dialog.show();
		dialog.setContentView(layout.base_layout);
		return dialog;
	}

	public MyProgressDialog(Context context) {

		super(context, style.NewDialog);
	}

	public static void close(Context context) {
		if (dialog.isShowing() || dialog != null) {
			dialog.dismiss();
		}

	}
	
	
}