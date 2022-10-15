import java.util.Scanner;
class PowerofNumber{
    public static void main(String args[]){
        int x,y,m;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        double P;
        P=(int)Math.pow(x,y);
        System.out.print((int)P%m);
    }
}