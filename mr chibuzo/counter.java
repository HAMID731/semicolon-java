import java.util.Scanner;

public class counter{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
int negative =0;
int positive =0;
int zero =0;
int counter =1;


while ( counter<=5 ){
System.out.println("enter number: ");
int number = scan.nextInt();

if(number<0){
negative++;
}
else if(number==0){
zero++;
}
else{positive++;}
}
System.out.println("there are"+negative+"numbers");
System.out.println("there are"+positive+"numbers");
System.out.println("there are"+zero+"numbers");
}
}}