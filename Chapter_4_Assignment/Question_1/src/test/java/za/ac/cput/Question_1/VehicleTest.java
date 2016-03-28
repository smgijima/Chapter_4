package za.ac.cput.Question_1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Question_1.AppConfig.AppConfig;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class VehicleTest  {

    private Car car;
    private ApplicationContext cont;

    @Before
    public void setUp() throws Exception {
        cont = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (Car)cont.getBean("Family Car");

    }

    @Test
    public void testVehicle() throws Exception {

        Car otherCar = new Car("TOYOTA","COROLA",2015,"Sedan");

        car.setV_maker("TOYOTA");
        car.setV_model("COROLA");
        car.setV_year(2015);
        car.setV_type("Sedan");

        Assert.assertSame(car.getV_type(), otherCar.getV_type());
    }

    @After
    public void tearDown() throws Exception {


    }
}