import java.util.*;
class Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[100];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){count+=1;}
        }
        for(int i=0;i<count;i++){
            System.out.print("0"+" ");
        }
        for(int i=count;i<n;i++){
            System.out.print("1"+" ");
        }
    }
}