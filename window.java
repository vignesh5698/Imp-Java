import java.util.*;
class window{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int t=0,l=0;
int w=sc.nextInt();
for(int i=0;i<n-w;i++){
t=0;
while(t<w){
int x=t+i;
if(a[x]>a[x+1]){
l=a[x];
}else{
l=a[x+1];
}
t++;
}
System.out.print(l+ " ");
}
}
}
