import java.util.*;
class oddeven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int odd[]=new int[n];
int even[]=new int[n];
int o=0,e=0;
for(int i=0;i<n;i++){
if(a[i]%2==0){
even[e]=a[i];
e++;
}else{
odd[o]=a[i];
o++;
}
}
System.out.print("EVEN :");
for(int i=0;i<e;i++){
System.out.print(even[i]);
}
System.out.print("ODD :");
for(int i=0;i<o;i++){
System.out.print(odd[i]);
}
}
}
