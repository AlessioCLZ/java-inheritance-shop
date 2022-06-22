package com.JANA60.negozio.controller.main;

public class Headphones extends Good 
{
	//- Cuffie, caratterizzate dal colore e se sono wireless o cablate
	
	//properties
	private String colour;
	private boolean cabled;
	
	public Headphones(int vat, String name, String brand, double price, String colour, boolean cabled) 
	{
		super(vat, name, brand, price);
		
		this.colour=colour;
		this.cabled=cabled;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isCabled() {
		return cabled;
	}

	public void setCabled(boolean cabled) {
		this.cabled = cabled;
	}
	
	public String toString()
	{
		
		
		String res ="";
		if (cabled)
			res= "con cavo ";
		else
			res="wireless ";
		
		return 			"Le cuffie " 								+
						res											+
						super.getName()								+ 
						"di marca" 									+ 
						super.getBrand() 							+ 
						" aventi codice " 							+
						super.getCode()								+ 
						"\nsono disponibili nella colorazione " 	+
						getColour() 								+
						" e viene venduto ad un prezzo di " 	+
						super.getFormattedPrice()					;
	}

}
