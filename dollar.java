import java.util.*;
class dollar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
char ch[][]=new char[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
ch[i][j]=sc.next().charAt(0);
}
}
//words
System.out.println("Enter number of words :");
int w=sc.nextInt();
String s[]=new String[w];
for(int i=0;i<w;i++){
s[i]=sc.next();
}
int fin=0;
//up-to-bottom
for(int k=0;k<w;k++){
String g=s[k];fin=0;
for(int j=0;j<m;j++){
String str="";
for(int i=0;i<n;i++){
str=str+ch[i][j];
}

if(str.contains(g)){
//System.out.println("TRUE");
fin=1;
break;
}else{
//System.out.println("FALSE");
}
}
for(int i=0;i<n;i++){
String s1="";
for(int j=0;j<m;j++){
s1=s1+ch[i][j];
}
if(s1.contains(g)){
fin=1;break;
}
}
if(fin==1){
System.out.println("TRUE");
}else{
System.out.println("FALSE");
}
}
//ri8 to left

}
}
