package com.shell.siep.gto.vo.response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.exceptions.vo.WebAPIResponseError;

@JsonInclude(Include.NON_NULL)
public class GenericAPIResponse implements Serializable{

	private static final long serialVersionUID = 5940024721909221789L;
	private int status;

	private Object data;

	private WebAPIResponseError error;

	public GenericAPIResponse() {
	}

	public GenericAPIResponse(HttpStatus status, Object response){
		super();
		this.status = status.value();
		this.data = response;
	}

	public GenericAPIResponse(HttpStatus status, WebAPIResponseError error){
		super();
		this.status = status.value();
		this.error = error;
	}

	public GenericAPIResponse(HttpStatus status, WEBErrorCodeEnum error){
		super();
		this.status = status.value();
		this.error = new WebAPIResponseError(error);
	}

	public GenericAPIResponse(HttpStatus status, WEBErrorCodeEnum error, List<FieldError> errorFields) {
		super();
		this.status = status.value();
		this.error = new WebAPIResponseError(error, errorFields);
	}

	public GenericAPIResponse(HttpStatus status, WEBErrorCodeEnum error, Exception e) {
		super();
		this.status = status.value();
		StackTraceElement[] trace = e.getStackTrace();
		if(trace!=null && trace.length>1)
			this.error = new WebAPIResponseError(error, e.getMessage()+" at "+trace[0].toString());
		else
			this.error = new WebAPIResponseError(error, e.getMessage());
	}

	public GenericAPIResponse(HttpStatus status, WEBErrorCodeEnum error, String details) {
		super();
		this.status = status.value();
		this.error = new WebAPIResponseError(error, details);
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeObject(this);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		throw new ConversionNotSupportedException(in, getClass(), null);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public WebAPIResponseError getError() {
		return error;
	}

	public void setError(WebAPIResponseError error) {
		this.error = error;
	}
}
