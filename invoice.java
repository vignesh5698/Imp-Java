import java.util.*;
class invoice{
int cc=0;
cus ob1[]=new cus[3];
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
invoice iv=new invoice();
char ch='y';
while(ch=='y'){
System.out.println("------INVOICE MANAGEMENT------\n1.Add Customer\n2.Add Invoice\n3.List Customers\n4.List Invoices");
int c=sc.nextInt();
switch(c){
case 1:iv.addc();break;
case 2:iv.addi();break;
case 3:iv.listc();break;
case 4:iv.listi();break;
default :System.out.println("Invalid Choice");
}
}
}
void addc(){
Scanner sc=new Scanner(System.in);
int id;
String name;
if(cc<3){
System.out.println("Enter Customer ID :");
id=sc.nextInt();
System.out.println("Enter Customer name :");
name=sc.next();
ob1[cc]=new cus(id,name);
ob1[cc].create();
cc++;
}else{
System.out.println("Directory Full.");
}
}

void addi(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer ID : ");
int i=sc.nextInt();
int k=cc,id1,l=0;
while(k>0){
id1=ob1[l].id;
if(i==id1){
break;
}
k--;l++;
}
String iname;int cost;
System.out.println("Enter item name : ");
iname=sc.next();
System.out.println("Enter item cost :");
cost=sc.nextInt();
ob1[l].addinv(iname,cost);
}

void listc(){
int id1;String name1;
int k=cc;int l=0;
System.out.println("----CUSTOMER'S LIST----\nID\t-\tNAME");
while(k>0){
id1=ob1[l].id;
name1=ob1[l].name;
System.out.println(id1+"\t-\t"+name1);
k--;l++;
}
}
void listi(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the customer ID : ");
int cid=sc.nextInt();
int k=cc,l=0,id1;
while(k>0){
id1=ob1[l].id;
if(cid==id1){
break;
}
k--;l++;
}
ob1[l].getinv();
}
}

class cus{
int id,cost,l=0;
String name,iname;

public cus(int i,String n){
id=i;
name=n;
}
c3 ob2[]=new c3[3];

public void create(){
for(int i=0;i<3;i++){
ob2[i]=new c3();
}
}

public void addinv(String itemname,int icost){
iname=itemname;
cost=icost;
ob2[l].set(iname,cost);
l++;
}
public void getinv(){
int ll=l,kk=0;
System.out.println("Item Name\tCost");
while(ll>0){
ob2[kk].get();
ll--;kk++;
}
}
}


class c3{
int cost;
String iname;
void set(String n,int c){
iname=n;
cost=c;
}
void get(){
System.out.println(iname+"\t"+cost);
}
}
