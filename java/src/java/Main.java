package java;
import java.util.Arrays;
import java.util.Scanner;
class PersonSortable implements Comparable<PersonSortable> {
    private String name;
    private int age;
    public PersonSortable(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String toString()
    {
        return name+'-'+age;
    }
    @Override
    public int compareTo(PersonSortable o) {
        int x = this.name.compareTo(o.name);
        if(x!=0)
            return x;
        else return this.getAge()-o.getAge();    
    }
    
}


public class Main {
    

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int n = cin.nextInt();
            PersonSortable[] s = new PersonSortable[n];
            for (int i = 0; i < n; i++) {
                s[i] = new PersonSortable(cin.next(),cin.nextInt());
            }
            Arrays.sort(s);
            for (PersonSortable t : s) {
                System.out.println(t);
            }
            System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
            }
        }

    }
