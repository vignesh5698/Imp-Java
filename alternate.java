import java.util.*;
class alternate{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the total numbers : ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int temp;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
int b[]=new int[n];
int c[]=new int[n];
for(int i=0;i<n;i++){
b[i]=a[i];
}
int m=0;
for(int i=n-1;i>=0;i--){
c[m]=a[i];
m++;
}
int res[]=new int[n*2];
for(int i=0,j=0;i<n*2;i+=2,j++){
res[i]=b[j];

}
for(int i=1,j=0;i<n*2;i+=2,j++){
res[i]=c[j];

}
for(int i=0;i<n;i++){
System.out.print(res[i]+" ");
}
}}
