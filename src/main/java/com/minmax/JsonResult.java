package com.minmax;

import org.springframework.stereotype.Component;

@Component
public class JsonResult {
	private String code;
	private Object data;

	
	public JsonResult() {
	}
	

	public JsonResult(String code, Object data) {
		this.code = code;
		this.data = data;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
