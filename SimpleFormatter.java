public class SimpleFormatter implements ListFormatter
{
	private double total;
	public String formatHeader()
	{
		total = 0;
		return " SHOPPING LIST:\n\n\n";
	}
	public String formatLineItem(Item item)
	{
		total += item.getPrice();
		return (String.format("%s: $%.2f\n",item.toString(),item.getPrice()));
	}
	public String formatFooter()
	{
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}
}