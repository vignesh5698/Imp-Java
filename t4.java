import java.util.*;
class t4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch[]=str.toCharArray();
int n=str.length()/5;
int m=0;
try{
for(int i=0;i<=n;i++){
for(int j=0;j<5;j++){
System.out.print(ch[m]+" ");
m++;
}
System.out.println();
}
}catch(Exception e){
System.out.print("");
}
//checks for too
int m1=0;
for(int i=0;i<n;i++){
for(int j=0;j<5;j++){
if(ch[m1]=='T' && ch[m1+5]=='O' && ch[m1+10]=='O'){
System.out.println("\nStart Index:<"+i+","+j+">\n"+"End Index:<"+(i+2)+","+j+">");
}
m1++;
}
}
}
}
