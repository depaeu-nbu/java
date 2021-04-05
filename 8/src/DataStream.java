import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream
{
    public static void main(String args[]) throws  IOException
    {   //201521123032
    	Student[] stu=new Student[]{
    			new Student(1,"张三",16,91),
    			new Student(2,"李四",17,92),
    			new Student(3,"王五",18,93)
    	};
        FileOutputStream fos = new FileOutputStream("S.txt");
        DataOutputStream dos = new DataOutputStream (fos);
        for(int i=0;i<stu.length;i++){
        	dos.writeInt(stu[i].getId());
        	dos.writeUTF(stu[i].getName());
        	dos.writeInt(stu[i].getAge());
        	dos.writeDouble(stu[i].getGrade());
        }
        dos.close();
        FileInputStream  fis = new FileInputStream("S.txt");
        DataInputStream dis = new DataInputStream (fis);
        Student[] readstu=new Student[3];
        for(int i=0;i<3;i++){
        	int id=dis.readInt();
        	String name=dis.readUTF();
        	int age=dis.readInt();
        	double grade=dis.readDouble();
        	readstu[i]=new Student(id,name,age,grade);
        }
        dis.close();
        
        for (Student e : readstu) {
        	 System.out.println(e);
		}
       
   }//main()
}//class DataStream