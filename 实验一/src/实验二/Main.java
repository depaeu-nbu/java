package สตั้ถþ;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) 
        { 
        	String str = sc.nextLine();
            int n = Integer.parseInt(str); 

        if(n>=10000&&n<=20000)
        {
        	System.out.print(Integer.toBinaryString(n)+",");
        	System.out.print(Integer.toOctalString(n)+",");
        	System.out.print(Integer.toHexString(n));
        }
        else
        {
        	int a=0;
        	char b[]=str.toCharArray();
        	if(n>=0)
        	{
        	for(int i = 0; i < b.length; i++)
        	{
        	    System.out.print(b[i]+" ");
        	    a=a+b[i]-'0';
        	}
        	System.out.println(a);
        	}
        	else 
        	{
            	for(int i = 1; i < b.length; i++)
            	{
            	    System.out.print(b[i]+" ");
            	    a=a+b[i]-'0';
            	}
            	System.out.println(a);
            	}
        }

        }
	}
    
}
