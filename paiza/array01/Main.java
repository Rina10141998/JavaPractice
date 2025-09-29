package array01;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); //縦席(行)
        int w = sc.nextInt(); //横席(列)
        
        int sy = sc.nextInt() - 1; //前からn番目
        int sx = sc.nextInt() - 1; //左からn番目
        
        String s = sc.next(); //移動
        
        int [][] seat = new int[h][w];
        
        //チョコレートの数を入力
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                seat[i][j] = sc.nextInt();
            }
        }
        
        ArrayList <String> move = new ArrayList<>(Arrays.asList(s.split("")));
        
        ArrayList<Integer> chocolate = new ArrayList<>();
        
        for(String moves : move){
            if(moves.equals("F")) sy--;
            if(moves.equals("B")) sy++;
            if(moves.equals("R")) sx++;
            if(moves.equals("L")) sx--;
            
            chocolate.add(seat[sy][sx]);
        }
        
        for(int c : chocolate){
            System.out.println(c);
        }

        sc.close();
       
    }
}
