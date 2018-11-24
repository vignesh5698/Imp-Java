import java.util.*;
class paran{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int n=str.length();
int l=0;String lbal="";
for(int i=0;i<n;i++){
char c=str.charAt(i);
if(c=='('){
l++;
lbal=lbal+c;
}else if(c==')'){
if(l>0){
l--;
lbal=lbal+c;
}
}else{
lbal=lbal+c;
}
}
System.out.println(lbal);
String rbal="";
l=0;
for(int i=lbal.length()-1;i>=0;i--){
char s=lbal.charAt(i);
if(s==')'){
l++;
rbal=s+rbal;
}else if(s=='('){
if(l>0){
l--;
rbal=s+rbal;
}
}else{
rbal=s+rbal;
}
String s1=rbal;
System.out.println(s1);

}
}
}
