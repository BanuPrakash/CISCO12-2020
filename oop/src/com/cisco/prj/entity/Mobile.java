package com.cisco.prj.entity;

public class Mobile extends Product {
	private String connectivty;

	public Mobile() {
	}

	public Mobile(int id, String name, double price, String connectivty) {
		super(id, name, price);
		this.connectivty = connectivty;
	}

	public String getConnectivty() {
		return connectivty;
	}

	public void setConnectivty(String connectivty) {
		this.connectivty = connectivty;
	}

	@Override
	public boolean isExpensive() {
		if("3G".equals(connectivty) && getPrice() > 3000) {
			return true;
		} else if( "4G".equals(connectivty) && getPrice() > 15000) {
			return true;
		}
		return false;
	}
	
	
}
