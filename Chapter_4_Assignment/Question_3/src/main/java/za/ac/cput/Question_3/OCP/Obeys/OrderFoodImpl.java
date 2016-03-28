package za.ac.cput.Question_3.OCP.Obeys;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class OrderFoodImpl implements OrderFood {

    public String getOrder() {
        return "Fish and chips";
    }

    public String pay()
    {
        return "Cash";
    }
}
