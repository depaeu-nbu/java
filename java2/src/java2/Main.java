package java2;
import java.util.*;
public class Main {
			public static String getBirthDate(String id)
			{
				String Year = id.substring(6,10);
				String Month = id.substring(10,12);
				String Day = id.substring(12,14);
				return(Year+"-"+Month+"-"+Day);
			}
			public static void main(String aegs[])
			{
				System.out.println("please input ID:");
				Scanner in = new Scanner(System.in);
				String ID = in.nextLine();
				System.out.println(getBirthDate(ID));
				
			}
		}

