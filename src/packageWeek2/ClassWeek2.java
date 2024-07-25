package packageWeek2;

import java.util.Scanner;

public class ClassWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Boolean operators 
		 */
		int tony = 2;
		int mary = 3;
		int tom = 27;
		int martha = 50;
		int james = 50;
		boolean isTonyOlder = tony > mary;
		System.out.println("Is Tony Older than Mary? " + isTonyOlder);
		boolean isTonyYounger = tony < mary;
		System.out.println("Is Tony Younger than Mary? " + isTonyYounger);
		boolean jamesAgeSame = james == martha;
		System.out.println("is James the same age as Martha? " + jamesAgeSame);	
		boolean greaterThanOrEqual = james >= tom;
		System.out.println("Is James' age greater than or equal to Tom? " + greaterThanOrEqual);
		boolean lessThanOrEqual = mary <= tony;
		System.out.println("Is Mary's age less than or equal to Tom's? " + lessThanOrEqual);
		boolean notEqual = martha != james;
		System.out.println("Is Martha's age different than James' age? " + notEqual);
		
		System.out.println("\r\n");
		
		/*
		 * Conditionals
		 * 
		 * Is a person old enough to drive?
		 */
		int legalAge = 16;
		String firstName = "Steven";
		int personAge = 17;
		boolean ableToDrive = personAge >= legalAge;
		if (ableToDrive) {
			System.out.println(firstName + " is legally old enough to drive.");
		}
		/* or no need to declare the boolean, the expression can go in the parenthesis of 
		 * the "if statement*/
		if (personAge >= legalAge) {
			System.out.println(firstName + " is legally old enough to drive!!!!!");
		}
		
		System.out.println("\r\n");
		
		// if else statements
		String firstName2 = "Joseph";
		int personAge2 = 10;
		boolean ableToDrive2 = personAge2 >= legalAge;
		if (ableToDrive2) {
			System.out.println (firstName2 + " is legally old enough to drive, hurray!");
			
		} else {
			System.out.println ("Sorry, " + firstName2 + " is not old enough to drive. Please wait " + (legalAge - personAge2) + " years to get your license.");
		}
		
		
		System.out.println("\r\n");
		
		/*
		 * if - else if - else statements
		 * in this first example, we will change ages depending on first name 
		 */
		
		if (firstName == "Nathalia") {
			personAge = 21;
		} else if (firstName == "Steven") {
			personAge = 17;
		} else if (firstName == "Joseph") {
			personAge = 10;
		} else if (firstName == "Nethaniel") {
			personAge = 8;
		} else {
			personAge = 0;
		}
		boolean ableToDrive3 = personAge >= legalAge;
		if (ableToDrive3) {
			System.out.println(firstName + " is legally old enough to drive.");
		} else {
			System.out.println("Sorry, " + firstName + " is not old enough to drive. Wait " + (legalAge - personAge) + " more years.");
		}
		System.out.println(firstName + " is " + personAge + " years old.");
		
		System.out.println("\r\n");
		
		/*
		 * another way to change out to different outputs based on the value of a single
		 * variable is by using the "switch" statement.
		 */
		
		/*
		 * start by defining a variable type, we'll continue with the name-age correlation 
		 * which has already defined the String firstName 
		 */
	     
		switch (firstName) {
		case "Nathalia":
			System.out.println("21 yo");
			break;
		case "Steven":
			System.out.println("17 yo");
			break;
		case "Joseph":
			System.out.println("10 yo");
			break;
		case "Nethaniel":
			System.out.println("8 yo");
			break;
			default:
				System.out.println("unknown user");
		}
		
		/*
		 * Now we will practice the "switch" conditional, where we define a
		 * type and its value. Then we script different scenarios by using "case" 
		 * and assigning a new value to the type (in this example it will be int ageOfKid).
		 * Then we use System.out.println() to say what prints depending on the specific
		 * value of the type (int ageOfKid). 
		 * Notice the use of "case" requires a : at the end
		 * Notice, also, that a "break" is needed to stop the program once the value is met
		 * 
		 */
		
		int ageOfKid = 21;
		    switch (ageOfKid) {
		      case 21 :
		        System.out.println("Nathalia is " + ageOfKid + " years old.");
		        break;
		      case 17 :
		        System.out.println("Steven is " + ageOfKid + " years old.");
		        break;
		      case 10 :
		        System.out.println("Joseph is " + ageOfKid + " years old.");
		        break;
		      case 8 :
		        System.out.println("Nethaniel is " + ageOfKid + " years old.");
		        break;
		        default :
		          System.out.println("Error: age not recognized");
		        }
		    
		    System.out.println("\r\n");
	/** The next section are Loops
	 *  there are diferent kinds of loops
	 *  for
	 *  while
	 *  do while
	 *  enhanced for 
	 *  we will play with the first three. 
	 */
		    
		    /*the first one we will look at is 'while' loops. We begin by declaring a
		     * variable and initializing it (giving it a value) 
		     */
		  int currentAge = 0;
		      while (currentAge < 16) {
		        System.out.println("At " + currentAge + " You are not old enough to drive");
		        currentAge ++;
		        System.out.println( "You have " + (17 - currentAge) + " years to go.");
		      }
		      
		      System.out.println("\r\n");
		      
		      
		      
		      /**the next loop we'll look at is "for" loops
		       * 'for' loops require three pieces of information-- declare a variable,
		       * condition expressed as a boolean, and the post-iteration or increment
		       */
		      
		      for (int i = 0; i <= 100; i +=5) {
		        if (i > 0) {
		          System.out.println ("I deposited $5 dollars in my bank"
		            + " account, now my balance is $" + i);
		        }
		      
		      }
		      
		      System.out.println("\r\n");
		      
		      /** the last loop we will look at is the 'do while' loop. Again we start by 
		       * declaring a variable and initializing it. Then we provide the increment and 
		       * the action we want executed. The conditional boolean expression is given 
		       * at the very end
	
		       */
		      
		      int donationAmount = 0;
		      do {
		        donationAmount += 3;
		            System.out.println("So far we have donated $" + donationAmount);
		      } while (donationAmount <= 100);
		
		      
		      System.out.println("\r\n");
		      
		      
		      /** Now we will look at User Input. We will start by using The Scanner class
               * found in the java.util package. To use the Scanner class, 
               * create an object of the class and use any of the available methods 
               * found in the Scanner class documentation. In our example, we will use 
               * the nextLine() method, which is used to read Strings: 
               */
		      
		      
		      boolean loggedIn = false;
		      Scanner sc= new Scanner(System.in);    
		      while (!loggedIn) {
		      System.out.print("Enter username: ");   
		      String username = sc.nextLine();   
		      System.out.print("Enter password: ");  
		      String password = sc.nextLine();   
		      if (username.equals("samy123") && password.equals("12345")) {
		      System.out.println("Welcome back " + username);
		      loggedIn = true;
		          } else { 
		      System.out.println("Inaccurate credentials!"); 
		      
		      break; //inserted this break so that the program can go to the next loop
		      } // end of else 
		      } // end of while

		      
		      
		      
		      /** Below is my attempt
		       * to modify the above script of username and password input so that it only
		       * accepts three attempts 
		       */
		      
		      boolean loggedIn2 = false;
		      Scanner userInput = new Scanner(System.in);    
		      while (loggedIn2 == false) {
		      System.out.print("Enter username: ");   
		      String username = userInput.nextLine();   
		      System.out.print("Enter password: ");  
		      String password = userInput.nextLine();   
		      if (username.equals("samy123") && password.equals("12345")) {
		      System.out.println("Welcome back " + username);
		      loggedIn2 = true;
		          } else { 
		      System.out.println("Inaccurate credentials!"); 
		      } // end of else
		      if (username.equals("samy123") && password.equals("12345")) {
	              System.out.println("Welcome back " + username);
	              loggedIn2 = true;
	                  } else { 
	              System.out.println("Inaccurate credentials!");
	                  } // end of second else
		      if (username.equals("samy123") && password.equals("12345")) {
	              System.out.println("Welcome back " + username);
	              loggedIn2 = true;
	                  } else { 
	              System.out.println("Inaccurate credentials. You have been locked out");
	              break;                    
	                  } //end of third else
		      } // end of while
		      
		      System.out.println("\r\n");
		      
		      
		      /** the above code obviously did not work, it goes to locked out in 
		       * the first wrong username password input 
		       *
		       */
		      
		      
		      boolean loggedIn3 = false;
		      Scanner sc3= new Scanner(System.in);    
		      for (int i = 1; i <= 3; i++) {
		      while (!loggedIn3) {
		      System.out.print("Enter username: ");   
		      String username = sc3.nextLine();   
		      System.out.print("Enter password: ");  
		      String password = sc3.nextLine();   
		      if (username.equals("samy123") && password.equals("12345")) {
		      System.out.println("Welcome back " + username);
		      loggedIn3 = true;
		          } else { 
		      System.out.println("Inaccurate credentials!"); 
		      } // end of else
		      break;
		      } // end of while
		      if (i == 3) {
		        System.out.println("This is your " + i + "rd failed attempt. Goodbye!");
		      } // end of if
		      } // end of for
		      
		      /** the code above worked. The last piece I needed was to insert the "break"
		       * after the end of the "else" statement so that loop could end and the "for"
		       * loop could continue through its iterations (up to three iterations). 
		       * I got the idea to add the "for" loop from the following forum:
		       * https://stackoverflow.com/questions/32773581/how-to-make-a-loop-that-only-loops-3-times
		       * which was one of the results of the following google search :
		       * "how do i code in java a boolean that is false only three times"
		       * Peace!
		       *
		       */
		      }
	
	
	}
		

	


