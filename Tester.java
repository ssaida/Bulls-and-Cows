import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Number comp = new Number();
		boolean win = false;
		for(int i=0;i<10;i++) {
			System.out.println(comp._number);
		}
		
		
		do {
			System.out.println("Enter your guess:");
			int n = in.nextInt();
			Number user = new Number(n);
			int hits = comp.howManyHits(user);
			int almost = comp.howManyAlmost(user);
			if(hits == 4)
				win = true;
			else win = false;
			System.out.println("Hits "+hits+" Almost: "+almost);
		}while(!win);
		
		in.close();
	}
}
