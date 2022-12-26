package recursion;
public class xtopowern {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowernm1=calcpower(x,n-1);
        int xpowern=x*xpowernm1;
        return xpowern;
    }
    public static void main(String args[]){
        System.out.println(calcpower(2,6));
    }
}
