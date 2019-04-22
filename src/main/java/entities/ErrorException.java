package main.java.entities;

public class ErrorException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Exception ex;
	private String msg;
	
	public ErrorException(Exception ex){
		this.ex = ex;
	}
	
	public ErrorException(String msg){
		this.msg = msg;
	}

	public Exception getEx() {
		return ex;
	}

	public void setEx(Exception ex) {
		this.ex = ex;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}