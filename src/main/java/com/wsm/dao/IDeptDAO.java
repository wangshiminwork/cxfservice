package com.wsm.dao;

import java.util.List;
import java.util.Set;

import com.wsm.po.Dept;
import com.wsm.po.Emp;

public interface IDeptDAO {
	public List<Dept> findAll();
	public void save(Dept d);
	public List<Dept> findAll1();
	public Set<Emp> findEmpByDept(Integer deptno);
	public void delete(Integer deptno);
	public Dept findById(Integer deptno);
	public void update(Dept d);
}
