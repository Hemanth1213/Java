/*
class Pattern1
{
public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
for(int j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
*/
/*
class Pattern1
{
public static void main(String args[])
{
for(int i=0; i<=5; i++)
{
for(int j=0; j<=5; j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
*/
/*
class Pattern1
{
public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
for(int j=1; j<=5; j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
*/
/*
class Pattern1
{
public static void main(String argc[])
{
for(int i=1; i<=5; i++)
{
for(int j=1; j<=5; j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}
*/
/*
class Pattern1
{
public static void main(String args[])
{
int n=1;
for(int i=1; i<=5; i++)
{
for(int j=1; j<=5; j++)
{
System.out.print(n+"\t");
n++;
}
System.out.println();
}
}
}
*/
/*
class Pattern1 //pattern8
{
public static void main(String args[])
{
for (int i = 1; i <= 5; i++)
{
            for (int j = 1; j <= i; j++)
{
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1//patter9
{
public static void main(String args[])
{
        for (int i = 1; i <= 5; i++)
{
            int even = 2;
            for (int j = 1; j <= i; j++)
{
                System.out.print(even + " ");
                even += 2;
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1//patter10
{
public static void main(String args[])
{
 String word = "INDIA";
        for (int i = 0; i < word.length(); i++)
{
            for (int j = 0; j <= i; j++)
{
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1//pattern11
{
public static void main(String args[])
{
int n = 5;
        for (int i = 0; i < n; i++)
{
            for (int j = i; j < n - 1; j++)
                System.out.print("  ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
*/
/*
class Pattern1//pattern12
{
public static void main(String args[])
{
int n=5;
for (int i = 1; i<= n / 2 + 1; i++)
{
            for (int j = 0; j < n - i * 2 + 1; j++)
System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++)
System.out.print("* ");
            System.out.println();
        }
        for (int i = n / 2; i >= 1; i--)
{
            for (int j = 0; j < n - i * 2 + 1; j++) System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++) System.out.print("* ");
            System.out.println();
        }
}
}
*/
/*
class Pattern1//pattern14
{
public static void main(String args[])
{
int n=5;
for (int i = 1; i <= n; i++)
{
            for (int j = 1; j <= n; j++)
{
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1    //pattern13
{
public static void main(String args[])
{
int n=6;
for (int i = 1; i <= n / 2 + 1; i++)
{
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print("*");
            if (i > 1)
{
                for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n / 2; i >= 1; i--)
{
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print("*");
            if (i > 1) 
{
                for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1  //pattern15
{
public static void main(String args[])
{
int n=5;
for (int i = 1; i <= n / 2; i++) 
{
            for (int j = 1; j <= i; j++) System.out.print(" ");
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++) System.out.print("* ");
        System.out.println();
        for (int i = n / 2; i >= 1; i--) 
{
            for (int j = 1; j <= i; j++) System.out.print(" ");
            System.out.println("*");
        }
    }
}
*/
/*
class Pattern1    //Pattern16
{
public static void main(String args[])
{
int n=5;
for (int i = 0; i < n / 2 + 1; i++) 
{
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < (n - 2 * i - 1); j++) System.out.print(" ");
            if (i != n / 2) System.out.print("*");
            System.out.println();
        }
        for (int i = n / 2 - 1; i >= 0; i--)
 {
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < (n - 2 * i - 1); j++) System.out.print(" ");
            if (i != n / 2) System.out.print("*");
            System.out.println();
        }
    }
}
*/
/*
class Pattern1   //pattern17
{
public static void main(String args[])
{
int n=7;
for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == (n / 2 + 1))
                    System.out.print("* ");
                else if (j == 1 || j == n || j == (n / 2 + 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pattern1 //18pattern
{
public static void main(String args[])
{
int n=6;
for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print(" ");
            if (i != 0) System.out.println("*");
            else System.out.println();
        }
        for (int i = 0; i < n; i++) System.out.print("* ");
        System.out.println();
    }
}
*/
/*
class Pattern1 //pattern19
{
public static void main(String args[])
{
int n=5;
 for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println(i);
        }
    }
}
*/
class Pattern1  //pattern20
{
public static void main(String args[])
{
int n=6;
for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n - 1; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) System.out.print("  ");
            System.out.println("*");
        }
        System.out.println("*           *");
    }
}


