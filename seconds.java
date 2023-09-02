import java.util.Scanner;
public class seconds
{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter number of seconds  ");
int sec = input.nextInt();
int hour = sec/3600;
sec = sec % 3600;
int min = sec/60;
int second = sec % 60;

System.out.print(hour+" Hours and "+min+"Minuts and "+second+"Seconds ");


}

}