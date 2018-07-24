import java.util.*;
class t2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=s.length();
char c[]=s.toCharArray();
int i=0,j=0;
for(i=0;i<n;i++){
for(j=0;j<n;j++){
if(i==j||(i+j==n-1)){
System.out.print(c[j]);
System.out.print(" ");
}
else{
System.out.print(" ");
}
}System.out.println();
}
}
}
