import java.util.*;
class secfre{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);
int l=0;
int b[][]=new int[n][2];
for(int i=0;i<n;i++){
int k=1;
 while (i < n - 1 && a[i] == a[i + 1]) {

k++;i++;
}
b[l][0]=a[i];
b[l][1]=k;
l++;
}

for(int i=0;i<n;i++){
for(int j=0;j<n-1;j++){
if(b[j][1]<b[j+1][1]){
int temp=b[j][1];
int c=b[j][0];
b[j][1]=b[j+1][1];
b[j][0]=b[j+1][0];
b[j+1][1]=temp;
b[j+1][0]=c;
}
}
}
System.out.println("Second Largest Occuring Element : "+b[1][0]+" and the count is "+b[1][1]);
}
}
