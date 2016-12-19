import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }
   //ADD REMAINING CODE HERE
   /* getProductTypes returns an array containing each unique product found in the products ArrayList */
   public Product[] getProductTypes()
   { 
      Product temp;
	  for(int i=0;i<products.size();i++ )
	  { 
          temp=products.get(i);
		  for(int j=i+1;j<products.size();j++)
		  { 
	          if(temp.equals(products.get(j)) )
			  { 
		          products.remove(j);
				  j--; //decrement the counter as each time we remove an element the size of the ArrayList descreases
				  
				  
				  
		      }
           }
      }
	  
	  Product pArray [] = products.toArray(new Product [0] );
	  return pArray;
	  
	  
   }
   /*adds a coin to the currentCoins CoinSet object which stores all of the coins currently collected by this Vending Machine object */
   public void addCoin(Coin coin)
   { 
       currentCoins.add(coin);
   }
   /* removes all of the money currently stored in the vending machine and returns the ammount of money removed */
   public double removeMoney()
   { 
       double total=currentCoins.remove();
	   return total;
   }
   
   public void buyProduct(Product p)
   { 
       for(int i=0;i<products.size();i++ )
	   { 
           if(p==products.get(i) )
		   { 
	           if(currentCoins.totalValue()>=products.get(i).getPrice() )
			   {
			      products.remove(i);
			      currentCoins.clearCoins();
			   }
			   else
				   System.out.println("Error. You have not provided enough money to purchase that item");
	       }
       }
   }
   
   public void addProduct(Product p, int quantity)
   { 
      for(int i=0;i<quantity;i++)
	  {
	    products.add(p);
	  }
   }
}