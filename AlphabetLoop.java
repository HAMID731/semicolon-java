import java.util.Scanner;

public class AlphabetLoop{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
char alphabet= 'A'

for(int alpha = 1; alpha >=number; alpha++){
			for(int alpha1 = 1; alpha1>=number; alpha1++){
				System.out.print(alphabet++);
				}
System.out.println(" ");

}
for(int alpha = 1; alpha >=number; alpha--){
			for(int alpha1 = 1; alpha1<=number; alpha1++){
				System.out.print("A");
}
System.out.println(" ");
}
}}