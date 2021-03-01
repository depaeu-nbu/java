
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface IntegerStack {
public Integer push(Integer item);// ���itemΪnull������ջֱ�ӷ���null�����ջ����Ҳ����null.
public Integer pop(); // ��ջ�����Ϊ�գ��򷵻�null����ջʱֻ�ƶ�ջ��ָ�룬��Ӧλ�ò���Ϊnull
public Integer peek(); // ���ջ��Ԫ�أ����Ϊ�գ��򷵻�null.
public boolean empty(); // ���Ϊ�շ���true
public int size(); // ����ջ��Ԫ�ظ���
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
if(this.empty())//ջ��	
return null;
return list.remove(list.size()-1);
}

public Integer peek() {
if(this.empty())//ջ��	
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