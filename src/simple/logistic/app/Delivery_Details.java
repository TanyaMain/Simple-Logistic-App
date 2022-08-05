
package simple.logistic.app;

import javax.swing.JOptionPane;

public class Delivery_Details {
    
     private int tOption, wOption, dOption;
     private String town, weight, deliveryCompany;
     private double price;

    public String getTown() {
        switch(tOption){
            case 1: 
                 town = "Cape Town";
                 break;
            case 2:
                 town = "Pretoria";
                 break;
            case 3:
                 town = "Durban";
                 break;
        }
        return town;
    }

    public void setTown(String town) {
        
       tOption = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Select the town the parcel will be delivered to:\n1) Cape Town\n2) Pretoria\n3) Durban"));
        this.town = town;
    }

    public String getWeight() {
        
         switch(wOption){
            case 1: 
                 weight = "0kg — 4kg";
                 break;
            case 2:
                 weight = "5kg — 9kg";
                 break;
            case 3:
                 weight = "Over 10kg";
                 break;
         }
        return weight;
    }

    public void setWeight(String weight) {
        wOption = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Select the weight category of the parcel to be delivered to: "
                        + getTown() + "\n1) 0kg - 4kg\n2) 5kg - 9kg\n3) Over 10kg"));
        this.weight = weight;
    }

    public double getPrice() {
        
         switch(getWeight()){
            
            case "(0kg — 4kg)": 
                price = 300.00;
                 break;
            case "5kg — 9kg":
                 price = 500.00;
                 break;
            case "Over 10kg":
                 price  = 700.00;
                 break;
            
        }
         
        return price;
    }

    public void setPrice(double price) {
       
        this.price = price;
    }

    public String getDeliveryCompany() {
        
        switch(dOption){
            case 1:
                deliveryCompany = "ABC Couriers";
                break;
            case 2:
                 deliveryCompany = "Fast Track";
                 break;
            case 3:
                 deliveryCompany = "Rest Assured";
                 break;
        }
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
         dOption = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Select the courier company to deliver the parcel weight of " +  getWeight() 
                        + "to" +  getTown() + "\n1) ABC Couriers\n2) Fast Track\n3) Rest Assured"));
        this.deliveryCompany = deliveryCompany;
    }
    
    
     public void allSetMethods(){
         
         setTown(town);
         setWeight(weight);
         setDeliveryCompany(deliveryCompany);
     }
     
     public double Vat(){
         double vat = getPrice() * 0.14;
         return vat;
     }
     
     
      public double totalDue(){
          
          double totalDue = getPrice() * Vat();
          return totalDue;
      }
     
    
}
