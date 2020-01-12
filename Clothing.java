public class Clothing extends Product
{
	//Variable Definition
	public enum Size {SMALL, MEDIUM, LARGE };
	private Size size;
	//Parametrized Constructor 
	public Clothing(String aDescription, double aPrice, double aAmount, Size aSize)
	{
		super(aDescription,aPrice, aAmount);
		setSize(aSize);
	
		
	}
	//Mutators
	public void setSize(Size aSize)
	{
		size= aSize;
		
	}

	// Accessors
	public Size getSize()
	{
		return size;
	}
	
	public String toString()
	{
		if(super.addOn==true)
			
		return super.toString()+ ", Size: "+ size+") + Add-on: "+ super.nameOfAddOn;
		else
		return super.toString()+ ", Size: "+ size+")";
	}
			
}