package recursion;

public class sum {
    public static void sum(int num, int i, int sum){

        if(i==num){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(num,i+1,sum);
        System.out.println(i);
    }
    public static void main(String[] args){
        sum(5,1,0);
    }
}
