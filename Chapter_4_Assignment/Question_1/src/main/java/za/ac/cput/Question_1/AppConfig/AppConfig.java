package za.ac.cput.Question_1.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Question_1.Car;
import za.ac.cput.Question_1.Vehicle;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
@Configuration
public class AppConfig {

    @Bean(name ="Family Car")
    public Vehicle getVehicle(){
        return new Car();
    }
}
