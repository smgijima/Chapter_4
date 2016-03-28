package za.ac.cput.Question_3.SRP.Obey;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class EmployeeSalImpl implements EmployeeSal {


    public int hoursWorked() {
        return 160;
    }


    public double salary() {
        return hoursWorked()*120;
    }
}
