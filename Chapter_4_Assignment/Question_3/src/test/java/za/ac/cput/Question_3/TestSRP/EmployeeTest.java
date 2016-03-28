package za.ac.cput.Question_3.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import za.ac.cput.Question_3.SRP.Obey.Violates.Employee;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class EmployeeTest {

    private Employee emp;
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)ctx.getBean("emp");

    }

    @Test
    public void testEmp() throws Exception {
        Assert.assertEquals(160,emp.hoursWorked());

    }
}
