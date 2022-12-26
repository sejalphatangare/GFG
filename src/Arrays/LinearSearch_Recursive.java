package Arrays;
import java.util.*;

public class LinearSearch_Recursive {

    public int recursive_search(int array[],int size,int key){
        if(size==0){
            return  -1;

        } else if (array[size-1]==key) {
            return size-1;
        }
        else{
            return recursive_search(array,size-1,key);
        }
    }
    public static void main(String[] args){
        LinearSearch_Recursive l1=new LinearSearch_Recursive();
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3,4,5,67,7,8,0};
        int size=array.length;
        System.out.println("\n\tEnter the key you want to search: ");
        int key=sc.nextInt();
        int index= l1.recursive_search(array,size,key);
        if(index==-1){
            System.out.println("\n\tElement Not Found!");
        }else{
            System.out.println("\n\tElement Found at "+(index+1));
        }
    }
}
