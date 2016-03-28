package za.ac.cput.Question_3.TestOCP;

import org.junit.Assert;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.OCP.Obeys.Violates.OrderFood_w;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class OrderFood_vTest {


    private OrderFood_w ofv;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ofv = (OrderFood_w) ctx.getBean("order_v");

    }

    @Test
    public void testOrder() throws Exception {
        Assert.assertEquals("Cash", ofv.payOption(1));
    }
}
