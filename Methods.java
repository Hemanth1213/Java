//without parameter without return
/*
class Methods
{
public void add()
{
System.out.println(10+20);
}
public static void main(String args[])
{
Methods m = new Methods();
{
m.add();
}
}
}
*/
/*
class Methods   //without parameter with return  
{
public int sub()
{
int a=(10-2);
return a;
}
public static void main(String args[])
{
Methods m = new Methods();
int b = m.sub();
System.out.print(b);
}
}
*/
/*
class Methods //With parameter without return
{
public void mult(int a, int b)
{
System.out.println(a*b);
}
public static void main(String args[])
{
Methods m = new Methods();
m.mult(4,2);
}
}
*/
class Methods  //with parameter with return
{
public int div(int a,int b)
{
return(a/b);
}
public static void main(String args[])
{
Methods m = new Methods();
int c;
c = m.div(4,2);
System.out.println(c);
}
}
