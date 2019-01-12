package com.wsm.cxf;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.wsm.po.Dept;
@WebService(targetNamespace="http://www.wsm.com/cxf/dodept")
public interface IDoDept {
	@WebResult(name="return")
	public Dept find(@WebParam(name="deptno",targetNamespace="http://www.wsm.com/cxf/dodept")int deptno);
}
