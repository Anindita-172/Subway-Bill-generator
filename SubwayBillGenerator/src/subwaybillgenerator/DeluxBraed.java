package subwaybillgenerator;

public class DeluxBraed extends Bread {
    
    public DeluxBraed(Boolean veg) {
        super(veg);//constructor
        super.addExtraCheese();
        super.addExtraToppings();
        
    }

    @Override
    public void addExtraToppings() {
         
    }

    @Override
    public void addExtraCheese() {
       // 
    }
    
}
