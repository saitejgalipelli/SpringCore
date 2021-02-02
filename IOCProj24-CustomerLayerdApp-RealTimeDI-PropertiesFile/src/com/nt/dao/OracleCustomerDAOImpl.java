package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class OracleCustomerDAOImpl implements ICustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY = "INSERT INTO LAYERED_CUSTOMER VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?,?,?)";

	private DataSource ds;
	private String os;
	private String lang;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public OracleCustomerDAOImpl(DataSource ds) {

		this.ds = ds;
		
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		System.out.println(os+" "+lang);
		// get pooled jdbc connection object
		Connection con = ds.getConnection();
		// create PreparedStatement object
		PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER_QUERY);
		// set values to query params by collecting data from BO class obj
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getTime());
		ps.setFloat(5, bo.getRate());
		ps.setFloat(6, bo.getIntrAmt());
		// execute the SQL QUERY
		int count = ps.executeUpdate();
		// close jdbc objs
		ps.close();
		con.close();
		return count;

	}

}
