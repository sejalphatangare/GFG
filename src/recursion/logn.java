package recursion;
public class logn {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return calcpower(x,n/2)* calcpower(x,n/2);
        }
        //if n is odd
        else{
            return calcpower(x,n/2)* calcpower(x,n/2)*x;
        }
    }
    public static void main(String args[]){
        System.out.println(calcpower(2,6));
    }
}

