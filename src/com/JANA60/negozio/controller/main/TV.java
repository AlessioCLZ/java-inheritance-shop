package com.JANA60.negozio.controller.main;

public class TV extends Good 
{

	//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	
	//properties
	private int inches;
	private boolean smart;
	
	public TV(int vat, String name, String brand, double price, int inches, boolean smart) 
	{
		super(vat, name, brand, price);
		this.inches=inches;
		this.smart=smart;
	}

	public int getInches() 
	{
		return inches;
	}

	public void setInches(int inches) 
	{
		this.inches = inches;
	}

	public boolean isSmart() 
	{
		return smart;
	}

	public void setSmart(boolean smart) 
	{
		this.smart = smart;
	}
	
	public String toString()
	{
		
		
		String res ="";
		if (smart)
			res= "smart ";
		else
			res="non smart ";
		
		return 			"Il televisore " 							+
						res											+
						super.getName()								+ 
						"di marca" 									+ 
						super.getBrand() 							+ 
						" avente codice " 							+
						super.getCode()								+ 
						"\nha una grandezza di " 					+
						getInches() 								+
						"pollici e viene venduto ad un prezzo di " 	+
						super.getFormattedPrice()					;
	}

}
