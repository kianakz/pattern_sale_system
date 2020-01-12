import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

public class ShoppingTester 
{
	public static void main(String []args)
	{
		final ShoppingList shoppingList= new ShoppingList(); 
		final ListFormatter formatter= new SimpleFormatter();
		// This text area will contain the formatted shoppingList
		final JTextArea textArea = new JTextArea(20, 40);
		
		// When the shoppingList changes, update the text area
		ChangeListener listener = new
			ChangeListener()
			{
				public void stateChanged(ChangeEvent event)
				{
					textArea.setText(shoppingList.format(formatter));
				}
			};
		shoppingList.addChangeListener(listener);				
		// Add line items to a combo box
		final JComboBox combo = new JComboBox();
		
		//combo.addItem(shirt);
		// Make a button for adding the currently selected
		// item to the invoice
		//JButton addButton = new JButton("Add");
		//**Top Panel
		 
		JLabel shirtL=new JLabel("Shirt");		
		JButton shirtB= new JButton(new ImageIcon("shirt.jpg"));
		shirtB.setBackground(Color.WHITE);
		JPanel shirtPanel= new JPanel();	
		shirtB.setPreferredSize(new Dimension(100, 100));		
		shirtB.setVerticalTextPosition(SwingConstants.TOP);
		shirtPanel.setLayout(new BoxLayout(shirtPanel, BoxLayout.Y_AXIS));
		shirtPanel.add(shirtL);
		shirtPanel.add(shirtB);
		
		JLabel jacketL =new JLabel("Jacket");
		JButton jacketB =new JButton(new ImageIcon("Jacket.jpg"));
		jacketB.setBackground(Color.WHITE);
		JPanel jacketPanel= new JPanel();
		jacketB.setPreferredSize(new Dimension(100, 100));
		jacketB.setVerticalTextPosition(SwingConstants.TOP);
		jacketPanel.setLayout(new BoxLayout(jacketPanel, BoxLayout.Y_AXIS));	
		jacketPanel.add(jacketL);
		jacketPanel.add(jacketB);
		JRadioButton jacketAddOn =new JRadioButton("Add Lining");
		jacketPanel.add(jacketAddOn);
		
		JPanel topPanel=new JPanel();
		topPanel.setBorder(BorderFactory.createTitledBorder("Top:"));
		topPanel.setPreferredSize(new Dimension(500,200));
		topPanel.setLayout(new GridLayout(1,2));
		topPanel.add(shirtPanel);
		topPanel.add(jacketPanel);
		//**
		
		//**Bottom panel
		JLabel skirtL=new JLabel("Skirt");		
		JButton skirtB= new JButton(new ImageIcon("skirt.jpg"));
		skirtB.setBackground(Color.WHITE);
		JPanel skirtPanel= new JPanel();	
		skirtB.setPreferredSize(new Dimension(100, 100));		
		skirtB.setVerticalTextPosition(SwingConstants.TOP);
		skirtPanel.setLayout(new BoxLayout(skirtPanel, BoxLayout.Y_AXIS));
		skirtPanel.add(skirtL);
		skirtPanel.add(skirtB);
		JRadioButton skirtAddOn =new JRadioButton("Add Lining");
		skirtPanel.add(skirtAddOn);
		
		JLabel pantsL =new JLabel("Pants");
		JButton pantsB =new JButton(new ImageIcon("pants.jpg"));
		pantsB.setBackground(Color.WHITE);
		JPanel pantsPanel= new JPanel();
		pantsB.setPreferredSize(new Dimension(100, 100));
		pantsB.setVerticalTextPosition(SwingConstants.TOP);
		pantsPanel.setLayout(new BoxLayout(pantsPanel, BoxLayout.Y_AXIS));	
		pantsPanel.add(pantsL);
		pantsPanel.add(pantsB);
		
		
		JPanel bottomPanel=new JPanel();
		bottomPanel.setBorder(BorderFactory.createTitledBorder("Bottom:"));
		bottomPanel.setPreferredSize(new Dimension(500,200));
		bottomPanel.setLayout(new GridLayout(1,2));
		bottomPanel.add(skirtPanel, BorderLayout.EAST);
		bottomPanel.add(pantsPanel, BorderLayout.WEST);
		
		
		//**
		
			//**One_piece Panel
		 
		JLabel dressL=new JLabel("Dress");		
		JButton dressB= new JButton(new ImageIcon("dress.jpg"));
		dressB.setBackground(Color.WHITE);
		JPanel dressPanel= new JPanel();	
		dressB.setPreferredSize(new Dimension(100, 100));		
		dressB.setVerticalTextPosition(SwingConstants.TOP);
		dressPanel.setLayout(new BoxLayout(dressPanel, BoxLayout.Y_AXIS));
		dressPanel.add(dressL);
		dressPanel.add(dressB);
		
		JLabel overallL =new JLabel("Overall");
		JButton overallB =new JButton(new ImageIcon("overall.jpg"));
		overallB.setBackground(Color.WHITE);
		JPanel overallPanel= new JPanel();
		overallB.setPreferredSize(new Dimension(100, 100));
		overallB.setVerticalTextPosition(SwingConstants.TOP);
		overallPanel.setLayout(new BoxLayout(overallPanel, BoxLayout.Y_AXIS));	
		overallPanel.add(overallL);
		overallPanel.add(overallB);
		
		
		JPanel onePiecePanel=new JPanel();
		onePiecePanel.setBorder(BorderFactory.createTitledBorder("One-piece:"));
		onePiecePanel.setPreferredSize(new Dimension(500,200));
		onePiecePanel.setLayout(new GridLayout(1,2));
		onePiecePanel.add(dressPanel, BorderLayout.EAST);
		onePiecePanel.add(overallPanel, BorderLayout.WEST);
		//**
		ButtonGroup sizes = new ButtonGroup();
		JRadioButton small =new JRadioButton("Small");
		JRadioButton medium =new JRadioButton("Medium");
		JRadioButton large =new JRadioButton("large");
		small.setSelected(true);
		sizes.add(small);
		sizes.add(medium);
		sizes.add(large);		
		
		
		//**NonClothing
		
		JPanel bagPanel= new JPanel();		
		JButton bagB= new JButton(new ImageIcon("bag.jpg"));		
		bagB.setBackground(Color.WHITE);
		bagPanel.setLayout(new BoxLayout(bagPanel, BoxLayout.Y_AXIS));
		bagB.setPreferredSize(new Dimension(100, 100));
		JLabel bagL= new JLabel("Bag");		
		bagPanel.add(bagL);
		bagPanel.add(bagB);
		JRadioButton bagAddOn =new JRadioButton("Add Zipper");
		bagPanel.add(bagAddOn);
			
		JPanel toyPanel= new JPanel();		
		JButton toyB= new JButton(new ImageIcon("toy.jpg"));	
		toyB.setBackground(Color.WHITE);		
		toyPanel.setLayout(new BoxLayout(toyPanel, BoxLayout.Y_AXIS));
		toyB.setPreferredSize(new Dimension(100, 100));
		JLabel toyL= new JLabel("Plush Toy");		
		toyPanel.add(toyL);
		toyPanel.add(toyB);
		JRadioButton toyAddOn =new JRadioButton("Add Plastic Eyes");
		toyPanel.add(toyAddOn);
		
		
		JPanel curtainPanel= new JPanel();		
		JButton curtainB= new JButton(new ImageIcon("curtain.jpg"));		
		curtainB.setBackground(Color.WHITE);
		curtainPanel.setLayout(new BoxLayout(curtainPanel, BoxLayout.Y_AXIS));
		curtainB.setPreferredSize(new Dimension(100, 100));
		JLabel curtainL= new JLabel("Curtain");		
		curtainPanel.add(curtainL);
		curtainPanel.add(curtainB);
		
		
		
		//**
		
		
		ActionListener action = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Clothing.Size size=Clothing.Size.SMALL;
							
					if(small.isSelected())
					{
						size=Clothing.Size.SMALL;
						
					}
					else if(medium.isSelected())
					{
						size=Clothing.Size.MEDIUM;
					}
					else if(large.isSelected())
					{
						size=Clothing.Size.LARGE;
					}
				
				
				
				if(event.getSource()==shirtB)
				{
							
					if(size==Clothing.Size.SMALL)
						{
							Product shirt= new Clothing("Shirt", 20.0, 1.37, size);
							shoppingList.addItem(shirt);
						}
					else if(size==Clothing.Size.MEDIUM)
					{		Product shirt= new Clothing("Shirt", 30.0, 1.50, size);
							shoppingList.addItem(shirt);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		Product shirt= new Clothing("Shirt", 40.0, 1.75, size);
							shoppingList.addItem(shirt);
												
					}
					
					
				}
				else if(event.getSource()==jacketB)
				{
					Product jacket= new Clothing("Jacket", 35.5, 1.46, size);
						if(size==Clothing.Size.SMALL)
						{
							jacket= new Clothing("Jacket", 35.5, 1.46, size);
							
						}
					else if(size==Clothing.Size.MEDIUM)
					{		jacket= new Clothing("Jacket", 46.80, 1.57, size);
							//shoppingList.addItem(jacket);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		 jacket= new Clothing("Jacket", 57.5, 1.68, size);
						//	shoppingList.addItem(jacket);
												
					}
					if(jacketAddOn.isSelected())
					jacket.addOn(15.2, "Lining");
					shoppingList.addItem(jacket);
					
				}
				
					else if(event.getSource()==skirtB)
				{
							Product skirt= new Clothing("Skirt", 25, 1.25, size);
						if(size==Clothing.Size.SMALL)
						{
							skirt= new Clothing("Skirt", 25, 1.25, size);
							
						}
					else if(size==Clothing.Size.MEDIUM)
					{		skirt= new Clothing("Skirt", 35.6, 1.35, size);
							
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		skirt= new Clothing("Skirt", 45.3, 1.47, size);
						
												
					}
					if(skirtAddOn.isSelected())
					skirt.addOn(10.2, "Lining");
					shoppingList.addItem(skirt);
					
				}
				
						else if(event.getSource()==pantsB)
				{
						if(size==Clothing.Size.SMALL)
						{
							Product pants= new Clothing("Pants", 70.1, 1.56, size);
							shoppingList.addItem(pants);
						}
					else if(size==Clothing.Size.MEDIUM)
					{		Product pants= new Clothing("Pants", 85, 1.65, size);
							shoppingList.addItem(pants);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		Product pants= new Clothing("Pants", 99.9, 1.75, size);
							shoppingList.addItem(pants);
												
					}
					
				}
				
				
							else if(event.getSource()==overallB)
				{
						if(size==Clothing.Size.SMALL)
						{
							Product overall= new Clothing("Overall", 72.1, 1.56, size);
							shoppingList.addItem(overall);
						}
					else if(size==Clothing.Size.MEDIUM)
					{		Product overall= new Clothing("Overall", 86, 1.65, size);
							shoppingList.addItem(overall);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		Product overall= new Clothing("Overall", 99.9, 1.75, size);
							shoppingList.addItem(overall);
												
					}
					
				}
				
					else if(event.getSource()==overallB)
				{
						if(size==Clothing.Size.SMALL)
						{
							Product overall= new Clothing("Overall", 72.1, 1.56, size);
							shoppingList.addItem(overall);
						}
					else if(size==Clothing.Size.MEDIUM)
					{		Product overall= new Clothing("Overall", 86, 1.65, size);
							shoppingList.addItem(overall);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		Product overall= new Clothing("Overall", 99.9, 1.75, size);
							shoppingList.addItem(overall);
												
					}
										
				}
				
					else if(event.getSource()==dressB)
				{
						if(size==Clothing.Size.SMALL)
						{
							Product dress= new Clothing("Dress", 150.1, 1.80, size);
							shoppingList.addItem(dress);
						}
					else if(size==Clothing.Size.MEDIUM)
					{		Product dress= new Clothing("Dress", 160.2, 1.90, size);
							shoppingList.addItem(dress);
						
						
					}
						else if(size==Clothing.Size.LARGE)
					{		Product dress= new Clothing("Dress", 175.5, 2.0, size);
							shoppingList.addItem(dress);
												
					}
										
				}
				
				else if(event.getSource()==bagB)
				{
						Product bag= new NonClothing("Bag", 55.6, 0.5);
						if(bagAddOn.isSelected())
						bag.addOn(20, "Zipper");
						shoppingList.addItem(bag);
				}
				else if(event.getSource()==toyB)
				{
						Product toy= new NonClothing("Plush Toy", 30.5, 0.7);
						if(toyAddOn.isSelected())
						toy.addOn(20, "Plastic Eyes");
						shoppingList.addItem(toy);
				}
					else if(event.getSource()==curtainB)
				{
						Product curtain= new NonClothing("Curtain", 250, 4.5);
						shoppingList.addItem(curtain);
				}
			
				
					
				
				
					
					
					
					
				
				
			
										
				
			}
			
			
		};
		
	//	addButton.addActionListener(action);
		
	/*	addButton.addActionListener(new
		ActionListener()
		{
		public void actionPerformed(ActionEvent event)
			{
				Item item = (Item) combo.getSelectedItem();
				shoppingList.addItem(item);
										
				
			}
		});	
*/		
		JPanel panelClothing =new JPanel();
		
		
		panelClothing.setBorder(BorderFactory.createTitledBorder("Clothing"));
		panelClothing.setPreferredSize(new Dimension(700,800));
	//	panelClothing.setLayout(new GridLayout(3, 1));
		panelClothing.setLayout(new BoxLayout(panelClothing, BoxLayout.Y_AXIS));
	
		JPanel sizePanel= new JPanel();
		sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		panelClothing.add(sizePanel);
		panelClothing.add(topPanel);
		panelClothing.add(bottomPanel);
		panelClothing.add(onePiecePanel);
	
		shirtB.addActionListener(action);
		jacketB.addActionListener(action);
		pantsB.addActionListener(action);
		skirtB.addActionListener(action);
		dressB.addActionListener(action);
		overallB.addActionListener(action);
		bagB.addActionListener(action);
		toyB.addActionListener(action);
		curtainB.addActionListener(action);
		
		
		JPanel panelNonClothing =new JPanel();
		panelNonClothing.setBorder(BorderFactory.createTitledBorder("Non-Clothing"));
		panelNonClothing.setLayout(new GridLayout(1,3));
	//	panelNonClothing.setPreferredSize(new Dimension(1000,1000));
		panelNonClothing.add(bagPanel);
		panelNonClothing.add(toyPanel);
		panelNonClothing.add(curtainPanel);
		JPanel panelProduct=new JPanel();
		//panelProduct.setBorder(BorderFactory.createTitledBorder("Products:"));
		panelProduct.setPreferredSize(new Dimension(700, 500));
		panelProduct.setLayout(new BoxLayout(panelProduct, BoxLayout.Y_AXIS));
		//panelProduct.add(panelClothing);
		panelProduct.add(panelNonClothing);
		panelProduct.add(new JScrollPane(textArea));
		// Put the combo box and the add button into a panel
		//JPanel panelText = new JPanel();
		//panel.add(combo);
		//	panel.add(addButton);
		// Add the text area and panel to the content pane
		JFrame frame = new JFrame("Sewing Patterns:");
		
		
		JPanel panel =new JPanel ();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
	
	//	frame.setLayout(new javax.swing.BoxLayout(frame, javax.swing.BoxLayout.PAGE_AXIS));
		//frame.setLayout(new GridLayout(2, 1));
		frame.setPreferredSize(new Dimension(2000, 2000));
		//frame.add(new JScrollPane(textArea), BoxLayout.TOP);
		//frame.add(panelProduct, BoxLayout.BOTTOM);
		
		panel.add(panelClothing);
		panel.add(panelProduct);
		//textArea.setPreferredSize(new Dimension(1000, 2000));
		//panel.add(new JScrollPane(textArea));
		frame.add(panel);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
			
		
}
		
	
