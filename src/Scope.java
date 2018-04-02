// Продемонстрировать область действия блока кода
public class Scope {
    public static void main(String args[]){
        int x; // эта переменная доступна всему коду из метода main()

        x = 10;
        if (x == 10){ // начало новой области
            int y = 20; // доступной только этому блоку кода

            // обе переменные х и у доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100;  //ОШИБКА! Переменная у недоступна
                    //в этой области действия
                    //переменная х доступна и здесь
        System.out.println("x равно " + x);
    }
}
