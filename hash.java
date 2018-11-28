import java.util.*;
class hash{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int l=0;
int b[][]=new int[n][2];
Arrays.sort(a); 
for(int i=0;i<n;i++){
int k=1;

 while (i < n - 1 && a[i] == a[i + 1]) {
k++; 
               i++; 
}


b[l][0]=a[i];
b[l][1]=k;
l++;
}

for(int j=0;j<l;j++){
for(int i=0;i<l-1;i++){
if(b[i][1]<b[i+1][1]){
int temp=b[i][1];
int ele=b[i][0];
b[i][1]=b[i+1][1];
b[i][0]=b[i+1][0];
b[i+1][1]=temp;
b[i+1][0]=ele;
}
}
}
for(int i=0;i<l;i++){
int x=b[i][1];
for(int j=0;j<x;j++){
System.out.print(b[i][0]+" ");
}
}

}
}
