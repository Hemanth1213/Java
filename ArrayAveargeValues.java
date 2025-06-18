//write a program to caclulate the average value of an array integers
class ArrayAverageValues
{
public static double arrayAverage(int[] array)
{
int sum=0;
for(int i=0;i<array.length;i++)
{
sum +=array[i];
}
return (double) sum/array.length;
}
public static void main(String args[])
{
int[] numbers = {10,20,30,40,50,60};
double result = arrayAverage(numbers);
System.out.println("Average values of an array elements:"+result);
}
}
