public interface ListFormatter
{
		
	/**
	Formats the header of the invoice.
	@return the invoice header
	*/
	String formatHeader();
	/**
		Formats a line item of the invoice.
		@return the formatted line item
	*/
	String formatLineItem(Item item);
	/**
	Formats the footer of the invoice.
	@return the invoice footer
	*/
	String formatFooter();
	
		
} 