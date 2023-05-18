import java.util.Scanner;

public class Main {

    //Вывод текста и новвая строка
    public static void PrnLn(String words){
        System.out.println(words);
    }
    //Вывод теста и без крастной строки
    public static void Prn(String words){
        System.out.print(words);
    }


    public static void main(String[] args) {
        Scanner sc_In = new Scanner(System.in);
        Prn("Введите ваше имя: ");
        String name_Name = sc_In.nextLine();

        Prn("Привет ");
        Prn(name_Name);
    }
}