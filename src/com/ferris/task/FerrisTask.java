package com.ferris.task;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;


import de.ferris.event.EventBus;

@SuppressLint("HandlerLeak")
public class FerrisTask {

	private RequestVo requestVo;
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			requestVo.ferrisTaskListemer.updata(msg.obj);
		};
	};

	@SuppressWarnings("deprecation")
	public FerrisTask(RequestVo requestVo) {
		// TODO Auto-generated constructor stu
		this.requestVo=requestVo;
		EventBus.getDefault().registerSticky(this, "FerrisTask",
				RequestVo.class);
		
	}

	public RequestVo getRequestVo() {
		return requestVo;
	}

	public void setRequestVo(RequestVo requestVo) {
		this.requestVo = requestVo;
	}

	public void unregister(){
		EventBus.getDefault().unregister(this);
		
	}
	public void FerrisTaskAsync(RequestVo requestvo) {

		Object ob=requestvo.taskParamBase.getParam(requestvo);
		Message msg=Message.obtain();
		msg.obj=ob;
		handler.sendMessage(msg);
	}
	
	public void FerrisPost(){
		EventBus.getDefault().postSticky(requestVo);
	}
	
}
