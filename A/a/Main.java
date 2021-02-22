import java.util.Arrays;
import java.util.Scanner;

interface IntegerStack {
public Integer push(Integer item);// ���itemΪnull������ջֱ�ӷ���null�����ջ����Ҳ����null.
public Integer pop(); // ��ջ�����Ϊ�գ��򷵻�null����ջʱֻ�ƶ�ջ��ָ�룬��Ӧλ�ò���Ϊnull
public Integer peek(); // ���ջ��Ԫ�أ����Ϊ�գ��򷵻�null.
public boolean empty(); // ���Ϊ�շ���true
public int size(); // ����ջ��Ԫ�ظ���
}

class ArrayIntegerStack implements IntegerStack {
private Integer[] stack;
private int num;

public ArrayIntegerStack(int n) {
this.stack = new Integer[n];
}

public Integer push(Integer item) {
if (item == null)	
return null;
if(this.size() >= this.stack.length )	
return null;
stack[num] = item;//����ɹ�
num++;
return item;          
}

public Integer pop() {
if(this.empty())//ջ��	
return null;
num--;
return stack[num];
}

public Integer peek() {
if(this.empty())//ջ��	
return null;
return stack[num - 1];
}

public boolean empty() {
if(num == 0)//ջ��	
return true;
return false;
}

public int size() {
return num;
}

public Integer[] getStack() {
return stack;
}
}

public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
ArrayIntegerStack Stack = new ArrayIntegerStack(n);
int m = in.nextInt();
for (int i = 0; i < m; i++) {
Integer number = in.nextInt();
System.out.println(Stack.push(number));
}
System.out.print(Stack.peek() + "," + Stack.empty() + "," + Stack.size() + "\n");
System.out.println(Arrays.toString(Stack.getStack()));
int x = in.nextInt();
for (int i = 0; i < x; i++) {
System.out.println(Stack.pop());
}
System.out.print(Stack.peek() + "," + Stack.empty() + "," + Stack.size() + "\n");
System.out.println(Arrays.toString(Stack.getStack()));
}
}