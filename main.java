package Garden;

import java.util.Scanner;

import PostGame.AirMailService;
import PostGame.GroundMailService;

public class main {
	private static GardenFactory gardenFactory;
	private static Gardener gardener;


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
	    String gardenOption="";
	    System.out.println("Persian(P) or Japanese(j)? ");
	    
	    if (userInput.hasNextLine()) {
	    	gardenOption=userInput.nextLine();
        	System.out.println("you entered "+gardenOption);
        	if(gardenOption.equalsIgnoreCase("P")) {
        		gardenFactory = new PersianGardenMaker();
			}else if(gardenOption.equalsIgnoreCase("J")) {
				gardenFactory  = new JapaneseGardenMaker();
			}   
        }
	gardener= new Gardener(gardenFactory);
	gardener.demo_Garden();
	    
	    
	    

	}

}
