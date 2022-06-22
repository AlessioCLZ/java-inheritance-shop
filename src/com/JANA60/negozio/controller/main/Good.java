package com.JANA60.negozio.controller.main;

import java.text.DecimalFormat;
import java.util.Random;

public class Good 
{
	/*
	 * Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
	- codice (numero intero)
	- nome
	- marca
	- prezzo
	- iva
	Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
	- il codice prodotto sia accessibile solo in lettura
	- gli altri attributi siano accessibili sia in lettura che in scrittura
	- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato
	 */
	
	//properties
	private int code, vat, maxCode=10000;
	private String name, brand;
	private double price;
	
	private DecimalFormat df = new DecimalFormat("0.00€");
	
	protected Random r = new Random();

	//getters and setters
		
	public int getVat() 
	{
		return vat;
	}

	public void setVat(int vat) 
	{
		this.vat = vat;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		
		this.name = name;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public int getCode() 
	{
		return code;
	}

	// constructors
	public Good(int vat, String name, String brand, double price) {
		super();
		this.vat = vat;
		this.name = name;
		this.brand = brand;
		this.price = price;
		code = r.nextInt(maxCode);
	}
	
	//methods
	
	public String getFormattedPrice()
	{
		double totalPrice= price + (price * (vat/100.0));
		
		return df.format(totalPrice);
	}
	
	
	
}
