import java.util.*;
class paliwithoutarray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter  value : ");
int n=sc.nextInt();
Stack<Integer> s=new Stack<Integer>();
//Convert to binary
while(n!=0){
int d=n%2;
s.push(d);
n=n/2;
}
System.out.println(s);
int l=0;
while(!(s.isEmpty())){
int k=s.pop();
l=l*10;
l=l+k;
}
System.out.println(l);
paliwithoutarray p=new paliwithoutarray();
boolean b=p.pali(l);
System.out.println(b);
}
boolean pali(int n){
int divisor=1;
while(n/divisor>=10){
divisor=divisor*10;
}
while(n!=0){
int leading=n/divisor;
int trail=n%10;

if(leading!=trail)
return false;

n=(n%divisor)/10;
divisor=divisor/100;
}
return true;
}
}
