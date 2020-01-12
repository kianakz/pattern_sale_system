public class NonClothing extends Product
{
	public NonClothing(String aDescription, double aPrice, double aAmount)
	{
		super(aDescription,aPrice, aAmount);
		
	}
	public String toString()
	{
		if(super.addOn==true)
		return super.toString()+") + Add-on: "+ super.nameOfAddOn;
		else		
		return super.toString()+")";
		
	}

	
	
	
	
	
	
}