import java.util.*;
class smallarr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}

int b[]=new int[n];
for(int i=0;i<n;i++){
b[i]=a[i];
}

for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

int c[]=new int[n];
for(int x:b){
int index=Arrays.binarySearch(a,x);
if(index<n-1){
System.out.print(a[index+1] + " ");
}else{
System.out.print("_ ");
}

}
}
}
