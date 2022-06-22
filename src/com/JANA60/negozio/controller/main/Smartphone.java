package com.JANA60.negozio.controller.main;


public class Smartphone extends Good 
{

	//- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	//properties
		
	private String imei;
	private int memory;
	
	//constructor
	public Smartphone(int vat, String name, String brand, double price, int memory) 
	{
		super(vat, name, brand, price);
		this.memory= memory;
		imei= 	generate(8) 	+  
				"-" 			+
				generate(6)		+
				"-"				+
				generate(1)		+
				"-"				+
				generate(2)		;
	}
	//getters and setters
				
	private String fCypher() //creo una variabile random Integer, non int, per poter accedere al metodo toString()
	{
		Integer cypher = r.nextInt(10);
		return cypher.toString();	
	}
	
	private String generate(int max) //metodo privato per poter creare una stringa di numeri del valore che do io come attributo
	{
		String res="";
		for (int i=0; i<=max; i++)
		{
			res+=fCypher();
		}
		return res;
	}
	
	
	
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getImei() {
		return imei;
	}

	public String toString()
	{
		return "Il telefono " 							+
				super.getName()							+ 
				"di marca" 								+ 
				super.getBrand() 						+ 
				" avente codice " 						+
				super.getCode()							+ 
				" e IMEI " 								+
				getImei()								+ 
				"\nè equipaggiato con una memoria di " 	+
				getMemory() 							+
				"GB e viene venduto ad un prezzo di " 	+
				super.getFormattedPrice()				;
	}
	
}
