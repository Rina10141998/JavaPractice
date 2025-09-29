package Challenge.LibrarySystem;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //登録する本の数
        int n = sc.nextInt();
        sc.nextLine();

        //タイトル
        ArrayList<String> titles = new ArrayList<>();
        //著者
        ArrayList<String> authors = new ArrayList<>();
        //貸出状況
        ArrayList<String> borrowed = new ArrayList<>();

        //本の初期状態
        String b = "[在庫あり]";

        //登録する本の内容
        for(int i = 0; i < n; i++){
            titles.add(sc.next());
            authors.add(sc.next());
            borrowed.add(b);
            sc.nextLine();
        }


        while(sc.hasNextLine()){
            String command = sc.next();
            switch(command){
                case "BORROW" :
                    //貸出
                    String borrowBook = sc.next();
                    sc.nextLine();
                    int indexB = titles.indexOf(borrowBook);
                    borrowed.set(indexB, "[貸出中]");
                    break;

                case "RETURN" :
                    //返却
                    String returnBook = sc.next();
                    sc.nextLine();
                    int indexR = titles.indexOf(returnBook);
                    borrowed.set(indexR, "[在庫あり]");
                    break;

                case "LIST" :
                    //一覧出力
                    System.out.println("--- 本の一覧 ---");
                    for(int i = 0; i < n; i++){
                        System.out.print(titles.get(i) + " (" + authors.get(i) + ") " + borrowed.get(i));
                        System.out.println();
                    }
                    System.out.println("----------------");
                    break;

                case "EXIT" :
                    //終了
                    return;

                default :
                    System.out.println("有効なコマンドを入力してください");
                    System.out.println("貸出：BORROW 作品名");
                    System.out.println("返却：RETURN 作品名");
                    System.err.println("一覧出力：LIST");
                    System.out.println("終了：EXIT");
                    break;
            }
        }

        sc.close();
        
    }

    
}



