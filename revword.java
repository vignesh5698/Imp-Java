import java.util.*;
class revword{
 public static void main(String args[]) 
    { Scanner sc=new Scanner(System.in);
        String str = sc.nextLine(); 
        String[] arrOfStr = str.split("\\s"); 
              StringBuilder sb;
String s1="";
        for (String a : arrOfStr) {
         sb=new StringBuilder(a);
           // System.out.println(a); 
s1=sb.reverse().toString()+" ";
System.out.print(s1);

    } 
}

}

