
package subwaybillgenerator;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
       
        System.out.println("DO you want a veg bread(1) or non veg bread(2)");
        int choice = sc.nextInt();
        if(choice==1)
        {System.out.println("****VEG BREAD PRICE********");
          Bread baseBread = new Bread(true);
          System.out.println("DO you want to add ExtraCheese (0)-yes (1)-No");
          int ch1 = sc.nextInt();
          if(ch1==0){baseBread.addExtraCheese();}
           System.out.println("DO you want to add ExtraToppings (0)-yes (1)-No");
           int ch2 = sc.nextInt();
          if(ch2==0){baseBread.addExtraToppings();}
           System.out.println("DO you want to add TakeAway(0)-yes (1)-No");
           int ch3 = sc.nextInt();
          if(ch3==0){baseBread.takeAway();}
          baseBread.getBill();
        }
       else
        {
        System.out.println("*********NON - VEG BREAD PRICE********");
          Bread baseBread = new Bread(false);
          System.out.println("DO you want to add ExtraCheese (0)-yes (1)-No");
          int ch4 = sc.nextInt();
          if(ch4==0){baseBread.addExtraCheese();}
           System.out.println("DO you want to add ExtraToppings (0)-yes (1)-No");
           int ch5 = sc.nextInt();
          if(ch5==0){baseBread.addExtraToppings();}
           System.out.println("DO you want to add TakeAway(0)-yes (1)-No");
           int ch6 = sc.nextInt();
          if(ch6==0){baseBread.takeAway();}
          baseBread.getBill();
        
        
        }
       
        System.out.println("*****DELUX BREAD********");
        System.out.println("DO you want a veg delux bread(1) or non veg delux bread(2)");
        int choice1 = sc.nextInt();
        if(choice1==1)
        {System.out.println("****VEG BREAD PRICE********");
           DeluxBraed dp = new DeluxBraed (true);
          System.out.println("DO you want to add ExtraCheese (0)-yes (1)-No");
          int ch1 = sc.nextInt();
          if(ch1==0){dp.addExtraCheese();}
           System.out.println("DO you want to add ExtraToppings (0)-yes (1)-No");
           int ch2 = sc.nextInt();
          if(ch2==0){dp.addExtraToppings();}
           System.out.println("DO you want to add TakeAway(0)-yes (1)-No");
           int ch3 = sc.nextInt();
          if(ch3==0){dp.takeAway();}
          dp.getBill();
        }
       else
        {
        System.out.println("*********NON - VEG BREAD PRICE********");
          DeluxBraed dp = new DeluxBraed (false);
          System.out.println("DO you want to add ExtraCheese (0)-yes (1)-No");
          int ch4 = sc.nextInt();
          if(ch4==0){dp.addExtraCheese();}
           System.out.println("DO you want to add ExtraToppings (0)-yes (1)-No");
           int ch5 = sc.nextInt();
          if(ch5==0){dp.addExtraToppings();}
           System.out.println("DO you want to add TakeAway(0)-yes (1)-No");
           int ch6 = sc.nextInt();
          if(ch6==0){dp.takeAway();}
          dp.getBill();
        
        
        }
        
      
 
        
        
        
}
   
}
