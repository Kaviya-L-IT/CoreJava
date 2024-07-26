package Day1_basics;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		 int a,b,c;
		 Scanner s = new Scanner(System.in);
		 a = s.nextInt();
		 b= s.nextInt();
		 s.nextLine();
		 System.out.println("Enter the trainee name");
		 String name;
		 name = s.nextLine();
		 c = a+b;
		 System.out.println("Addition of a="+a+"and b= "+b+"is"+c);
		 System.out.println("Trainer name : "+name);

	}

}
