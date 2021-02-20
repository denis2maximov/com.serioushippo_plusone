import java.util.Scanner;

public class StartUI {
    public static void showMenu(){
        System.out.println("Меню");
        System.out.println("1. Добавление новой суммы : ");
        System.out.println("2. Вывод всех сумм : ");
    }

    public static void main(String[] args) {
       // String string = "Привет!";
    Tracker tracker = new Tracker();
          showMenu();
       Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пунк меню :");
        String name = scanner.nextLine();
        if (name.equals("1")) {
            System.out.println("Введите назначение платежа: ");
            String text = scanner.nextLine();
         // Number num = new Number(text);
          //  System.out.println("Введите назначение платежа: ");
         // tracker.addId(tracker.setText);
            
        }

         }
}
