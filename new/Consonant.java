import java.util.Scanner;

public class Consonant{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter a single character");
char input_char = scan.next().charAt(0);

if (input_char == 'a' || input_char == 'e' || input_char == 'i' || input_char == 'o' || input_char == 'u') {
System.out.print("it is a vowel");

}else{
System.out.print("it is a consonant");
}
}}