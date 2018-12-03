import java.util.*;
class maxicount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++){
a[i]=sc.next();
}
int f=sc.nextInt();
int l=0;
int b[]=new int[n*n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(a[i]!=a[j]){
String str=a[i]+a[j];
b[l]=Integer.parseInt(str);
l++;
}else{
b[l]=Integer.parseInt(a[i]);l++;
}
}
}
System.out.println(Arrays.toString(b));
String t="9";String res="";
for(int i=0;i<f;i++){
res=res+t;
}
System.out.println("Range :"+res);
Arrays.sort(b);
int d=Integer.parseInt(res);
int op=0;
for(int i=0;i<l;i++){
if(b[i]<d){
op=b[i];
}
}
System.out.println(op);
}}
