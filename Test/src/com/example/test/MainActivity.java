package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		Context context = getApplicationContext();
		LinearLayout lnLay = new LinearLayout(context);
		LinearLayout lnLayPanel = new LinearLayout(context);
		LinearLayout lnLayButtons = new LinearLayout(context);
		LinearLayout lnLayUpDown = new LinearLayout(context);
		//lnLay.setLayoutParams(ViewGroup.LayoutParams);
		lnLay.setOrientation(LinearLayout.VERTICAL);
		lnLayPanel.setOrientation(LinearLayout.HORIZONTAL);
		lnLayButtons.setOrientation(LinearLayout.HORIZONTAL);
		lnLayUpDown.setOrientation(LinearLayout.VERTICAL);
		//setContentView(R.layout.activity_main);
		TestView view = new TestView(context);
		view.setLayoutParams(new LayoutParams(480, 700));
		Button btnUp = new Button(context);
		btnUp.setText("UP");
		btnUp.setLayoutParams(new LayoutParams(100, 50));
		btnUp.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		        Log.d("main", "btnUp");
		    }
		});
		
		Button btnLeft = new Button(context);
		btnLeft.setText("LEFT");
		btnLeft.setLayoutParams(new LayoutParams(95, 100));
		Button btnRight = new Button(context);
		btnRight.setText("RIGHT");
		btnRight.setLayoutParams(new LayoutParams(95, 100));
		Button btnDown = new Button(context);
		btnDown.setText("DOWN");
		btnDown.setLayoutParams(new LayoutParams(100, 50));
		Button btnOK = new Button(context);
		btnOK.setText("  OK  ");
		btnOK.setLayoutParams(new LayoutParams(90, 100));
		Button btnBack = new Button(context);
		btnBack.setText("BACK");
		btnBack.setLayoutParams(new LayoutParams(90, 100));
		
		lnLay.addView(view);
		lnLay.addView(lnLayPanel);
		lnLayPanel.setGravity(Gravity.CENTER);
		lnLayPanel.setGravity(Gravity.CENTER);
		lnLayPanel.addView(lnLayButtons);
		lnLayPanel.addView(btnOK);
		lnLayPanel.addView(btnBack);
		lnLayButtons.addView(btnLeft);
		lnLayButtons.setGravity(Gravity.CENTER);
		lnLayUpDown.addView(btnUp);
		lnLayUpDown.addView(btnDown);
		lnLayButtons.addView(lnLayUpDown);
		lnLayButtons.addView(btnRight);
		//lnLay.addView(btn3);
		//lnLay.addView(btn4);
		setContentView(lnLay);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
