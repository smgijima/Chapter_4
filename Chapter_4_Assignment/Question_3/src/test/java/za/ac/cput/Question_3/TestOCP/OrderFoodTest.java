package za.ac.cput.Question_3.TestOCP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_3.AppConfig.AppConfig;
import za.ac.cput.Question_3.OCP.Obeys.OrderFood;
import za.ac.cput.Question_3.OCP.Obeys.OrderFoodImpl2;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class OrderFoodTest {

    private OrderFood of;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        of = (OrderFood)ctx.getBean("order");
    }

    @Test
    public void testOrder() throws Exception {
        Assert.assertEquals("Card",((OrderFoodImpl2) of).payCard());

    }
}
