/*
//Using String literl
class Strings
{
public static void main(String args[])
{
String s = "HEMANTH";
System.out.println(s);
}
}
*/
/*
//Using new Key word
class Strings
{
public static void main(String args[])
{
String s =new String("HEMANTH");
System.out.println(s);
}
}
*/
/*
class Strings
{
public static void main(String args[])
{
char[] c = {'H','E','M','A','N','T','H'};
System.out.println(c);
}
}
*/
//String Methos
//concatination()
class Strings
{
public static void main(String args[])
{
String s1="Hemanth";
String s2="Hemanth";
String s3="Yaswanth";
String s4="  Tejash";
//float num = 42.1f;
//String str = String.valueOf(num);
Integer num = 333;
String str = num.toString(num);
System.out.println(s1+s2);
System.out.println(s1.length());
System.out.println(s1.substring(1));
System.out.println(s1.indexOf("a"));
System.out.println(s1.matches(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.startsWith("H"));
System.out.println(s1.endsWith("h"));
System.out.println(s1.compareTo(s3));
System.out.println(s4.trim());
System.out.println(s1.replace("H","R"));
System.out.println(s1.split("H"));
System.out.println(String.valueOf(num));
System.out.println(str);
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
}
}
