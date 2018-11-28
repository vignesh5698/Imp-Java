import java.util.*;
class primediv{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[2];
int b[]=new int[2];
//prime under 500
int k=0,l=0;
int pri[]=new int[250];
for(int i=1;i<=500;i++){
k=0;
for(int j=1;j<=500;j++){
if(i%j==0){
k++;
}
}
if(k==2){
pri[l]=i;
l++;
}
}
for(int i=0;i<2;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<2;i++){
b[i]=sc.nextInt();
}
boolean b1=true,b2=true;
for(int i=0;i<l;i++){
if((a[0]+pri[i])%b[0]==0){
if(b1){
System.out.print(pri[i]+" ");
b1=false;
}
}

if((a[1]+pri[i])%b[1]==0){
if(b2){
System.out.print(pri[i]);
b2=false;
}
}
}

}
}
