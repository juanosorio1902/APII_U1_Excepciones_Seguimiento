package ui;

import java.util.Scanner;

import model.Market;


public class Main {
	public static Scanner lector = new Scanner(System.in);
	private Market market;
	
	public static void main(String[] args) {
		Main controller = new Main();
		int start = 0;
		do{
				System.out.println("Welcome to the menu:\n1.Add person \n2.Show login attemps \n0.Exit");
				int option=lector.nextInt();
				lector.nextLine();
				switch(option){
					case 1:
						controller.addPerson();					 
					break;				
					case 2:
						controller.showAttemps();					
					break;
				
					default:
					System.out.println("\nThe option entered is not valid");
					break;
				}
						
			System.out.println("\nMENU: 0 \nClose the the program: 1");
			start = lector.nextInt();
			lector.nextLine();
		}
		while (start == 0);
	}
	public Main() {
		
	}
	public void addPerson() {
		System.out.println("\nEnter the document type: \n1.TI \n2.CC \n3.PP \n4.CE");
		int t = lector.nextInt();
		lector.nextLine();
		System.out.println("\nEnter the number");
		String n = lector.nextLine();
		String message = market.addPerson(t,n);
		System.out.println("\n"+message);		
		
	}
	public void showAttemps() {
		int attemps = market.getAttemps();
		String message = "\nThe total attemps is: "+attemps;
		System.out.println(message);
		
	}

}
