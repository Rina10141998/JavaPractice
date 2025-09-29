package TimeofStay;

import java.util.*;
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        int totalTime = 0;
        
        for(int i = 0; i < N; i++){
            String entry = sc.next();
            String exit = sc.next();
            
            String [] e = entry.split(":");
            int ehour = Integer.parseInt(e[0]);
            int eminute = Integer.parseInt(e[1]);
            int entryMinute = ehour * 60 + eminute;
            
            String [] ex = exit.split(":");
            int exhour = Integer.parseInt(ex[0]);
            int exminute = Integer.parseInt(ex[1]);
            int exitMinute = exhour * 60 + exminute;
            
            totalTime += (exitMinute - entryMinute);
            
            
        }
        
        int timeHour = totalTime / 60;
        int timeMinute = totalTime % 60;
        
        System.out.print(timeHour + " " + timeMinute);

        sc.close();
    }
}
