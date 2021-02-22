import java.util.Arrays;
import java.util.Scanner;

interface IntegerStack {
public Integer push(Integer item);// 如果item为null，则不入栈直接返回null。如果栈满，也返回null.
public Integer pop(); // 出栈，如果为空，则返回null。出栈时只移动栈顶指针，相应位置不置为null
public Integer peek(); // 获得栈顶元素，如果为空，则返回null.
public boolean empty(); // 如果为空返回true
public int size(); // 返回栈中元素个数
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
stack[num] = item;//插入成功
num++;
return item;          
}

public Integer pop() {
if(this.empty())//栈空	
return null;
num--;
return stack[num];
}

public Integer peek() {
if(this.empty())//栈空	
return null;
return stack[num - 1];
}

public boolean empty() {
if(num == 0)//栈空	
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