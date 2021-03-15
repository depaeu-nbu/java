import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		String str = null;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String choice = sc.next();
			try{
				if(choice.equals("arr")){
					int index = sc.nextInt();
					arr[index] = 1;
					
				}
				else if(choice.equals("null")){
					str.length();
				}else if(choice.equals("cast")){
					Object o = new String("str");
					Integer x = (Integer)o;
				}else if(choice.equals("num")){
					String intNum = sc.next();
					Integer.parseInt(intNum);
				}else{
					break;
				}
		}catch(Exception e){
			System.out.println(e);
		}
		
		}
		sc.close();
		


	}

}
