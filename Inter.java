package proj;

import java.util.Scanner;

public class Inter {
	Inter(){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nWho are you:");
		System.out.println("\nAdmin- a\tUser- u \t Recruiter- r");
		String q=sc.nextLine();
		if(q.compareTo("a")==0) {
			new InterA();
		}
		if(q.compareTo("u")==0) {
			new InterU();
		}
		if(q.compareTo("r")==0) {
			new InterR();
		}
		else {
			System.out.println("Wrong entry!");
			new Inter();
		}
		}
}
