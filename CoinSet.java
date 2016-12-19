import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }
   /* adds a coin to the ArrayList containing all of the coins collected so far */
   public void add(Coin coin)
   { 
       set.add(coin);
   }
   /* gets the total value of the ArrayList of coins in a coin set */
   public double totalValue()
   {     
        double total=0;
        for(int i=0;i<set.size();i++)
	    { 
	       total+=set.get(i).getValue() ;  
	    }
		return total;
   }
   
   public void clearCoins()
   { 
       set.clear();
   }
   
   public double remove()
   { 
       double total=0;
	   Coin c;
	   for(int i=0;i<set.size();i++)
	   { 
           c=set.get(i);
		   total+=c.getValue();
       }
	   set.clear();
	   return total;
   }
}