import java.util.*;
class uniquematrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int a[][]=new int[r][c];
int s[]=new int[r];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=sc.nextInt();
}
}
int l=0;
for(int i=0;i<r;i++){
String str="",res="";
for(int j=0;j<c;j++){
str=Integer.toString(a[i][j]);
res=res+str;
}
int x=Integer.parseInt(res);
s[l]=x;
l++;
}
System.out.println(Arrays.toString(s));
int k=0;
int  x[]=new int[l];
int count=0;
for(int i=0;i<l;i++){
int j;
for(j=0;j<=i;j++){
if(s[i]==s[j])
break;
}
if(i==j){
x[k]=s[i];
k++;
}
}
System.out.println(Arrays.toString(x));

}
}
