import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Q1. Develop a program that takes the weight (in kilograms)
        and height (in meters) as input and calculates the BMI, then prints it. */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner user_input = new Scanner(System.in);

        // 2. Prompt the user to enter the weight (in kg) and height (in m)
        // **The two values will be in double for accuracy**
        System.out.print("Enter weight (in kg): ");
        double weight = user_input.nextDouble();

        System.out.print("Enter height (in m): ");
        double height = user_input.nextDouble();

        // 3. Calculates the BMI
        double bmi = weight / Math.pow(height, 2);

        // 4. Print the result
        System.out.printf("BMI: %.2f \n" , bmi);

        //----------------------------------------------------------------------
        /* Q2. Write a program that takes the obtained marks and total marks
        as input and calculates the percentage, then prints it.  */

        // Header
        System.out.println("-------------------Q2-------------------");

        // 2. Prompt the user to enter the obtained marks and total marks
        // **The two values will be in double for accuracy**
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = user_input.nextDouble();

        System.out.print("Enter total marks: ");
        double totalMarks = user_input.nextDouble();

        // 3. Calculates the percentage
        double percentage = (obtainedMarks / totalMarks) * 100;

        // 4. Print the result
        System.out.printf("Percentage: %.1f%% \n", percentage);

        //----------------------------------------------------------------------
        /* Q3. Create a program that takes an amount in one currency and an exchange
        rate as input, then converts and prints the amount in another currency */

        // Header
        System.out.println("-------------------Q3-------------------");

        // 2. Prompt the user to enter the obtained marks and total marks
        // **The two values will be in double for accuracy**
        System.out.print("Enter the actual amount: ");
        double actualAmount = user_input.nextDouble();

        System.out.print("Enter the exchange rate: ");
        double exchangeRate = user_input.nextDouble();

        // Consume the leftover newline character
        user_input.nextLine();

        // 3. Converts the actual amount to another currency
        double convertedAmount = actualAmount * exchangeRate;

        // 4. Print the result
        System.out.printf("The converted amount is: %.1f \n", convertedAmount);

        //----------------------------------------------------------------------
        /* Q4. Create a program that takes a string as input, calculates its length,
        and then reverses the string using the StringBuilder class,
        finally printing both the length and reversed string. */

        // Header
        System.out.println("-------------------Q4-------------------");

        // 2. Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userStr = user_input.nextLine();

        // 3. Create a StringBuilder object
        StringBuilder reversedBuilder = new StringBuilder(userStr);

        // 4. Print the result
        /* (Calculate the length of the string and reverses the string using
        the reverse method from the StringBuilder class and print the result)*/
        System.out.println("Length of the string: " + userStr.length()
                + " and reversed string: \"" + reversedBuilder.reverse() + "\"");

        //----------------------------------------------------------------------
        /* Q5. Develop a program that takes a sentence as input and extracts
        a substring from it, then prints the extracted substring. */

        // Header
        System.out.println("-------------------Q5-------------------");

        // 2. Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userSentence = user_input.nextLine();

        // 3. Extracts a substring from the sentence
        // Ask the user to enter the start and end index to use the substring method
        System.out.print("Enter the start index: ");
        int startIndex = user_input.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = user_input.nextInt();

        // Consume the leftover newline character
        user_input.nextLine();

        // 4. Print the result
        System.out.println("The extracted substring: \""
                + userSentence.substring(startIndex,endIndex)
                + "\"");

        //----------------------------------------------------------------------
        /* Q6. Write a program that takes a sentence and a keyword as input,
        then check if the keyword is present in the sentence and prints the result. */

        // Header
        System.out.println("-------------------Q6-------------------");

        // 2. Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userSentence2 = user_input.nextLine();

        // 3. Prompt the user to enter a keyword
        System.out.print("Enter a keyword: ");
        String userKeyword = user_input.nextLine();

        // 4. Check if the keyword is present in the sentence and prints the result
        if(userSentence2.contains(userKeyword)) {
            System.out.println("Keyword \"" + userKeyword + "\" is present in the sentence.");
        }
        else {
            System.out.println("Keyword \"" + userKeyword + "\" is not present in the sentence.");
        }

        //----------------------------------------------------------------------
        /* Q7. Develop a program that takes a sentence and a word to replace as input,
        then replace all occurrences of the word with another word and prints the modified sentence. */

        // Header
        System.out.println("-------------------Q7-------------------");

        // 2. Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userSentence3 = user_input.nextLine();

        // 3. Prompt the user to enter a word to replace
        System.out.print("Enter a word to replace: ");
        String wordToReplace = user_input.nextLine();

        // 4. Prompt the user to enter a replacement word
        System.out.print("Enter a replacement word : ");
        String replacementWord  = user_input.nextLine();

        // 5. Replace the word and prints the modified sentence
        System.out.println("The modified sentence is \""
                + userSentence3.replace(wordToReplace,replacementWord)
                + "\".");

        //----------------------------------------------------------------------
        /* Q8. Write a program that takes two strings as input and check if they
         are equal, ignoring the case, then prints whether they are equal or not */

        // Header
        System.out.println("-------------------Q8-------------------");

        // 2. Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String firstStr = user_input.nextLine();

        System.out.print("Enter the second string: ");
        String secondStr = user_input.nextLine();

        // 3. Check if the two strings are equal, ignoring the case and prints the result
        if(firstStr.equalsIgnoreCase(secondStr)) {
            System.out.println("Strings are equal (ignoring case).");
        }
        else {
           System.out.println("Strings are not equal (ignoring case).");
        }

        //----------------------------------------------------------------------
        // Closing the scanner
         user_input.close();
    }
}