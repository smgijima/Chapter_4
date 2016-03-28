package za.ac.cput.Question_3.OCP.Obeys.Violates;

/**
 * Created by MGIJIMA on 2016/03/27.
 */
public class OrderFoodImpl_w {

        public String getOrder() {
            return "Fish and chips";
        }

        public String payOption(int opt) {
            String msg="";
            if(opt==1)
                msg = "Cash";
            else
                msg ="Card";
            return msg;
        }


    }
