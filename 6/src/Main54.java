import java.util.Scanner;

public class Main54{

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		while(in.hasNext()){
			String choose = in.next();
			if (choose.equals("new"))
			try{
				Student students = new Student();
				String name = in.next();
				students.setName(name);
				int addScore = in.nextInt();
				students.addScore(addScore);
				System.out.println(students);
			}catch(IllegalNameException e){
				System.out.println(e);
				break;
			}catch(IllegalScoreException e){
				System.out.println(e);
			}
			else 
				break;
		}
		in.close();
		System.out.println("scanner closed");
	}

}

class IllegalNameException extends Exception  
{  
    public IllegalNameException(String msg)  
    {  
        super(msg);  
    }  
} 

class IllegalScoreException extends Exception
{
	public IllegalScoreException(String msg)  
    {  
        super(msg);  
    }
}

class Student{
	
	private String name;
	private int score;
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws IllegalNameException {
		
		if(name.toCharArray()[0]>'0' && name.toCharArray()[0] < '9')
			throw new IllegalNameException("the first char of name must not be digit, name="+name);
		else 
			this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int addScore(int score) throws IllegalScoreException{
		if(this.score + score <0 || this.score + score > 100)
			throw new IllegalScoreException("score out of range, score=" + (this.score + score));	
		else
			this.score = this.score + score;
		return this.score;
		
	}
}