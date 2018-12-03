import java.util.*;
class truthtable{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rows=(int)Math.pow(2,n);
for(int i=0;i<rows;i++){
for(int j=n-1;j>=0;j--){
System.out.print((i/(int)Math.pow(2,j))%2+" ");
}
System.out.println();
}
}
}
