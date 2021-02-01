package java;

import java.util.Scanner;
class Person
{
private String name;
private int age;
private boolean gender;
private int id;
public Person()
{
 System.out.println("This is constructor");
 System.out.printf("%s,%d,%s,%d\n",name,age,gender,id);
 
}

public Person(String name,int age,boolean gender)
{
 this.name =name;
 this.age =age;
 this.gender =gender;
}

public String toString()
{
 return String.format("Person [name=%s, age=%d, gender=%s, id=%d]",name,age,gender,id);
}

public void setName(String name)
{
 this.name =name;
}
public String getName()
{
 return name;
}
public void setAge(int age)
{
 this.age =age;
}
public int getAge()
{
 return age;
}
public void setGender(boolean gender)
{
 this.gender =gender;
}
public boolean getGender()
{
 return gender;
}
public void setId(int id)
{
 this.id =id;
}
public int getId()
{
 return id;
}

}
public class Main {
public static void main(String[] args) {
 // TODO Auto-generated method stub
 Scanner in=new Scanner(System.in);
 int n=Integer.parseInt(in.nextLine());
 Person[] persons=new Person[n];
 //System.out.println(Arrays.toString(persons));
 for(int i=0;i<persons.length;i++)
 {
  Person person=new Person(in.next(),in.nextInt(),in.nextBoolean());
  
  persons[i]=person;
 }
 for(int j=persons.length-1;j>=0;j--)
 {
  System.out.println(persons[j]);
 }
 Person p=new Person();
 System.out.print(p.toString());
}
}