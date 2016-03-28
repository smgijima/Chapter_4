package za.ac.cput.Question_3.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import za.ac.cput.Question_3.SRP.Obey.EmployeeDesc;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class EmployeeDescTest {

    private EmployeeDesc empDsc;
    private ApplicationContext ctx;
    private String desc = "Name: Siphiwo \nSurname: Mgijima \nPosition: Intern";


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empDsc =(EmployeeDesc)ctx.getBean("empDesc");

    }

    @Test
    public void testEmpDesc() throws Exception {
        Assert.assertSame(desc,empDsc.empDescription());

    }
}