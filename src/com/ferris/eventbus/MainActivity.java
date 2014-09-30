package com.ferris.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ferris.task.FerrisTask;
import com.ferris.task.FerrisTaskListemer;
import com.ferris.task.RequestVo;
import com.ferris.taskBeam.TestTaskBeam;

public class MainActivity extends Activity implements View.OnClickListener {
	Button button3;
	TextView textView;
	private FerrisTask ferrisTask;
	private RequestVo requestVo;
	private int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button3 = (Button) findViewById(R.id.button3);

		textView = (TextView) findViewById(R.id.textView);
		button3.setOnClickListener(this);
		
		
		
		requestVo = new RequestVo(1, this, i, new TestTaskBeam(),
				new FerrisListem());
		ferrisTask = new FerrisTask(requestVo);

	}

	public class FerrisListem implements FerrisTaskListemer {

		@Override
		public void updata(Object object) {
			// TODO Auto-generated method stub
			textView.setText((String) object);
		}

	}

	@Override
	public void onClick(View v) {
		// 发送事件
		switch (v.getId()) {
		case R.id.button3:
			ferrisTask.getRequestVo().setRequestData("第" + (++i) + "次");
			ferrisTask.FerrisPost();
			break;

		}
	}

	protected void onDestroy() {
		super.onDestroy();
		// 解注册
		if (null != ferrisTask) {
			ferrisTask.unregister();
		}
	}
}
