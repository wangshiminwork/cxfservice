package com.wsm.dao;

import java.util.List;

import com.wsm.po.Dept;
import com.wsm.po.Emp;

public interface IEmpDAO {
	public List<Emp> findAll();
	public Dept findDeptByEmp(Integer deptno);
	public void save(Emp e);
	public void delete(Integer empno);
	public Emp findById(Integer empno);
	public void update(Emp e);
}
