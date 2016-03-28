package za.ac.cput.Question_2;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class Vehicle {

    Car car ;

    private String maker;
    private String model;
    private int year;

    public Vehicle() {
        car = new Car();
    }

    public void setVehicle(String maker, String model, int year, String type) {
        car = new Car();
        this.maker = maker;
        this.model = model;
        this.year = year;
        car.setV_type(type);
    }
    public String getV_type(){ return car.getV_type(); }



    public void setV_maker(String maker) {
        this.maker = maker;
    }

    public void setV_year(int v_year) {
        this.year = v_year;
    }

    public void setV_model(String v_model) {
        this.model = v_model;
    }
    public String getV_model() {
        return model;
    }

    public int getV_year() {
        return year;
    }

    public String getV_maker() {
        return maker;
    }

}
