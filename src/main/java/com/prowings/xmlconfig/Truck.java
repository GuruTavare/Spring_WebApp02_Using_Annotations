package com.prowings.xmlconfig;

public class Truck {

	private String cName;
	private int Tno;

	public Truck() {
		
	}
	public Truck(String cName, int tno) {
		super();
		this.cName = cName;
		Tno = tno;
	}
	public String getcName() {
		return cName;
	}

	public int getTno() {
		return Tno;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setTno(int tno) {
		Tno = tno;
	}
	@Override
	public String toString() {
		return "Truck [cName=" + cName + ", Tno=" + Tno + "]";
	}

}
