/*Jonathan Abdo 6-8-16
 * Display a table of squares and cubes from 1 to the value entered
 * it will then prompt the user to continue
 */

import java.util.Scanner;

public class Powers {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Learn your squares and cubes!"); //Quick title+info about prog
		boolean cont = true;
		while(cont){//while the user wants to continue entering values 'cont' will be true
			printPowers();
			System.out.print("Continue? (y/n)");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes")){
				continue;//my new favorite word!!!!!!!
			}else{
				cont = false;
				System.out.println("\nGoodbye!");
			}	
		}	
	}
	
	public static void printPowers(){
		
		System.out.print("\nEnter and integer: ");//ask for then get user int
		int userInt = getInt();
		
		System.out.println("\nNumber\tSquared\tCubed");//Print header for table
		System.out.println("======\t======\t======");
		
		for(int i=1; i<=userInt; i++){//loop up to and include the user's integer
			int squared = i*i;//calc the square
			int cubed = i*i*i;//calc the cube
			System.out.println(i+"\t"+squared+"\t"+cubed);//print the current number, square and cube, separated by tabs
		}
		System.out.println("");//spacing after table
	}
	
	//Validate user integer
	public static int getInt(){
		
		while (!sc.hasNextInt()){
			System.out.print("Please enter a valid number: ");
			sc.nextLine();
		}
		return sc.nextInt();
	}
}
