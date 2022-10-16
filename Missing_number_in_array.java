import java.util.*;
class Missing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int arr[]=new int[100];
            int sum=0;
            for(int i=1;i<=n-1;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println((n*(n+1)/2)-sum);
            t-=1;
        }
    }
}