package edu.sicsr.eventhandling;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btnclick;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnclick=(Button) findViewById(R.id.btnclick);
		OnClickListener listener=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnclick.setText("button was clicked");
			}
		};
		btnclick.setOnClickListener(listener);
	}
}
