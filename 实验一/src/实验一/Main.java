package สตั้าป;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>=-1000&&a<=1000) System.out.println(a+b);
			else System.out.println("a<=1000");
		}
		sc.close();
	}

}
