package cn.yanweijia.eyes;

import com.baidu.mobstat.StatService;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_eyesSkill extends Activity
{
    @Override
	protected void onCreate(Bundle savedInstanceState) 
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eyesskill);
		StatService.onPageStart(this,"护眼技巧");
		Button btn_back = (Button)findViewById(R.id.button_eyesskill_back);
		btn_back.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				finish();
			}
		});
    }
    protected void onResume() 
	{
		// TODO Auto-generated method stub
		StatService.onPageEnd(this,"护眼技巧");
		super.onResume();
	}
}
