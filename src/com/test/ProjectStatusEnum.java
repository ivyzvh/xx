package com.test;

public enum ProjectStatusEnum {
	VALID(0, "Valid", "��Ч"), 
	INVALID(1, "Invalid", "��Ч");

	private ProjectStatusEnum(int code, String name, String desc) {
		this.code = code;
		this.name = name;
		this.desc = desc;
	}
	
	private int code;
	private String name;
	private String desc;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
