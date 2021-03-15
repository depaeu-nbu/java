import java.util.Scanner;

public class Main53{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		for (int i = 0; i < n ; i++) {
			x[i] = sc.nextDouble();
		}
		int begin = 0;
		int end = 0;
		while(sc.hasNext()){
			try{
				String b = sc.next();
				begin = Integer.parseInt(b);
				String e = sc.next();
				end = Integer.parseInt(e);
			}catch(NumberFormatException e){
				break;
			}
			try{
				System.out.println(ArrayUtils.findMax(x, begin, end));
			}catch(IllegalArgumentException e){
				System.out.println(e);
			}
		}
		try {
		     System.out.println(ArrayUtils.class.getDeclaredMethod("findMax", double[].class,int.class,int.class));
		} catch (Exception e1) {
		}
		sc.close();
	}
}

class ArrayUtils{
	
	public static double findMax(double[] arr,int begin, int end) throws IllegalArgumentException{
		if(begin >= end)
			throw new IllegalArgumentException("begin:"+begin + " >= end:" + end);
		if(begin < 0)
			throw new IllegalArgumentException("begin:"+begin +" < 0");
		if(end > arr.length)
			throw new IllegalArgumentException("end:"+end +" > arr.length");
		double max = arr[begin];
		for(int i = begin; i<= end -1;i++){
			if(arr[i] > max) 
				max = arr[i];
		}
		return max;
	}
}