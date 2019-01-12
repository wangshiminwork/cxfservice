package com.wsm.cxf;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.wsm.po.Emp;

@WebService(targetNamespace="http://www.wsm.com/cxf/doemp")
public interface IDoEmp {
	@WebResult(name="return")
	public List<Emp> findAll();
}
