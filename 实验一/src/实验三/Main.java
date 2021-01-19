package สตั้ศý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) 
	        { 
	        	int a=0;
	        	double x = sc.nextDouble();
	        	String str=String.valueOf(x); 
	            char b[]=str.toCharArray();
	            for(int i=0;i<b.length;i++)
	            {
	            	if(b[i]>='0'&&b[i]<='9') 
	            		a=a+b[i]-48;
	            }
	            System.out.println(a);
	        }

	}

}
