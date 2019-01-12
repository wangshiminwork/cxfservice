package com.wsm.cxf;

import java.util.List;

import javax.annotation.Resource;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wsm.dao.IDeptDAO;
import com.wsm.po.Dept;
@Component("dodept")
@WebService(targetNamespace="http://www.wsm.com/cxf/dodept")
public class DoDept implements IDoDept {
	@Autowired
	private IDeptDAO dao;
	@WebResult(name="return")
	public Dept find(@WebParam(name="deptno",targetNamespace="http://www.wsm.com/cxf/dodept")int deptno) {
		// TODO Auto-generated method stub
		System.out.println("deptno="+deptno);
		return dao.findById(deptno);
	}
}
