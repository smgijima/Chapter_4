package za.ac.cput.Question_2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_2.AppConfig.AppConfig;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class VehicleTest  {
    private Vehicle veh;
    private ApplicationContext ctx;


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        veh = new Vehicle();
    }

    @Test
    public void testVehicle() throws Exception {
        veh.setVehicle("SUBARU","IMPRENZA",2011,"SEDAN");
        Assert.assertSame("SEDAN",veh.getV_type());
    }

    @After
    public void tearDown() throws Exception {


    }
}