import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        
        String [] ary = N.split("\\+");
        
        int sum = 0;
        
        
        for(String num : ary){
            int ten = 0;
            int one = 0;
            
            for(char a : num.toCharArray()){
                if(a == '<'){
                    ten += 10;
                }else if(a == '/'){
                    one++;
                }
            }
            sum += ten + one;
             
        }
        System.out.println(sum);
            
        
       
        
    }
}