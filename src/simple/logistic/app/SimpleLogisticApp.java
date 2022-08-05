
package simple.logistic.app;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogisticApp {
    
    static Delivery_Details DELIVARY_DEATAILS_OBJECT = new Delivery_Details();
    static DecimalFormat df = new DecimalFormat("0.00");
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    static LocalDateTime now = LocalDateTime.now();  
    
    public static void main(String[] args) {
        
        DELIVARY_DEATAILS_OBJECT.allSetMethods();
        System.out.println("DELIVERY REPORT - Created on " + dtf.format(now) 
                + "\n***********************************************************\n"
                + "\nTOWN:\t\t" + DELIVARY_DEATAILS_OBJECT.getTown()
                + "\nWIEGHT:\t\t" +  DELIVARY_DEATAILS_OBJECT.getWeight()
                + "\nPRICE:\t\tR " + df.format(DELIVARY_DEATAILS_OBJECT.getPrice()) 
                + "\nVAT (14%):\tR " + df.format(DELIVARY_DEATAILS_OBJECT.Vat())
                + "\nTOTAL DUE:\tR " +  df.format(DELIVARY_DEATAILS_OBJECT.totalDue()) 
                + "\nCOURIER:\t" +  DELIVARY_DEATAILS_OBJECT.getDeliveryCompany()
                + "\n***********************************************************\n");
    }
    
}
