package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;
@Service("custService")
public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	@Qualifier("activeDAO")
	private ICustomerDAO dao;
	


	@Override
	public String calculateSimpleInterestAmount(CustomerDTO dto) throws Exception {
		//write b.logic to calculate simple intrAmount based on pAmt, rate, time
		float intrAmt=(dto.getPAmt()*dto.getRate()*dto.getTime())/100.0f;
		CustomerBO bo= new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPAmt(dto.getPAmt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setIntrAmt(intrAmt);
		
		//use DAO
		
		int count = dao.insert(bo);
		// immediate if or ternary operator <cond>?<success>:<failure>
		return count==0?"Customer Registration failed":"Customer Registration succeded::Details are :: principal amount::"+dto.getPAmt()+"time:"+dto.getTime()+"Rate:"+dto.getRate()+"Intrest Amount"+intrAmt;
		
		
		
	}
   
	
	

}
