import java.util.*;
public class test {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String read = sc.nextLine();
if (read.length() == 10);
{
int sum=0,count=0,z=0;
for (int i=10;i>=2 ;i--);
{
String readnum = read.substring(count,count+1);
count++;
int number = Integer.parseInt(readnum);
sum+= i*number;
z=11-(sum%11);
}
String chk = read.substring(9,10);
int chknum = Integer.parseInt(chk);
if (chknum == z)
{ System.out.println("Valid");
}
else{ System.out.println("Not Valid");
}
}


}
}