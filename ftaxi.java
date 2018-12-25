import java.util.*;
class ftaxi{
public static void main(String args[]){
int i1;
Scanner sc=new Scanner(System.in);
Taxi t[]=new Taxi[4];
for(i1=0;i1<4;i1++){
t[i1]=new Taxi();
}
Booking b[]=new Booking[10];
int i=0;
while(true){
System.out.println("----CALL TAXI BOOKING----\n1.Booking\n2.Display\n3.Exit\nEnter your choice :");
int ch=sc.nextInt();
if(ch<1||ch>3){
System.out.println("Invalid Input.");return;
}
if(ch==1){
System.out.println("Enter customer ID :");
int id=sc.nextInt();
System.out.println("Enter pick point :");
char pick=sc.next().charAt(0);
System.out.println("Enter drop point :");
char drop=sc.next().charAt(0);
System.out.println("Enter pick time :");
int pickTime=sc.nextInt();
b[i]=new Booking(id,pick,drop,pickTime);
int a;
a=b[i].avail(t);
System.out.println("Output - "+(i+1));
if(a!=-1){
System.out.println("Taxi - "+(a+1)+" is alloted.");
t[a].calcEarnings(b[i].pick,b[i].drop);
b[i].dropTime();
b[i].calcEarnings();
}else{
System.out.println("Booking is rejected.");
}
i++;
}else if(ch==2){
for(int k=0;k<4;k++){
if(t[k].earnings!=0){
System.out.println("Taxi - "+(k+1)+"\tTotal Earnings : Rs."+t[k].earnings);
for(int j=0;j<i;j++){
if(b[j].taxino==k){
System.out.println("\n\nCustomer ID : "+b[j].id+"\nPickup Point : "+b[j].pick+"\nDrop Point : "+b[j].drop+"\nPickup Time : "+b[j].pickTime+"\nDrop Time : "+b[j].dropTime+"\nEarnings : "+b[j].earnings);
}
}
}
}
}else{
System.out.println("Thanks For Using.");
}
}
}
}
class Booking{
int id,pickTime,dropTime,earnings;
char pick,drop;
public Booking(int i,char p,char d,int ptime){
pick=p;
drop=d;
id=i;
pickTime=ptime;
}
Taxi t[];
int taxino;
public void dropTime(){
this.dropTime=(pickTime+(Math.abs(pick-drop)));
}
public void calcEarnings(){
int dist=(Math.abs(pick-drop)*15);
this.earnings=((dist-5)*10)+100;
}
//ISAVAILABLE
public int avail(Taxi t[]){
int min=6,temp=-1;
for(int i=0;i<4;i++){
if(Math.abs(pick-t[i].initialPoint)<=min && t[i].deptTime<=pickTime){
if(temp==-1 || Math.abs(pick-t[i].initialPoint)<min)
temp=i;

if(Math.abs(pick-t[i].initialPoint)==min && t[i].deptTime<=pickTime){
if(t[temp].earnings>t[i].earnings)
temp=i;
}

min=Math.abs(pick-t[i].initialPoint);
}
}
if(min!=6){
t[temp].deptTime(pickTime,pick,drop);
t[temp].initialPoint=drop;
taxino=temp;
return temp;
}
return -1;
}
}
class Taxi{
char initialPoint;
int deptTime,earnings;
public Taxi(){
initialPoint='A';
}
public void deptTime(int pickTime,char pick,char drop){
this.deptTime=(pickTime+(Math.abs(pick-drop)));
}
public void calcEarnings(char pick,char drop){
int dist=(Math.abs(pick-drop)*15);
int amount=((dist-5)*10)+100;
this.earnings=earnings+amount;
}
}
