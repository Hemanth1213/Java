class Unary
{
public static void main(String args[])

{
int a=10;
int b=-a;
int c=+a;
int x=5;
int y=++x;
int z=x--;
boolean flag = true;
System.out.println("original value:" +a);
System.out.println("unary minus of a(b):" +b);
System.out.println("unary plus of a(c):" +c);
System.out.println("pre-increment of x(++x):" +y);
System.out.println("post-increment of x(x--):" +z);
}
}
