package za.ac.cput.Question_3.TestSRP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import za.ac.cput.Question_3.SRP.Obey.EmployeeSal;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class EmployeeSalTest {

    private EmployeeSal empSal;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empSal =(EmployeeSal)ctx.getBean("empSal");

    }

    @Test
    public void testEmplSal() throws Exception {

        Assert.assertEquals(19200.0,empSal.salary(),empSal.salary());

    }
}
