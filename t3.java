import java.util.*;
class t3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter The Number Of Elements : ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int b[]=new int[n];
for(int i=0;i<n;i++){
b[i]=0;
int n1=(int)Math.sqrt(a[i]);
if((n1*n1)==a[i]){
b[i]+=5;
}
if(a[i]%4==0 && a[i]%6==0){
b[i]+=4;
}
if(a[i]%2==0){
b[i]+=3;
}
}

for(int i=0;i<n;i++){
System.out.print("<"+a[i]+","+b[i]+">");
}

}
}
