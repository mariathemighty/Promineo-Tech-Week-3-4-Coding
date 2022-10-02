
public class Wk4CodingAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.	Create an array of int called ages that contains the following values:3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		//System.out.println("-1a-");
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//System.out.println("-1b-");
		
		int[] newAges = new int[ages.length + 1];
		for( int i = 0; i < ages.length; i++) {
			newAges[i] = ages [i];
		}
		newAges[ages.length]= 40;
		
		System.out.println(newAges[ages.length] - newAges[0]);
		
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//System.out.println("-1c-");
		
		int i = 0;
		int sumAge = 0;
			for( int age : newAges) {
				sumAge += age;
				}
		int avgAge = sumAge / newAges.length;
		
//		System.out.println(sumAge);
//		System.out.println(newAges.length);
		System.out.println(avgAge);
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//System.out.println("-2a-");
		
		int sumName = 0;
		for(String name : names) {
			int nameLength = name.length();
			sumName += nameLength;
		}
		
		int avgName = sumName / names.length;
		
		//System.out.println(sumName);
		//System.out.println(names.length);
		System.out.println(avgName);
		
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		//System.out.println("-2b-");
		
		String concatName = "";
		for(String name : names) {
			concatName += name + " ";
		}
		
		System.out.println(concatName);
		
//		3.	How do you access the last element of any array?
		//System.out.println("-3-");
		
		//System.out.println("Using element index (array.length-1)");
		
//		4.	How do you access the first element of any array?
		//System.out.println("-4-");
		
		//System.out.println("Using element index 0");
		
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		//System.out.println("-5-");
		
		int[] nameLengths = new int[names.length];
		for (i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
				//System.out.println(nameLengths[i]);
			}

		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		//System.out.println("-6-");
		
		int sumLengths = 0;
		for(int length : nameLengths) {
			sumLengths += length;
		}
		System.out.println(sumLengths);
		
//*****METHODS FOR QUESTIONS 7-13 LABELED BELOW, OUTSIDE MAIN METHOD. COMMENTS HERE ARE TESTS*****
		
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//System.out.println("-7-");
		//String greeting = concatWord("Yo", 5); 
		//System.out.println(greeting);
		
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//System.out.println("-8-");
		//String fullName = createFullName("Maria", "Ramos");
		//System.out.println(fullName);	
		
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		//System.out.println("-9-");
		//int[] myArrey9 = {20, 50, 2};
		//System.out.println(confirmSumGreater100(myArrey9));
		
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		//System.out.println("-10-");
		//double[] myArrey10 = {10.7, 19, 26};
		//System.out.println(calculateArrAvg(myArrey10));
		
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		//System.out.println("-11-");
		//double[] myArrey11A = {1, 3, 5};
		//double[] myArrey11B = {2, 3, 4};
		//System.out.println(determineFirstArrAvgGreater(myArrey11A, myArrey11B));
		
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//System.out.println("-12-");
		//boolean isHotOutside = false;
		//double moneyInPocket = 12.00;
		//System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				
//		The method I created "canProcrastinate" gives me advice based on how many days I have left until an assignment is due and
//		whether or not I have any events of significant duration happening on the due date. I have ADHD, and I'm always trying to
//		sneak in advice to myself, but I also know there are times I'm just going to be relying on "Deadline Mode." I included an if
//		statement to catch typos since I would not be using this method for advice more than 9 days from a due date, and
//		this girl is never attending events that last more than 6 hours!
				
		//System.out.println("-13-");
		//int daysTilDue = 3;
		//double eventHours = 0;
		//System.out.println(canProcrastinate(daysTilDue, eventHours));


	}
// Method for #7
	public static String concatWord (String word, int n) {
		
		String repeatWord = "";
		for( int i =0; i < n; i++) {
			repeatWord += word;
		}
		return repeatWord;
		
	}
//Method for #8
	public static String createFullName(String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		return fullName;
	}
//Method for #9
	public static boolean confirmSumGreater100(int[] arr) {
		int sumArray = 0;
		for(int x : arr) {
			sumArray += x;
		}
		if (sumArray > 100) {
			return true;
		}
		else
			return false;
		
	}
//Method for #10
	public static double calculateArrAvg(double[] arr) {
		double sum = 0;
		for(double x : arr) {
			sum += x;
			}
			
		double avg = sum / arr.length;
		return avg;
		
	}
//Method for #11
	public static boolean determineFirstArrAvgGreater(double[] arr1, double[] arr2) {
		double sum1 = 0;
		for(double x : arr1) {
			sum1 += x;
			}
			
		double avg1 = sum1 / arr1.length;
		
		
		double sum2 = 0;
		for(double x : arr2) {
			sum2 += x;
			}
			
		double avg2 = sum2 / arr2.length;
		if( sum1 > sum2) {
			return true;
		}
		else return false;
		
	}
//Method for #12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		else return false;
	}
//Method for #13
	public static String canProcrastinate(int daysTilDue, double eventHours) {
		
		String advice = "";
		if(daysTilDue < 0 || daysTilDue > 9 || eventHours < 0 || eventHours > 6) {
			advice = "You have a typo!";
		}
		else if(daysTilDue == 0 || (daysTilDue <= 2 && eventHours >= 2.5)) {
			advice = "Deadline Mode is now activated. Do all the things!";
		}
		else if(daysTilDue <= 2 && eventHours < 2.5) {
			advice = "Deadline Mode is not yet activated, but don't do this to yourself.";
		}
		else advice = "Deadline Mode is not yet activated. You have an opportunity to get ahead!";
		return advice;
		
	}
}




