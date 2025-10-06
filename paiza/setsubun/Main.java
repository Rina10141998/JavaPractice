import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //参加人数
        int people = sc.nextInt();
        
        //豆の数
        ArrayList <Integer> mameall = new ArrayList<>();
        
        //参加者年齢
        ArrayList <Integer> age = new ArrayList<>();
        for(int i = 0; i < people; i++){
            age.add(sc.nextInt());
            mameall.add(0);
        }
        
        //命令数
        int com = sc.nextInt();
        
        //命令内容
        for(int j = 0; j < com; j++){
            int first = sc.nextInt() -1;
            int end = sc.nextInt();
            int mame = sc.nextInt();
            for(int i = first; i < end; i++){
                if(age.get(i) > (mame + mameall.get(i))){
                    mameall.set(i, mame + mameall.get(i));
                }else{
                    mameall.set(i, age.get(i));
                }
            }
        }
        for(int i = 0; i < age.size(); i++){
            System.out.println(mameall.get(i));
        }
    }
}