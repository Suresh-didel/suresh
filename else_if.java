import java.util.*;
public class else_if{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
         if(a==b){
            System.out.println("a equals to b");

         }
         else if(a>b){
            System.out.println("a is greater ");
         }
         else{
            System.out.println("a is lesser ");
         }
        }
    }
