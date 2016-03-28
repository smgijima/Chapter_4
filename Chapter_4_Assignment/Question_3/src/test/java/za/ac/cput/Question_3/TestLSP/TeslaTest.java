package za.ac.cput.Question_3.TestLSP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import za.ac.cput.Question_3.LSP.Obey.Car;

/**
 * Created by MGIJIMA on 2016/03/27.
*/
public class TeslaTest {

    private Car test;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        test = (Car)ctx.getBean("tesla");
    }

    @Test
    @Ignore
    public void testTesla() throws Exception {
        Assert.assertNotEquals(1,test.gearUp());
    }
}
