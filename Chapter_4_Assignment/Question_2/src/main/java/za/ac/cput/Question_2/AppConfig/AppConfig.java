package za.ac.cput.Question_2.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Question_2.Vehicle;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
@Configuration
public class AppConfig {

    @Bean(name ="model")
    public Vehicle getVehicle(){
        return new Vehicle();
    }

}
