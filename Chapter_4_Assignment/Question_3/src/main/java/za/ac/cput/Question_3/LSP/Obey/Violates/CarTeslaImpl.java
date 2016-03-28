package za.ac.cput.Question_3.LSP.Obey.Violates;

import za.ac.cput.Question_3.LSP.Obey.Car;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class CarTeslaImpl implements Car {

    int gear=0;

    public String carName() {
        return "Tesla";
    }


    public int gearUp() {
        throw new UnsupportedOperationException() ;
    }
}
