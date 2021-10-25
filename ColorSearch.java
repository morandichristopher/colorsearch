import java.util.ArrayList;

import java.util.Scanner;

public class ColorSearch {

	static ArrayList<String> colors = new ArrayList<String>();
	
	static void SearchColor(String color) {
	
		int counter = 0;
		for (int i = 0; i < colors.size(); i++) {
			counter++;
			if(colors.get(i).equalsIgnoreCase(color)) {
				System.out.println("The color " + color + " was found after " + counter + " searches");
				return;
			}
			
		}
		
		
		System.out.println("The color " + color + " was not found after " + counter + " searches");
	}
	
	public static void main(String[] args) {
		// TODO : Create array list and use while loop to search through it
		
		Scanner in = new Scanner(System.in);
		
		
		
		boolean inLoop = true;
		

		
		String incolor = "";
		while(inLoop == true) {
			System.out.println("Enter a colors, or 'Q' to quit: ");
			incolor = in.nextLine();
			
			if (incolor.equals("Q")) {
				break;
			}
			colors.add(incolor);
			}
		
		incolor = "";
		while(inLoop = true) {
			System.out.println("Enter a color to search, or 'Q' to quit: ");
			incolor = in.nextLine();
			
			if(incolor.equals("Q")) {
				break;
			}
			SearchColor(incolor);
		}
		
		

	}
	
	

}
