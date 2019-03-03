//币值最大化
java.*;
class Coinrow{
    int c[];
    int dp[] = new int[200];
    int m;
    Coinrow(int c[],int m){
        this.m = m;
        this.c = c;
        dp[0] = 0;
        dp[1] = c[1];
        for(int i = 2;i<=m;i++){
            dp[i] = Math.max(c[i]+dp[i-2],dp[i-1]);
        }
    }

    int getans(){
        return dp[m];
    }
}

public class Main{
    public static void main(String []arg){
        Scanner scanf = new Scanner(System.in);
        int m = scanf.nextInt();
        int c[] = new int[m+1];
        for(int i = 1;i <= m;i++)
            c[i] = scanf.nextInt();
        Coinrow coinrow = new Coinrow(c,m);
        System.out.println(coinrow.getans());
    }
}