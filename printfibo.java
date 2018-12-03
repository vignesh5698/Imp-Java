import java.util.*;
class printfibo{
public static void main(String args[]){
int a[]=new int[500];
a[0]=0;
int f1=1,f2=1,f3;
a[1]=1;a[2]=1;
for(int i=3;i<50;i++){
f3=f1+f2;
f1=f2;
f2=f3;
a[i]=f3;
}
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of array : ");
int n=sc.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++){
b[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=0;j<50;j++){
if(b[i]==a[j]){
System.out.println(b[i] +" ");
}
}
}
}
}
