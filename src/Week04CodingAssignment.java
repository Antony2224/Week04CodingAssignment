
public class Week04CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 * 
			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

			b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

			i. Make sure that there are 9 elements of type int in this new array.  

			ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

			iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			
			2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			
			b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			
			3. How do you access the last element of any array?
			
			4. How do you access the first element of any array?
			
			5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			
			6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			
			7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
			8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			
			9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
			10. Write a method that takes an array of double and returns the average of all the elements in the array.
			
			11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
			12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
			13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
					 */
		//Problem 1 solution
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93}; 
		ages[0] -= ages[ages.length-1];
		int[] ages2 = new int[9];
		ages2[0]= 500;
		ages2[8]= 300;
		ages2[0] -= ages2[ages2.length-1];
		System.out.println(ages2[0] +" "+ages2[8]);
		// Line for a more readable console
		System.out.println(".....");
		int sumAges = 0;
		for(int age : ages) {
			sumAges += age;
			
		}
		sumAges /= ages.length;
		//Prints out the average of 17 because Ages[0] == -90
		System.out.println(sumAges);
		// Problem 2 part a solution
		String[] names = new String[]{ "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int sumLetters =0;
		// Line for a more readable console
		System.out.println(".....");
		// Separates the individual names in the array of names
		for (int i =0; i < names.length; i++) {
			//Separates the letters that make up the names
			for (int j = 0; j < names[i].length(); j++) {
				 sumLetters += names[i].indexOf(j);
			}
		}
		//For some reason at the end of code sumLetters is a negative number, so wrote this line to return a positive number
		sumLetters *= -1;
		System.out.println(sumLetters /= names.length );
		//Problem 2 part b solution
		for (int i =0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		//Problem3 Solution
		// You use the code (arrayName.leghth-1) to access the last element of your array
		
		//problem4 Solution
		// You can just use the code(arrayName[0]) to access the first element of the array because all arrays start at index of 0
		
		//Problem5 Solution
		//Line for a more readable console
		System.out.println();
		//Line for a more readable console
		System.out.println(".....");
		int[] nameLengths = new int[names.length];
		int sumLetters2 = 0;
		//Separates and adds the amount of letters in each name to the Array nameLengths
		for(int i = 0; i < names.length; i++) {
			for(int j=0; j < names[i].length(); j++) {
				sumLetters2 += names[i].indexOf(j);
			}
			//For some reason at the end of code sumOfLetters is a negative number, so wrote this line to return a positive number
			sumLetters2*= -1;
			nameLengths[i] = sumLetters2;
			
			sumLetters2 = 0;
		}
		//Problem6 Solution
		int sum =0;
		for(int i =0; i< nameLengths.length; i++) {
			sum+= nameLengths[i];
		}
		System.out.println(sum);
		
	}
	//Problem7 Solution
	public static String wordMultiplication (String word, int n) {
		String newWord = ""; 
		for(int i=1; i <= n; i++) {
			 newWord += word;
		 }
		 return newWord;
	}
	//Problem8 Solution
	public static String fullName (String firstName, String lastName) {
		String fullName = firstName +" "+ lastName;
		return fullName;
	}
	//Problem9 Solution
	public static boolean greaterThan100 (int[] numbers) {
		int sum =0;
		for(int number :numbers) {
			sum+= number;
		}
		if(sum >100) {
			return true;
		}
		else {
			return false;
		}
	}
	//Problem10 Solution
	//Finds and returns the average of the double array numbers
	public static double averages (double[] numbers) {
		double sum =0;
		for (double number : numbers) {
			sum+=number;
		}
		return sum/numbers.length;
	}
	//Problem11 Solution
	public static boolean averages(double[] numbers , double[] numbers2) {
		double sum =0;
		double sum2 =0;
		//adds the numbers from the array numbers together
		for(double number : numbers) {
			sum +=number;
		}
		//adds the numbers from the array numbers2 together
		for(double number2 : numbers2) {
			sum2+= number2;
		}
		//checks to see if the average of the array numbers is greater than the array of numbers2
		if((sum /= numbers.length) > (sum2 /= numbers2.length)) {
			return true;
		}
		else {
			return false;
		}
	}
	//Problem12 Solution
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && (moneyInPocket > 10.50) ) {
			return true;
		}
		else {
			return false;
		}
	}
	//Problem13 Solution
	//Method returns true if hitPoints =0;
	//Created method to possibly use in a while loop for a game over scenario
	public static boolean isGameOver (int hitPoints) {
		//checks if hitPoints is greater than 0 and returns false if so
		if(hitPoints > 0) {
			return false;
		}
		//If hitPoints are less than or equal to 0 returns true
		else {
			return true;
		}
	}
	//Public void method that uses isGameOver method
	public static void game(String[] args){
		//While loop that uses isGameOver Method
		int hp =100;
		while (isGameOver(hp) != true) {
			hp-= 5;
			System.out.println(hp);
		}
	}
}
