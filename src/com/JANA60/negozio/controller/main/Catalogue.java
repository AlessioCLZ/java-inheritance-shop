package com.JANA60.negozio.controller.main;

import java.util.Scanner;

public class Catalogue {

	public static void main(String[] args) 
	{
		String res, repeat;
		int cmd,products;
		Good[] goods;
		
		Scanner keyboard = new Scanner (System.in);
		
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
				System.out.println("Inserire: \n1 per registrare un televisore, \n2 per registrare uno smartphone e \n3 per registrare delle cuffie.");
				cmd = Integer.parseInt(keyboard.nextLine());
				
				switch(cmd)
				{
					case 1:
						res=_registerTV();
					break;
					case 2:
						res=_registerSP();
					break;
					case 3:
						res=_registerHP();
					break;
					default:
						res= "Il valore inserito non è valido";
					
				}
				System.out.println(res);
				
			
		
			
			do
			{
				System.out.println("Vuoi registrare un nuovo catalogo?");
				
				repeat=keyboard.nextLine();
				
				if(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"))
					System.out.println("Wrong input. Please insert yes or no.");
				
			}while(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"));
			
		}while(repeat.equalsIgnoreCase("yes"));
		
		
	}

}
