package com.shell.siep.gto.exceptions.vo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;

@JsonInclude(Include.NON_EMPTY)
public class WebAPIResponseError implements Serializable {
	private static final long serialVersionUID = -3975872073217685811L;
	private int code;
	private String name;
	private String msg;
	private Object details;

	public WebAPIResponseError(WEBErrorCodeEnum error) {
		super();
		this.code = error.getCode();
		this.msg = error.getMessage();
	}

	public WebAPIResponseError(WEBErrorCodeEnum error, String details) {
		super();
		this.code = error.getCode();
		this.msg = error.getMessage();
		this.details = details;
	}

	public WebAPIResponseError(WEBErrorCodeEnum error, List<FieldError> details) {
		super();
		this.code = error.getCode();
		this.msg = error.getMessage();
		Map<String, String> fieldList = new HashMap<>();
		details.forEach(d -> fieldList.put(d.getField(), d.getDefaultMessage()));
		this.details = fieldList;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeObject(this);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		throw new ConversionNotSupportedException(in, getClass(), null);
	}

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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}
}
