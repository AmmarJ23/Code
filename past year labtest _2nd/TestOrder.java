import java.Scanner;

class Coffee
{
	private String coffeeId;
	private String flavour;
	private double pricePerUnit;

	public void Coffee(String id, String n, double p)
	{
		coffeeId = id;
		flavour = n;
		pricePerUnit = p;
	}

	public String getId()
	{
		return coffeeId;
	}

	public String getFlavour()
	{
	  	return flavour;
	}

	public String getPrice()
	{
		return pricePerUnit;
	}

	public void display()
	{
  		 System.out.printf("%-15s%-15s%-10.2f\n",coffeeId,flavour,pricePerUnit);
	}
}


class DiscountedItem extends Coffee
{
	private double discRate;

	class DiscountedItem(double r)
	{
		super();
  		discRate = r;
	}

	public double getPrice()
	{
		return (getPrice()-(getPrice()*discRate));
	}
}


class Customer
{
	private String customerName;

	public Customer(String n)
	{
			customerName = n;
	}

	public String getName()
	{
	  	return customerName;
	}
}


class CoffeeOrder
{
	private int orderId, unit;
	private Customer customer;
	private Coffee item;

	public CoffeeOrder(int id, String c, String i,int u)
	{
		customer = c;
		orderId = id;
		item = i;
		unit = u;
	}

	public double calcTotalPrice(Coffee item)
	{
  		return getPrice()*unit;
  	}

	public String toString()
	{
		return "\nOrder ID: " +orderId+"\nCustomer Name: "+getName()+"\nFlavour: " +getFlavour()+ "\nQuantity: " +unit+"\nPrice per Unit: "+getPrice()+"\nTotal Price: " +calcTotalPrice();
	}
}


public class TestOrder
{
	 public static void main(String[] args)
	 {

		 Coffee myCoffee = new Coffee("CC001", "Caramel", 10.00);
		 DiscountedItem yourCoffee = new Coffee("CC008", "Latte ", 8.00,0.10);
	 	 Coffee hisCoffee= new Coffee("CC009", "Mocha", 9.00);

		 System.out.println("\n ITEM DESCRIPTION");
		 System.out.println("********************");
		 System.out.printf("%-15s%-15s%-25s\n", "Coffee ID", "Flavour", "Price");
		 System.out.printf("%-15s%-15s%-25s\n", "*********", "********", "******");

	 	 Vector<Coffee> menu = new Vector<Coffee>();
		 menu.add(myCoffee);
		 menu.add(yourCoffee);
		 menu.add(hisCoffee);

		 for (int i = 0; i < Coffee.size; i++)
	 	 {
			menu.display();
		 }

	 	 System.out.println("************************************");

         Customer [] c= new Customer[3];
         c[0] = new Customer("Arif");
         c[1] = new Customer("Hakim");
         c[3] = new Customer("Nuha");

        ArrayList<Object> order = ArrayList<Object>;

		order.addElement(new CoffeeOrder(1, c[0],myCoffee,2));
		order.addElement(new CoffeeOrder(2, c[1],yourCoffee,3));
		order.addElement(new CoffeeOrder(3, c[2],hisCoffee,1));

		System.out.println("List of orders :\n");

		for (int i = 0; i < order.length(); i++)
		{
			System.out.println(((ArrayList)order(i)).toString());
		}
	}
}
