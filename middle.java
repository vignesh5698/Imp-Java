import java.util.*;
class middle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int n=str.length();
int n1=0;
if(n%2==1){
n1=(n/2)+1;
}else{
n+=1;
n1=(n/2)+1;
}
String f="";
for(int i=n1-1;i<n;i++){
char c=str.charAt(i);
f=f+c;
}
for(int i=0;i<n1-1;i++){
char c=str.charAt(i);
f=f+c;
}
//System.out.println(f);
for(int i=1;i<=n;i++){
for(int j=n;j>i;j--){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print(f.charAt(k));
}
System.out.println();
}
}
}
