import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ペットの名前
        ArrayList <String> petname = new ArrayList<>();
        //種類
        ArrayList <String> animal = new ArrayList<>();
        //飼い主の名前
        ArrayList <String> owner = new ArrayList<>();
        //診察状況
        ArrayList <String> shinsatsu = new ArrayList<>();


        while(sc.hasNextLine()){
            String command = sc.next();
                switch(command){
                case "REGISTER" :
                    petname.add(sc.next());
                    animal.add(sc.next());
                    owner.add(sc.next());
                    shinsatsu.add("[未診察]");
                    sc.nextLine();
                    break;

                case "TREAT" :
                    int treat = petname.indexOf(sc.next());
                    shinsatsu.set(treat, "[診察済み]");
                    break;

                case "LIST" :
                    System.out.println("--- カルテ一覧 ---");
                    for(int i = 0; i < petname.size(); i++){
                        System.out.println(
                            petname.get(i) +
                            "(" + animal.get(i) + ") 飼い主:" +
                            owner.get(i) + shinsatsu.get(i)
                        );
                    }
                    System.out.println("----------------");
                    break;

                case "EXIT" :
                    return;

                default :
                    System.out.println("有効なコマンドを入力してください");
                    System.out.println("登録：REGISTER （名前・種類・飼い主を入力）");
                    System.out.println("診察：TREAT (指定した動物を「診察済み」にする)");
                    System.out.println("一覧出力：LIST");
                    System.out.println("終了：EXIT");
                    break;

            }
        }
    }
}