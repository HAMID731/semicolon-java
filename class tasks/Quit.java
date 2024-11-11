import java.util.Scanner;

public class Quit{

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int mainMenuOption;

        do {
	
            System.out.print("Select a menu :\n1. add\n2. view\n3. Delete\n4. Quit\n>>>>>>>>");
            mainMenuOption = scan.nextInt();

            switch(mainMenuOption){
                case 1 :
			System.out.println("add");
                    break;
		 case 2 :
		System.out.println("view");
                    break;
		 case 3 :
		System.out.println("delete");
                    break;
		
}
}while (mainMenuOption != 4);
}}
