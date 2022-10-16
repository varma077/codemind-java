import java.util.*;
class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=3&&n<=100){
            for(int i=1;i<=n;i++){
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.print("
");
            }
            for(int j=n-1;j>=1;j--){
                for(int l=j;l>=1;l--){
                    System.out.print("*");
                }
                System.out.print("
");
            }
        }
        else{
            System.out.print("The pattern is not possible");
        }
    }
}