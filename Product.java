public abstract class Product implements Item
{
	// Defining the Variables
	protected String description;
	protected double price;
	protected double amount;
	protected String nameOfAddOn;
	protected double amountToAdd;
	boolean addOn;
	

		
	// Parametrized constructor
	public Product(String aDescription, double aPrice, double aAmount)
	{
		setDescription(aDescription);
		setPrice(aPrice);
		setAmount(aAmount);
		
		
	}
	// Mutators

	
	public void setDescription(String aDescription)
	{
		description= aDescription;
		
		
	}
	public void setPrice(double aPrice)
	{
		price= aPrice;
		
	}
	public void setAmount(double aAmount)
	{
		amount= aAmount;
		
	}
	
	// Accessors
	public String getDescription()
	{
		return description;
		
		
	}
	public double getPrice()
	{
		
		return price;
		
	}
	public double getAmount()
	{
		
		return amount;
	}
	
	public String toString()
	{
		
		
		return "\t"+description + " (Amount of Cloth: " + amount +"M";
		
	}
	
		public void addOn(double aAmountToAdd,String name)
	{
		addOn=true;
		amountToAdd=aAmountToAdd;
		nameOfAddOn=name;
		price+=amountToAdd;
	}
	
}