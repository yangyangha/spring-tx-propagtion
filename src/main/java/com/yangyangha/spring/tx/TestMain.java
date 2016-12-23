package com.yangyangha.spring.tx;

import com.yangyangha.spring.tx.model.User;
import com.yangyangha.spring.tx.test.OuterBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	OuterBean testBean = (OuterBean) ctx.getBean("outerBeanImpl");
    	
    	User user = new User();
    	user.setUsername("yang yang");
    	user.setName("yangha new");
    	
    	try{
//    		testBean.testRequired(user);
    	} catch(Exception e){
    		// catch exception raised from transaction rollback
            System.out.println("catch exception ... ");
        }
    	
    	testBean.testRequiresNew(user);
    	
    }
}
