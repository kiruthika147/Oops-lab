import java.util.*;
class even implements Runnable
{
public int x;
public even(int x)
{
this.x = x;
}
public void run()
{
System.out.println("New Thread "+ x +" is EVEN and Square of " + x + " is: " + x * x);
}
}
class odd implements Runnable
{
public int x;
public odd(int x)
{
this.x = x;
}
public void run()
{
System.out.println("New Thread "+ x +" is ODD and Cube of " + x + " is: " + x * x * x);
}
}
class A extends Thread
{
public void run()
{
int num = 0;
Random r = new Random();
try
{
for (int i = 0; i < 5; i++)
{
num = r.nextInt(100);
System.out.println("Main Thread and Generated Number is " + num);
if (num % 2 == 0)
{
}
else
{
}
Thread t1 = new Thread(new even(num));
t1.start();
Thread t2 = new Thread(new odd(num));
t2.start();
Thread.sleep(1000);
System.out.println(" ");
}
}
catch (Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
public class ThreadProgram
{
public static void main(String[] args)
{
A a = new A();
a.start();
}
}
OUTPUT:
D:\JP>java ThreadProgram
Main Thread and Generated Number is 10
New Thread 10 is EVEN and Square of 10 is: 100
Main Thread and Generated Number is 14
New Thread 14 is EVEN and Square of 14 is: 196
Main Thread and Generated Number is 83
New Thread 83 is ODD and Cube of 83 is: 571787
Main Thread and Generated Number is 1
New Thread 1 is ODD and Cube of 1 is: 1
Main Thread and Generated Number is 20
New Thread 20 is EVEN and Square of 20 is: 400