package packageWeek2;

import java.util.Scanner;

public class Week02BooleanConditionalsLoopsLab {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //
    // BOOLEANS and CONDITIONALS:
    //
    
    // 1. Variable Declaration:
    //      a. Create a variable named age and assign it a value of 14

    int age = 17;
   
    
    // 2. Print a Boolean Expression:
    //      a. Print the boolean expression age >= 16 to the console and note the results.
    //      a. Change the value of age to 18 and print again.

        //System.out.println(age >=16 );
        
        
    
    // 3. Can you drive?
    //      a. Using a conditional, print one of the following:
    //              i. "You can drive" if age is greater than or equal to 16
    //              ii. "You cannot drive" otherwise
    //
    //      a. Change the value of age and rerun to see the result
       
      System.out.println("\rQuestion 3: ");
      
      if (age >= 16 ) {
          System.out.println("You can drive");
        }else {
          System.out.println("You cannot drive");
        }

    
    // 4. Update Solution to Question 3 as follows:
    //      a. Add a new variable called hasLicense before the conditional.
    //      b. Change the boolean expression in the conditional to additionally 
    //              include the need for hasLicense to be true.
    //      c. Try changing the values of age and hasLicense and note the different results.
        
        

    System.out.println("\rQuestion4:");
    
    
        boolean hasLicense = true;
    
        if (age >= 16 && hasLicense == true ) {
            System.out.println("You can drive");
          }else {
            System.out.println("You cannot drive");
          }
    
    // 5. Milk?
    //      a. Create two new variables - costOfMilk and thirstLevel
    //      b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
    //              or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
    //      c. Change the values and note the different results.
       
        System.out.println("\rQuestion 5:");  
        
        double costOfMilk = 5.00;
        int thirstLevel = 7;
        if (costOfMilk < 2.50 || thirstLevel > 6) {
          System.out.println("Milk Please");
          
        }else {
          System.out.println("No Thanks");
        }

          System.out.println("\r\n");
    // 6. Cookie Distribution: 
    //          Note:  You will evenly distribute all of the cookies to the children 
    //                  and as the adult you get to keep the remaining cookies for yourself.
    //
    //      a. Create two variables called numberOfCookies and numberOfChildren.
    //      b. Initialize the two variables to integer values.
    //      b. Use a conditional to print the following based on the following conditions:
    //              i. If there are 0 cookies remaining, print "Sad Face"
    //              ii. If there are less than 2 cookies, print "Yes!"
    //              iii. If there are less than 5 cookies, print "Whoohoooo!"
    //              iv. If there are 5 or more cookies, print "Jackpot!"
        int numberOfCookies = 13;
        int numberOfChildren = 7;
       int cookiesLeft = numberOfCookies % numberOfChildren; 
        if (cookiesLeft == 0) {
          System.out.println("Sad Face");
        }else if (cookiesLeft < 2) {
          System.out.println("Yes!");
        }else if (cookiesLeft < 5) {
          System.out.println("Whoohoooo!");
        }else if (cookiesLeft >= 5) {
          System.out.println ("Jackpot!");
          
        }else { 
         
        }
    
         System.out.println("\r\n");
         
    // 7.  Loyalty Member Program:
    //      a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
    //      b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
    //      c. Using a switch, set the value of loyaltyMemberDiscount based on 
    //              the following loyaltyMemberStatus scale: 
    //              i. "SILVER" is 0.10
    //              ii. "GOLD" is 0.15
    //              iii. "PLATINUM" is 0.25
         String loyaltyMemberStatus = "GOLD";
         double loyaltyMemberDiscount = 0.0;
         switch (loyaltyMemberStatus) {
           case "SILVER" :
             System.out.println("Your Loyalty Member Discount is: 10%");
             break;
           case "GOLD" :
             System.out.println("Your Loyalty Member Discount is: 15%");
             break;
           case "PLATINUM" :
             System.out.println("Your Loyalty Member Discount is: 25%");
             break;
           default :
             System.out.println("Your Loyalty Member Discount is: 0%");
         }

    
    // 8. Using the Loyalty Member Program variables from Question 7, do the following:
    //      a. Create a variable called billTotal and assign a value
    //      b. Create a variable called adjustedTotal and assign it the billTotal minus 
    //              the loyaltyMemberDiscount percent of the billTotal
    //      c. If the adjustedBillTotal is greater than $500 upgrade the 
    //              loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
         double billTotal = 700.98;
         double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
         if (adjustedTotal >= 500 && loyaltyMemberStatus.equals("SILVER")) {
           loyaltyMemberStatus = "GOLD";
           loyaltyMemberDiscount = 0.15;
         }else if (adjustedTotal >= 500 && loyaltyMemberStatus.equals("GOLD")) {
           loyaltyMemberStatus = "PLATINUM";
           loyaltyMemberDiscount = 0.25;
         }else {
          
         }
           System.out.println("Your new Loyalty Member Status is: " + loyaltyMemberStatus);
           System.out.println("Your new Loyalty Member Discount is: " + (loyaltyMemberDiscount * 100) + "%");
           
           System.out.println("\r\n");
    // 9. Login -- username & password:
    //      a. Create two variables, username and password
    //      b. Create a conditional that prints one of the following:
    //              i. "login successful" if the username is "Tommy123" and the password is "12345"
    //              ii. "access denied" otherwise
           System.out.print("\rQuestion 9: ");
           
           String username = "Tommy123";
           String password = "12345";
           if (username.equals("Tommy123") && password.equals("12345")) {
             System.out.println("login successful");
             
           }else {
             System.out.println("access denied");
           }
    
          
         
    //
    // LOOPS:
    //
    
    // 10. Write a for loop that prints each number from 0 to 9
           System.out.print("\rQuestion 10:");
           
        
           int number = 0;
         
          while (number <=9) {
            
           System.out.println(number);
           number++;
          }
          
    
    
    // 11. Write a for loop that prints each number from 10 to 0 backwards
          System.out.println("\r\n");
               
          for (int test = 10; test >=0 ; test-=1) {
             System.out.println(test);
         }
    
    // 12. Write a for loop that prints every other number from 0 to 100
          System.out.println("\r\n"); 
          
          for (int evenNumber = 0; evenNumber<=100; evenNumber+=2) {
              System.out.println(evenNumber);
            }
    
    
    // 13. Write a for loop that iterates from 0 to 100 and prints 
    //          "EVEN" if the number is even and "ODD" if it's odd
          System.out.println("\r\n");
          
          for (int numberX = 0; numberX <= 100; numberX ++) {
            if (numberX % 2 == 0) {
              System.out.println(numberX + " EVEN");
            }else {
              System.out.println(numberX + " ODD");
            }//end of else
          }//end of for
    
    
    // 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
    //          within the loop, divide each number by 3 and print the remainder to the console.
          System.out.println("\r\n");
          
          for (int numberZ = 100; numberZ >= 0; numberZ-=1) {
            System.out.println(numberZ + " divided by 3 has a remainder of " + numberZ % 3);
          }
    
          
          System.out.println("\rChecking results from assignment Questions");
          
          System.out.println( "hello world".charAt(0) != 'H');
          
         System.out.println("\r\n");
         
         //quiz questions
         
         System.out.println("\n Quiz Questions \n");
         

for (int index = 0; index <= 99; index++) {
if (!(index % 2 == 0)) {
  System.out.println (index);
}
  }
System.out.println("\n Quiz Questions \n");

for (int i = 10; i > 0; i--) {

  System.out.println(i);

}

System.out.println("\n Quiz Questions \n");

String name = "Tommy";

int age5 = 52;

if (name == "Tommy") {

  System.out.println("Hi, Tommy!");

} else if (age5 == 52) {

  System.out.println("52 years old.");

}

System.out.println("Out of conditional.");

System.out.println("\n Quiz Questions \n");


double moneyInWallet = 4.50;

double costOfMilk3 = 1.99;

if (moneyInWallet >= costOfMilk3 * 2) {

  System.out.println("Let's buy two gallons.");

} else if (moneyInWallet >= costOfMilk3) {

  System.out.println("Let's buy one gallon.");

} else {

  System.out.println("Way too expensive!");

}
System.out.println("\nAssignment Questions");
/**
 * It's All About the Base

Given variables power, base, and result, use a for loop to raise the base to the power of power (i.e. base^power).
The loop should run from 1 to the number stored in power
In the loop body, result should be multiplied by the base every time the loop iterates and that value stored in result, like this: result *= base or result = result * base
Print the value of result to the console
 */
int base = 2;
int power = 5;
int result = 1;
for (int i= 1; i<= power; i++){
  
  result = result * base;
} 
System.out.println(result);


int counter = 0;
for (int i = 1; i < 100; i += 2) {
    counter++;
    System.out.println(counter);
}

System.out.println("\n Assignment question 7 Java 2 Loops part 1 ");

/**
 * Is a Number Between 1 and 100?

Given the variable userNumber, do the following:
Check to see if userNumber is between 1 and 100 (Valid numbers are 1, 100, and all numbers in between)
If it is, run a while loop that prints all integer values starting with userNumber to 100
If not, print "Your number was not between 1 and 100." to the console.
 */
int userNumber = 98;
boolean check = userNumber < 1 || userNumber >100;
System.out.println(check);
if (check){
  System.out.println ("Your number was not between 1 and 100.");
}

while (userNumber >=1 && userNumber <= 100) {
  System.out.println (userNumber);
  userNumber = userNumber + 1;}

//Instructor Answer
System.out.println("\n Instructor Anwer to question 7");
if (userNumber >= 1 && userNumber <= 100) {
  int i = userNumber;
  while(i <= 100) {
      System.out.println(i);
      i++;
  } 
} else {
  System.out.println("Your number was not between 1 and 100.");
}


System.out.println("\n Question 13 Java 2 Loops (part2)");
/**
 * do while Loop

Using the given variable userNumber, create an if/else statement that checks to see 
if userNumber is more than 10 and under 100.
If it is, execute a do while loop that prints the value of userNumber to the
 console AND decrements it by 1 until userNumber is less than or equal to 10.
Otherwise, if userNumber is not greater than 10 and less than 100, print (exactly) 
"Your number is not a value that is more than 10 and less than 100." to the console,
 including the "." at the end
 */
int userNumber2 = 14;
if (userNumber2 > 10 && userNumber2 <100){
  do {
      System.out.println (userNumber2);
     userNumber2 = userNumber2 - 1;
                  }while (userNumber2 >= 10);
}else {
  System.out.println("Your number is not a value that is more than 10 and less than 100.");
}

System.out.println("\n Question 15");

/**
 * Pick a Loop, any Loop

Write a loop (any type of loop will work) that does a countdown using the given 
variable countDown.
Check to make sure the number stored in countDown is not larger than 10,
 but is greater than or equal to 3
The loop should run from the value stored in countDown down to 1
Each time the loop runs, print the value of the counter followed by three periods (…)
Once out of the loop, print "We have lift off!"
Use System.out.println() to print everything to the console
If countDown is less than 3 or greater than 10, then the only message printed to 
the console is "We have lift off!"
 */
int countDown= 3;
//if ( countDown <=11 && countDown >=3) {
//  for (int i= countDown; i >0; i--) { 
//  System.out.println (countDown-- + "...");
//}
//  System.out.println("We have lift off!");
//  }
//else {
//    System.out.print("We have lift off!");
//  }
/**Instructor answer
 * 
 */
if (countDown <= 10 && countDown >= 3) {
  while (countDown >= 1) {
      System.out.println(countDown + "...");
      countDown--;
  }
}
System.out.println("We have lift off!"); 

System.out.println("\n Question 17");
/**
 * do While Loop using length()

Given the variable userWord and wordLength, create a do while loop that prints the word
 stored in userWord.
Declare a variable called counter and set it equal to wordLength, use counter
 to keep track of the count
If wordLength is less than 5 characters, then print userWord to the console 1 time
If the word is 5 or more characters long, then print userWord to the console wordLength 
number of times
This is how it should work: if userWord is "Loops", then wordLength would equal 5 and 
so "Loops" would print 5 times. If the word is "Java", then "Java" would only print 1 
time because wordLength would less than 5
 */


//String userWord = "asked";
//int wordLength = userWord.length();
//int counterA = wordLength;
//if (wordLength>=5) {
//do {
//  System.out.println(userWord);
// counterA--;
//}while (counterA >= 1);
//}else {System.out.println(userWord);}

System.out.println("\n Question 17 Instructor answer");
String userWordX = "Hello";
int wordLengthB = userWordX.length();
int counterx = wordLengthB;
do {
    System.out.println(userWordX);
    if ( wordLengthB < 5 ) {
        break;
    } 
    counterx--;
} while ( counterx > 0 );


System.out.println("\n Question 19");

/**
 * Concatenate A String its Length Number of Times

Write a for loop that starts at zero and loops the length of a user-entered String 
saved in the given variable userWord. Every time the loop runs, the userWord is added
 to the given variable longString to make a repeating string.
For example, if String userWord = "Hello", the loop would run 5 times and concatenate the
 word "Hello" to longString 5 times, because "Hello" has 5 letters. The output would be 
 HelloHelloHelloHelloHello.
Every time the loop processes, userWord should be added to longString
Outside of the for loop, use System.out.println(); to print longString to the console.
 */

String userWord = "seven77";
String longString ="";
int wordLength = userWord.length();
System.out.println(wordLength);
for (int i= wordLength ; i> 0; i--) {
  longString = userWord + longString;
    
}System.out.println(longString);

}
}
