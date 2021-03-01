
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface IntegerStack {
public Integer push(Integer item);// 如果item为null，则不入栈直接返回null。如果栈满，也返回null.
public Integer pop(); // 出栈，如果为空，则返回null。出栈时只移动栈顶指针，相应位置不置为null
public Integer peek(); // 获得栈顶元素，如果为空，则返回null.
public boolean empty(); // 如果为空返回true
public int size(); // 返回栈中元素个数
}

class ArrayListIntegerStack implements IntegerStack {
private List<Integer> list;

public ArrayListIntegerStack() {
	list = new ArrayList<Integer>();
}


public Integer push(Integer item) {
	if(item == null)
		return null;
	list.add(item);
	return item;
}

public Integer pop() {
if(this.empty())//栈空	
return null;
return list.remove(list.size()-1);
}

public Integer peek() {
if(this.empty())//栈空	
return null;
return list.get(list.size()-1);
}

public boolean empty() {
	return list.size()==0?true:false;
}

public int size() {
return list.size();
}

public String toString(){
	return list.toString();
}
}


public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
IntegerStack List = new ArrayListIntegerStack();
for (int i = 0; i < n; i++) {
System.out.println(List.push(sc.nextInt()));
}
System.out.print(List.peek() + "," + List.empty() + "," + List.size() + "\n");
System.out.println(List);
int x = sc.nextInt();
for (int i = 1; i <= x; i++) {
System.out.println(List.pop());
}
System.out.print(List.peek() + "," + List.empty() + "," + List.size() + "\n");
System.out.println(List);
}
}