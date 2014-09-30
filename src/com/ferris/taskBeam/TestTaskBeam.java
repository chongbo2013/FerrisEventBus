package com.ferris.taskBeam;

import com.ferris.task.RequestVo;
import com.ferris.task.TaskParamBase;


public class TestTaskBeam extends TaskParamBase<Object> {

	@Override
	public Object getParam(RequestVo requestVo) {
		// TODO Auto-generated method stub
		
		String path =(String) requestVo.requestData;
		
	
		
		
		
		
		return "test"+path;
	}

}
