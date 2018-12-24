import java.util.*;
class rat{
static int n=0;
void print(int sol[][]){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(" "+sol[i][j]+" ");
}
System.out.println();
}
}
boolean safe(int maze[][],int x,int y){
return (x>=0 && x<n && y>=0 && y<n && maze[x][y]==1);
}

boolean solveMaze(int maze[][]){

int sol[][]=new int[n][n];
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
sol[i][j]=0;
}
}

//int sol[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
if(solveMazeUtil(maze,0,0,sol)==false){
System.out.println("Solution not exist");
return false;
}
print(sol);
return true;
}


boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
if(x==n-1 && y==n-1){
sol[x][y]=1;
return true;
}
if(safe(maze,x,y)==true){
sol[x][y]=1;
//right
if(solveMazeUtil(maze,x+1,y,sol))
return true;
if(solveMazeUtil(maze,x,y+1,sol))
return true;
sol[x][y]=0;
return false;
}
return false;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int maze[][]=new int[4][4];
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
maze[i][j]=sc.nextInt();
}
}

//int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
rat r=new rat();
r.solveMaze(maze);
}
}

