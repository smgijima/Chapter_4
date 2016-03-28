package za.ac.cput.Question_1;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class Vehicle {

    private String v_maker;
    private String v_model;
    private int v_year;

    public Vehicle() {
    }

    public Vehicle(String v_maker, String v_model, int v_year) {
        this.v_maker = v_maker;
        this.v_model = v_model;
        this.v_year = v_year;
    }

    public String getV_maker() {
        return v_maker;
    }

    public void setV_maker(String v_maker) {
        this.v_maker = v_maker;
    }

    public String getV_model() {
        return v_model;
    }

    public void setV_model(String v_model) {
        this.v_model = v_model;
    }

    public int getV_year() {
        return v_year;
    }

    public void setV_year(int v_year) {
        this.v_year = v_year;
    }
}
