import java.util.*;
import javax.swing.event.*;

public class ShoppingList
{
	private ArrayList <Item> items;
	private ArrayList <ChangeListener> listeners;
	/**
		Constructs a blank invoice.
	*/
	public ShoppingList()
	{
		items = new ArrayList<Item>();
		listeners = new ArrayList<ChangeListener>();
	}
	public void addItem(Item i)
	{
	items.add(i);
// Notify all observers of the change to the invoice
	ChangeEvent event = new ChangeEvent(this);
	for (ChangeListener listener : listeners)
		listener.stateChanged(event);	
		
	}
	/**
Adds a change listener to the invoice.
@param listener the change listener to add
*/
	public void addChangeListener(ChangeListener listener)
	{
		listeners.add(listener);
	}
/**
Gets an iterator that iterates through the items.
@return an iterator for the items
*/
	public Iterator<Item> getItems()
	{
		return new
		Iterator<Item>()
		{
			private int current = 0;
			public boolean hasNext()
			{
				return current < items.size();
			}
			public Item next()
			{
			return items.get(current++);
			}
			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public String format(ListFormatter formatter)
	{
		String r = formatter.formatHeader();
		Iterator<Item>iter = getItems();
		while (iter.hasNext())
		r += formatter.formatLineItem(iter.next());
		return r + formatter.formatFooter();
	}
	
}
