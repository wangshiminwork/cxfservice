package com.wsm.cxf;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wsm.dao.IEmpDAO;
import com.wsm.po.Emp;
@Component("doemp")
@WebService(targetNamespace="http://www.wsm.com/cxf/doemp")
public class DoEmp implements IDoEmp {
	@Autowired
	private IEmpDAO dao;
	@WebResult(name="return")
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		return dao.findAll();
	}

}
