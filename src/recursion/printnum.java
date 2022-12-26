package recursion;
import java.util.*;
public class printnum{
    public void print(int num){
        if(num==0){//base condition or case
            return ;
        }else{
            System.out.println(num);//print
            print(num-1);//recursion
        }
    }
    public void printnumb(int num){
        if(num==6){
            return ;
        }
        else{
            System.out.println(num);
            printnumb(num+1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        printnum p1=new printnum();
        System.out.println("\n\tEnter the number: ");
//        int num=sc.nextInt();
//        p1.print(num);
        p1.printnumb(1);
    }
}
