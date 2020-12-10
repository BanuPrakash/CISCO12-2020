package com.cisco.prj.dao;

public class DaoException extends Exception {
	public DaoException() {
	}

	public DaoException(String msg) {
		super(msg);
	}

	public DaoException( String msg, Throwable ex) {
		 super(msg, ex);
	}
}
