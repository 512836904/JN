package com.sshome.ssmcxf.webservice.impl;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.service.WeldedJunctionService;
import com.sshome.ssmcxf.webservice.JunctionWebService;
@Transactional
@Service
public class JunctionWebServiceImpl implements JunctionWebService {
	@Autowired
	private WeldedJunctionService jws;
	
	@Override
	public Object getWeldedJunctionAll(String object) {
		return jws.getWeldedJunctionAll(object);
	}

	@Override
	public Object getWeldedJunctionById(String object) {
		return jws.getWeldedJunctionById(object);
	}

	@Override
	public int getWeldedjunctionByNo(String object) {
		return jws.getWeldedjunctionByNo(object);
	}

	@Override
	public boolean addJunction(String object) {
		return jws.addJunction(object);
	}

	@Override
	public boolean updateJunction(String object) {
		return jws.updateJunction(object);
	}

	@Override
	public boolean deleteJunction(String object) {
		return jws.deleteJunction(object);
	}

	@Override
	public Object getTaskResultAll(String object) {
		// TODO Auto-generated method stub
		return jws.getTaskResultAll(object);
	}

	@Override
	public boolean addTaskResult(String object) {
		// TODO Auto-generated method stub
		return jws.addTaskResult(object);
	}

	@Override
	public boolean updateTaskResult(String object) {
		// TODO Auto-generated method stub
		return jws.updateTaskResult(object);
	}

	@Override
	public boolean deleteTaskResult(String object) {
		// TODO Auto-generated method stub
		return jws.deleteTaskResult(object);
	}
}
