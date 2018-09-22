import java.io.*;
import java.util.*;
  public class StrAlign{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++)
      {
      if(i%2==0)
      {
        System.out.print(str.charAt(i));
      }
      else if(i%2!=0)
      {
        System.out.println(str.charAt(i));
      }
     }
   }
 }  
