import java.util.*;
class t1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String v="aeiouAEIOU";
int n=s.length();
char c1[]=s.toCharArray();
char c2[]=v.toCharArray();
char c3[]=new char[n];
int m=0;
for(int i=0;i<n;i++){
boolean bool=true;
for(int j=0;j<10;j++){
if(c1[i]==c2[j]){
bool=false;
}
}
if(bool==true){
c3[m]=c1[i];
m++;
}
}

for(int i=0;i<m;i++){
System.out.print(c3[i]);
}

}
}
