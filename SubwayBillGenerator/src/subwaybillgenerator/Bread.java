package subwaybillgenerator;


public class Bread {
    private int price=0;
    private Boolean veg;
    
    private int ExtraCheesePrice = 100;
    private int ExtraToppingsPrice = 150;
    private int backPackPrice = 20;
    
    private int baseBreadPrice;
    
    
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
    
    
    
    public Bread(Boolean veg){
    this.veg=veg;
    if(this.veg){
    this.price=300;
    }
    else {
    this.price=400;
    System.out.println("Non veg bread added");
    }
    baseBreadPrice = this.price;
    }
     public void addExtraCheese(){
         isExtraCheeseAdded=true;
                 this.price+=100;
     
     }
     public void addExtraToppings(){
         isExtraToppingsAdded=true;
          
         this.price+= ExtraToppingsPrice;
     
     }
     public void takeAway(){
         isOptedForTakeAway=true;
  
         this.price+= backPackPrice;
     
     }
    public void getBill(){
      String bill="";
      System.out.println("Bread price:"+baseBreadPrice);
      if(isExtraCheeseAdded){
      bill+="Extra Cheese added :" + ExtraCheesePrice+"\n";
      }
      if(isExtraToppingsAdded){
      bill+="Extra Toppings added :" + ExtraToppingsPrice+"\n";
      }
      if(isOptedForTakeAway){
      bill+="Take away was opted :" + backPackPrice+"\n";
      }
      bill+= "Bill: "+this.price+"\n";
      System.out.println(bill);
     }
    
}
