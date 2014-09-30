package com.ferris.task;

import android.content.Context;


/**
 *  ��������װ
 * @ferris Administrator
 *
 */
public class RequestVo {
	public Context context;//������
	public int event; //������¼�
	public Object requestData; //��������
	public TaskParamBase<?> taskParamBase; //������
	public FerrisTaskListemer  ferrisTaskListemer; //������
	public RequestVo(){
		
	}
	
	public RequestVo(int event,Context context,Object requestData,TaskParamBase<?> taskParamBase,FerrisTaskListemer  ferrisTaskListemer){
		  this.context=context;
		  this. event=event;
		  this.requestData=requestData;
		  this.taskParamBase=taskParamBase;
		  this. ferrisTaskListemer=ferrisTaskListemer;
		
		
		
	}
	
	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}
	public int getEvent() {
		return event;
	}
	public void setEvent(int event) {
		this.event = event;
	}
	public Object getRequestData() {
		return requestData;
	}
	public void setRequestData(Object requestData) {
		this.requestData = requestData;
	}
	public TaskParamBase<?> getTaskParamBase() {
		return taskParamBase;
	}
	public void setTaskParamBase(TaskParamBase<?> taskParamBase) {
		this.taskParamBase = taskParamBase;
	}
	public FerrisTaskListemer getFerrisTaskListemer() {
		return ferrisTaskListemer;
	}
	public void setFerrisTaskListemer(FerrisTaskListemer ferrisTaskListemer) {
		this.ferrisTaskListemer = ferrisTaskListemer;
	}

}
