import java.util.ArrayList;

public class JsonStructures {

    static class LoginJson {
        int EMPLOYEE_ID;
        String PASSWORD;
    }

    static class CreateOrderJson {
        int EMPLOYEE_ID;
        String PHONE_NUMBER;
        String TIME;
        ArrayList<OrderDetail> ORDER_DETAILS;

        @Override
        public String toString() {
            return "EMPLOYEE_ID: " + EMPLOYEE_ID + "\nPHONE_NUMBER: " + PHONE_NUMBER
                    + "\nTIME: " + TIME + "\n" + ORDER_DETAILS;
        }

        class OrderDetail {
            int PRODUCT_ID;
            double PRICE_PAID;
            int QUANTITY;
            String NOTES;
          
            public OrderDetail(int PRODUCT_ID, double PRICE_PAID, int QUANTITY, String NOTES) {
                this.PRODUCT_ID = PRODUCT_ID;
                this.PRICE_PAID = PRICE_PAID;
                this.QUANTITY = QUANTITY;
                this.NOTES = NOTES;
            }

            @Override
            public String toString() {
                return "\n{\n\tPRODUCT_ID: " + PRODUCT_ID + "\n\tPRICE_PAID: " + PRICE_PAID + "\n\tQUANTITY: " + QUANTITY + "\n\tNOTES: " + NOTES + "\n}\n";
            }
        }
    }
  
    static class AddEmployeeJson {
        int EMPLOYEE_ID;
        String FIRST_NAME;
        String LAST_NAME;
        String PASSWORD;

        @Override
        public String toString(){
            return "EMPLOYEE_ID: " + EMPLOYEE_ID + "\nFIRST_NAME: " + FIRST_NAME + "\nLAST_NAME: " + LAST_NAME + "\nPASSWORD: " + PASSWORD;
        }
    }

    static class AddCustomerJson {
        String PHONE_NUMBER;
        String ADDRESS;
        String ZIPCODE_KEY;
    }
  
    static class CheckForCustomerJson {
        String PHONE_NUMBER;
    }
}