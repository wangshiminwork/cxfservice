package cxf02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wsm.dao.IDeptDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring*.xml")
public class First {
	@Autowired
	private IDeptDAO dao;
	@Test
	public void test01() {
		System.out.println(dao.findAll().size());
	}
}
