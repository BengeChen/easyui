package com.yuan.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-mvc.xml","classpath:log4j.xml"})
public class BaseTest {
    //ֻ��Ϊ�˱�����maven���ʱ�Ĳ��Դ���
	@Test
	public void testEmpty(){
		
	}

}