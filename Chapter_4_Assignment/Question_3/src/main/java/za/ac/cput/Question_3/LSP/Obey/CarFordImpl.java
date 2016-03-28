package za.ac.cput.Question_3.LSP.Obey;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class CarFordImpl implements Car {

    int gear=0;

    public String carName() {
        return "Ford";
    }


    public int gearUp() {
        return ++gear ;
    }
}