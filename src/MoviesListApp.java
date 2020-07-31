import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;

public class MoviesListApp {
	
	private static Map<String, String> menu= new TreeMap<>();
	               
	public static void main(String[] args) {
		Scanner scnr= new Scanner(System.in);
		
		HashMap<String,String> choices= new HashMap<>();
		choices.put("drama","Citizen Kane" );
		choices.put("drama","Casablanca");
		choices.put("action","The Godfather" );
		choices.put(" drama", "Gone With The Wind");
		choices.put("drama","Lawrence Of Arabia");
		choices.put("musical","The Wizard Of Oz" );
		choices.put("drama", "The Graduate" );
		choices.put(" drama","On The Waterfront");
		choices.put("history","Schindler's List" );
		choices.put(" musical","Singin' In The Rain");
		
	
		
		boolean yesNo=true;// for app loop
		
		
		// Print Menus
		fillMapItems();
		printMenu();
		System.out.println();;
		while(yesNo== true){
		 // user enter any categories to display the films in the list that
		System.out.println( "Choose a category to view: action, drama, musical, history");
        String userChoice= scnr.next();
        
        //HashSet<String> userSelection= new HashSet<>();
        
 		 //match the category: action, drama, musical, history.  
              
              for (String movie: menu.values()) {    
                   if (menu.containsValue(userChoice)) {
                	   System.out.println(choices.get(userChoice));
                   }
             
            
	         System.out.println(" Would you like to continue? y/n");
	         yesNo =scnr.next().startsWith("y");
	  }
		}
	}
	 
	    
	 
	 
		
	


	 	//Get movie map
 		 //10 items for menu
 				private static void fillMapItems() {
 				
 				menu.put("Citizen Kane", "drama");
 				menu.put("Casablanca", "drama");
 				menu.put("The Godfather", "action");
 				menu.put("Gone With The Wind", "drama");
 			    menu.put("Lawrence Of Arabia", "drama");
 			    menu.put("The Wizard Of Oz", "musical");
 			    menu.put("The Graduate", "drama");
 			    menu.put("On The Waterfront", "drama");
 			    menu.put("Schindler's List", "history");
 			    menu.put("Singin' In The Rain", "musical");
 			    
 				}
	
 				  private static void printMenu() {
 					System.out.printf("%-25s","Title");
 					System.out.printf("%-25s","Catergory\n");
 					
 			      for(Map.Entry<String,String> entry: menu.entrySet()){
 			    	  System.out.println();
 				      System.out.printf( "%-25s,%-25s\n", entry.getKey(),entry.getValue()); 
 				  }
 		     }
	}
		
		  
		
		 

