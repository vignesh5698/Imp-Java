import java.util.*;
class baloon{
public static void main(String args[]){
baloon b=new baloon();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Matrix : ");
int m=sc.nextInt();
int n=sc.nextInt();
char a[][]=new char[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
a[i][j]='-';
}
}
b.disp(a,m,n);
char ch='y';
int col;
int v=0,k1=1;
while(ch=='y'){
System.out.println("Enter the column number :");
col=sc.nextInt();
col=col-1;int xx=1;
System.out.println("Enter the baloon colour :");
char color=sc.next().charAt(0);
if(v<n){
for(int i=m-1;i>=0;i--){
if(a[i][col]=='-'){
if(xx==1){
a[i][col]=color;

xx=0;
break;
}
}else{
int r=col;
if(xx==1){
for(int a1=0;a1<r;a1++){
if(a[i][a1]=='-'){
a[i][a1]=color;
xx=0;
break;
}
}
}
if(xx==1){
for(int a2=r;a2<n;a2++){
if(a[i][a2]=='-'){
a[i][a2]=color;
xx=0;
break;
}
}
}
}
}
}else{
System.out.println("All columns are completed");
k1=0;
}

for(int i=0;i<n;i++){
int p=0;
char c[]=new char[n];
for(int j=0;j<m;j++){
c[p]=a[j][i];
p++;
}
if(b.check(c)){
for(int j=0;j<m;j++){
a[j][i]='-';
}
}
}



b.disp(a,m,n);
if(k1==1){
System.out.println("Do you want  to continue ? Y-Yes N-No");
}else{
ch='n';
System.out.println("Program Terminated.");
break;
}
ch=sc.next().charAt(0);
}
}
void disp(char ch[][],int a,int b){
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
System.out.print(ch[i][j]+" ");
}
System.out.println();
}
}
boolean check(char a[]){
int len=a.length;
int o=1;
for(int i=0;i<len-1;i++){
if(a[i]==a[i+1]){
o++;
}
}
if(o==len)
return true;
else
return false;
}
}
