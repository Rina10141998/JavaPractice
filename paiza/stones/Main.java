import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int [][] stones = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                stones [i][j] = sc.nextInt();
            }
        }
        
        int stonesum = 0;
        int center = N / 2;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int distance = Math.max(Math.abs(i - center), Math.abs(j - center));
                int putStone = (N + 1) / 2 - distance;
                stonesum += stones[i][j] - putStone;
            }
        }
        
        System.out.println(stonesum);
    }
}