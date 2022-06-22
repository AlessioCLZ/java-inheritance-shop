package com.JANA60.negozio.controller.main;

import java.util.Scanner;

public class Catalogue {
	
	static Scanner keyboard = new Scanner (System.in);

	public static void main(String[] args) 
	{
		String repeat;
		int cmd,products;
		Good[] goods;
		
		
		
		do
		{
			
			System.out.println("Benvenuto nel catalogo del negozio.");
			
			do
			{
				System.out.println("Quanti prodotti vuole registrare?");
				products = Integer.parseInt(keyboard.nextLine());
				if (products < 1)
					System.out.println("Non è possibile registrare meno di un prodotto");
			}while(products < 1);
			
			goods= new Good[products];
			
			
			for(int i=0;i<products;i++)
				{
					System.out.println("Inserire: \n1 per registrare un televisore, \n2 per registrare uno smartphone e \n3 per registrare delle cuffie.");
				
					cmd = Integer.parseInt(keyboard.nextLine());
				
					switch(cmd)
					{
						case 1:
						{
							_registerTV();
							goods[i]=_registerTV();
						}
						break;
						case 2:
						{
							_registerSP();
							goods[i]=_registerSP();
						}
						break;
						case 3:
						{
							_registerHP();
							goods[i]=_registerHP();
						}
						break;
						default:
							{
								System.out.println("Il valore inserito non è valido");
								i--;
							}
							
					}
				}
			
				System.out.println("Di seguito la lista di prodotti inseriti:");
				
				for(int i=0;i<goods.length;i++)
				{
					if (goods[i] instanceof Headphones)
					{
						System.out.println(((Headphones) goods[i]).toString());
					}
					if (goods[i] instanceof TV)
					{
						System.out.println(((TV) goods[i]).toString());
					}
					if (goods[i] instanceof Smartphone)
					{
						System.out.println(((Smartphone) goods[i]).toString());
					}
				}
				
		
			
			do
			{
				System.out.println("Vuoi registrare un nuovo catalogo?");
				
				repeat=keyboard.nextLine();
				
				if(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"))
					System.out.println("Wrong input. Please insert yes or no.");
				
			}while(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"));
			
			
		}while(repeat.equalsIgnoreCase("yes"));
		
		
	}
	

	private static Headphones _registerHP() 
	{
		System.out.println("Scriva il modello delle cuffie");
		String name = keyboard.nextLine();
		
		System.out.println("Scriva la marca delle cuffie");
		String brand = keyboard.nextLine();
		
		System.out.println("Scriva il prezzo delle cuffie");
		double price = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Scriva l'IVA applicata alle cuffie");
		int vat = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Scriva il colore delle cuffie");
		String colour = keyboard.nextLine();
		
		String wireless;
		do
		{
			System.out.println("Le cuffie sono wireless?");
			wireless = keyboard.nextLine();
			
			if (!wireless.equalsIgnoreCase("si") && !wireless.equalsIgnoreCase("no"))
				System.out.println("Input non valido, riprovare");
		}while(!wireless.equalsIgnoreCase("si") && !wireless.equalsIgnoreCase("no"));
		 
		boolean cabled;
		if (wireless.equalsIgnoreCase("no"))
			cabled= false;
		else
			cabled= true;
		
		Headphones cuffie = new Headphones(vat, name, brand, price, colour, cabled);
		
		return cuffie;
	}

	private static Smartphone _registerSP() 
	{
		System.out.println("Scriva il modello dello smartphone");
		String name = keyboard.nextLine();
		
		System.out.println("Scriva la marca dello smartphone");
		String brand = keyboard.nextLine();
		
		System.out.println("Scriva il prezzo dello smartphone");
		double price = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Scriva l'IVA applicata allo smartphone");
		int vat = Integer.parseInt(keyboard.nextLine());
		
		int memory;
		do
		{
			System.out.println("Scriva la grandezza della memoria dello smartphone in GB");
			memory =Integer.parseInt(keyboard.nextLine());
			
			if (memory <=0)
				System.out.println("Gli smartphone hanno bisogno di memoria di massa per poter funzionare");
			
		}while(memory <=0);
		
		Smartphone telefono = new Smartphone(vat, name, brand, price, memory);
		
		
		
		return telefono;
	}

	private static TV _registerTV() 
	{
		System.out.println("Scriva il modello del televisore");
		String name = keyboard.nextLine();
		
		System.out.println("Scriva la marca del televisore");
		String brand = keyboard.nextLine();
		
		System.out.println("Scriva il prezzo del televisore");
		double price = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Scriva l'IVA applicata al televisore");
		int vat = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Scriva la grandezza in pollici del televisore");
		int inches = Integer.parseInt(keyboard.nextLine());
		
		String smart;
		do
		{
			System.out.println("Si tratta di una smart tv?");
			smart = keyboard.nextLine();
			
			if (!smart.equalsIgnoreCase("si") && !smart.equalsIgnoreCase("no"))
				System.out.println("Input non valido, riprovare");
		}while(!smart.equalsIgnoreCase("si") && !smart.equalsIgnoreCase("no"));
		 
		boolean isSmart;
		if (smart.equalsIgnoreCase("si"))
			isSmart= true;
		else
			isSmart= false;
		
		TV tivu = new TV(vat, name, brand, price, inches, isSmart);
		
		return tivu;
	}

}
