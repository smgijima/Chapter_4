package za.ac.cput.Question_3.AppConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Question_3.LSP.Obey.Car;
import za.ac.cput.Question_3.LSP.Obey.CarFordImpl;
import za.ac.cput.Question_3.LSP.Obey.Violates.CarTeslaImpl;
import za.ac.cput.Question_3.OCP.Obeys.OrderFood;
import za.ac.cput.Question_3.OCP.Obeys.OrderFoodImpl2;
import za.ac.cput.Question_3.OCP.Obeys.Violates.OrderFoodImpl_w;
import za.ac.cput.Question_3.SRP.Obey.EmployeeDesc;
import za.ac.cput.Question_3.SRP.Obey.EmployeeDescImpl;
import za.ac.cput.Question_3.SRP.Obey.EmployeeSal;
import za.ac.cput.Question_3.SRP.Obey.EmployeeSalImpl;
import za.ac.cput.Question_3.SRP.Obey.Violates.Employee;
import za.ac.cput.Question_3.SRP.Obey.Violates.EmployeeImpl;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
@Configuration
public class AppConfig {
    /**
     SRP
     **/

    @Bean(name ="emp")
    public Employee getEmp(){ return new EmployeeImpl();}

    @Bean(name ="empSal")
    public EmployeeSal getEmpSal(){ return new EmployeeSalImpl();}

    @Bean(name ="empDesc")
    public EmployeeDesc getEmpDesc(){ return new EmployeeDescImpl();}
    /**
     OCP
     **/

    @Bean(name ="order_v")
    public OrderFoodImpl_w getV_Order(){
        return new OrderFoodImpl_w();
    }

    @Bean(name ="order")
    public OrderFood getOrder(){

        return new OrderFoodImpl2();
    }
    /**
     LSP
     **/
    @Bean(name="ford")
    public Car getFord(){ return new CarFordImpl();}
    @Bean(name="tesla")
    public Car getTesla(){ return new CarTeslaImpl();}

}