import java.util.*;
class revvow{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char a[]={'a','e','i','o','u'};
char b[]=str.toCharArray();
int n=str.length();
char c[]=new char[n];
int m=0;
for(int i=0;i<n;i++){
for(int j=0;j<5;j++){
if(b[i]==a[j]){
c[m]=b[i];
m++;
}
}
}
char rev[]=new char[m];
int n1=0;
for(int i=m-1;i>=0;i--){
rev[n1]=c[i];
n1++;
}

int size=0;
char d[]=new char[n];
int k[]=new int[m];
int g=0;
for(int i=0;i<str.length();i++){
for(int j=0;j<5;j++){
if(b[i]==a[j]){
k[g]=i;g++;
}
}
}
for(int i=0;i<g;i++){
int p=k[i];
b[p]=rev[i];
}
for(int i=0;i<n;i++){
System.out.print(b[i]);
}
}
}
