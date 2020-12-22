package com.nt.beans;

/**
 * @author SAITEJ
 *
 */
/**
 * @author SAITEJ
 *
 */
public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private float avg;
	public Student(int sno, String sname, String sadd, float avg) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
	}

	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "\n, "
				+ "sadd=" + sadd + ", avg=" + avg + "]";
	}

	
	
}
