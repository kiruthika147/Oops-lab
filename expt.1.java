import java.util.Scanner; public class ElectBill
{
public static void main (String[] args)
{
Consumer ob = new Consumer();

ob.Getdata();
ob.Calc();
ob.Display();
}
}
class Consumer
{
Scanner in = new Scanner (System.in); Scanner ins = new Scanner (System.in); int cno;
String cname,type_of_conn;
double pre_reading,curr_reading,unit_consumed,tbill;
void Getdata()
{
}
void Calc()
{
System.out.print ("\n\t Enter Consumer number = "); cno = in.nextInt();
System.out.print ("\n\t Enter Consumer name = "); cname = ins.nextLine();
System.out.print ("\n\t Enter the type of connection = "); type_of_conn = ins.nextLine();
System.out.print ("\n\t Enter pre_month reading = "); pre_reading = in.nextDouble();
System.out.print ("\n\t Enter current_month reading = "); curr_reading = in.nextDouble();


unit_consumed = curr_reading - pre_reading; if(type_of_conn.contains("domestic"))
{

if (unit_consumed <= 100) tbill=1* unit_consumed;
else if (unit_consumed >100 && unit_consumed <= 200) tbill=2.50* unit_consumed;
else if (unit_consumed >200 && unit_consumed <= 500) tbill=4* unit_consumed;

else

}
tbill=6* unit_consumed;

else if(type_of_conn.contains("commercial"))
{
if (unit_consumed <= 100) tbill=2* unit_consumed;
else if (unit_consumed >100 && unit_consumed <= 200) tbill=4.50* unit_consumed;

else if (unit_consumed >200 && unit_consumed <= 500) tbill=6* unit_consumed;
else
tbill=7* unit_consumed;

}
}
void Display()
{
System.out.println ("\n\t Customer name = "+cname); System.out.println ("\n\t Total units = "+unit_consumed); System.out.println ("\n\t Total bill = Rs "+tbill);
}
}
Output:
D:\Java Programs>javac ElectBill.java D:\Java Programs>java ElectBill
Enter Consumer number = 102 Enter Consumer name = Raghav
Enter the type of connection = domestic Enter pre_month reading = 150
Enter current_month reading = 800 Customer name = Raghav
Total units = 650.0 Total bill = Rs 3900.0
D:\raghu\Java Programs>javac ElectBill.java D:\raghu\Java Programs>java ElectBill
Enter Consumer number = 103 Enter Consumer name = Raj
Enter the type of connection = commercial Enter pre_month reading = 1005
Enter current_month reading = 1300 Customer name = Raj
Total units = 295.0
Total bill = Rs 1770.0

