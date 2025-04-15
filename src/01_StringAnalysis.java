import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        String vowels = "AEIOUaeiou";
        
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCharCount++;
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
        scanner.close();
    }
}