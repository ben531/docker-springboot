package com.minmax;

import org.springframework.stereotype.Component;

@Component
public class JsonResult<T> {
	private String code;
	private T data;

	
	public JsonResult() {
	}
	


	public JsonResult(String code, T data) {
		this.code = code;
		this.data = data;
	}



	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "JsonResult [code=" + code + ", data=" + data + "]";
	}
	


}
