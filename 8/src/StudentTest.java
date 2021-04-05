import java.io.*;
import java.util.*;

public class StudentTest
{
   public static void main(String[] args)
   {
      Student[] student = new Student[3];

      student[0] = new Student(1,"张三",19,65);
      student[1] = new Student(2,"李四",19,75);
      student[2] = new Student(3,"王五",19,85);
      //201521123032
      try
      {
         PrintWriter out = new PrintWriter("C:/student.txt");
         writeData(student, out);
         out.close();
         Scanner in = new Scanner(new FileReader("C:/student.txt"));
         Student[] newStu = readData(in);
         in.close();
         for (Student e : newStu)
            System.out.println(e);
      }
      catch (IOException exception)
      {
         exception.printStackTrace();
      }
   }
   private static void writeData(Student[] students, PrintWriter out) throws IOException
   {
      out.println(students.length);
      for (Student e : students)
         e.writeData(out);
   }
   private static Student[] readData(Scanner in)
   {
      int n = in.nextInt();
      in.nextLine(); 
      Student[] students = new Student[n];
      for (int i = 0; i < n; i++)
      {
         students[i] = new Student();
         students[i].readData(in);
      }
      return students;
   }
}