package za.ac.cput.Question_3.SRP.Obey.Violates;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class EmployeeImpl implements Employee {

    public int hoursWorked() {
        return 160;
    }

    public double salary() {
        return hoursWorked()*120;
    }

    public String empDescription() {
        return "Name: Siphiwo \nSurname: Mgijima \nPosition: Intern";
    }
}
