package leetstring;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        ArrayList<String> str = new ArrayList<>(Arrays.asList(s.split("")));
        
        for(int i = 0; i < str.size(); i++){
            switch(str.get(i)){
                case "A" :
                    str.set(i, "4");
                    break;
                case "E" :
                    str.set(i, "3");
                    break;
                case "G" :
                    str.set(i, "6");
                    break;
                case "I" :
                    str.set(i, "1");
                    break;
                case "O" :
                    str.set(i, "0");
                    break;
                case "S" :
                    str.set(i, "5");
                    break;
                case "Z" :
                    str.set(i, "2");
                    break;
            }
        }
        
        for(String leet : str){
            System.out.print(leet);
        }

        sc.close();
    }
}