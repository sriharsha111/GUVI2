import java.util.*;
import java.util.Scanner;
public class Sum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int sum=0;
for(int i=1;i<=k;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
