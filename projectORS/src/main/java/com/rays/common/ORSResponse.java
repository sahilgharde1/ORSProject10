package com.rays.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains REST response
 * 
 * @author Mr.Sahil Gharde
 * 
 *
 */
public class ORSResponse {

	public static String DATA = "data";
	public static String INPUT_ERROR = "inputerror";
	public static String MESSAGE = "message";

	private boolean success = false;

	private Map<String, Object> result = new HashMap<String, Object>();

	/*
	 * private String jwttoken;
	 * 
	 * public ORSResponse(String jwttoken) { this.jwttoken = jwttoken; }
	 * 
	 * public String getToken() { return this.jwttoken;
	 *
	}*/
	
	public ORSResponse() {
	}

	public ORSResponse(boolean success) {
		this.success = success;
	}

	public ORSResponse(boolean success, String message) {
		this.success = success;
		addMessage(message);
	}

	public ORSResponse(boolean success, String message, Object value) {
		this.success = success;
		addMessage(message);
		addData(value);
		System.out.println("....Mr.Sahil Gharde....");
	}

	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public void addResult(String key, Object value) {//preload or images
		result.put(key, value);
	}

	public void addData(Object value) {//list or  search
		result.put(DATA, value);
	}

	public void addInputErrors(Object value) {//input validation
		result.put(INPUT_ERROR, value);
	}

	public void addMessage(Object value) {//business validation
		result.put(MESSAGE, value);
	}

}
