import java.util.Arrays;
import java.util.Scanner;

public class Main52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int[] x = new int[size];
		
		for(int i =0;i<x.length;){
			try{
			String inputInt = sc.next();
			x[i] = Integer.parseInt(inputInt);
			i++;	
			}catch(java.lang.NumberFormatException e){
				System.out.println(e);
			
			 }
			
     
	    }
		System.out.println(Arrays.toString(x));

} 

}