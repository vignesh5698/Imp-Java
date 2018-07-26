import java.util.*;
class father{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of sets of Father and son : ");
int n=sc.nextInt();
String str[][]=new String[n][2];
System.out.print("Enter the Names : ");
for(int i=0;i<n;i++){
for(int j=0;j<2;j++){
str[i][j]=sc.next();
}
}
for(int i=0;i<n;i++){
System.out.print("<");
for(int j=0;j<2;j++){
System.out.print(str[i][j]+" ");
}
System.out.print(">\n\n");
}
System.out.println("Enter the name to find the number of grand children : ");
String s=sc.next();
int count=0;
for(int i=0;i<n;i++){
if(s.equals(str[i][1])){
//System.out.println("first");
String a=str[i][0];
for(int j=0;j<n;j++){
//System.out.println("Second");
if(a.equals(str[j][1])){
count++;
}
}
}
}
System.out.println(count);

}
}
