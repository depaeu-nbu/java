import java.util.Arrays;
import java.util.Scanner;

class ArrayUtils{
static class PairResult{
private double min;
private double max;
public String toString() {
return "PairResult [min=" + min + ", max=" + max + "]";
}
}
static PairResult findMinMax(double[] values){
PairResult result = new PairResult();
double min = values[0], max = values[0];
for (int i = 0; i < values.length; i++) {
if (values[i] > max)
max = values[i];
if (values[i] < min)
min = values[i];
}
result.max = max;
result.min = min;
return result;
}
}

public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
double[] array = new double[n];
for(int i=0;i<n;i++){
array[i] = in.nextDouble();
}
ArrayUtils arr = new ArrayUtils();
System.out.println(arr.findMinMax(array));
System.out.println(ArrayUtils.PairResult.class);
}
}