import java.util.*;
class tictactoe{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch[][]=new char[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
ch[i][j]='-';
}
System.out.println("Initial stage :\n\n");
}
tictactoe t=new tictactoe();
t.display(ch);
System.out.println("...Enter the positions[1,2,3]...");
int k=1;
for(int i=0;i<9;i++){
if(k%2==1){
System.out.println("\nTurn for Player-1 [O] :");
int y=sc.nextInt();
int z=sc.nextInt();
ch[y-1][z-1]='O';
}else{
System.out.println("\nTurn for Player-2 [X] :");
int y=sc.nextInt();
int z=sc.nextInt();
ch[y-1][z-1]='X';
}
t.display(ch);
t.check(ch,k);
k++;

}

}
void display(char a[][]){
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
void check(char a[][],int n){
String game="";
int o,x,om=0,xm=0;
for(int i=0;i<3;i++){
o=0;x=0;
//om=0;xm=0;
for(int j=0;j<3;j++){
if(n%2==1){
if(a[i][j]=='O'){
o++;
}
if(i==j){ 
if(a[i][j]=='O')
om++;
}
}else{
if(a[i][j]=='X'){
x++;
}
if(i==j){

if(a[i][j]=='X')
xm++;
}
}

}

if(o==3 || om==3){
System.out.println("....Player-1 Wins....");
game="over";
}
if(x==3 || xm==3 ){
System.out.println("....Player-2 Wins....");
game="over";
}
}
if(game.equals("over")){
System.out.println("*****---GAME--OVER---*****");
System.exit(0);
}
}
}



