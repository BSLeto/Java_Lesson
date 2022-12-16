package Semi_2;

import java.io.FileReader;
import java.util.Scanner;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class HW_1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/Users/jslet/OneDrive/Рабочий стол/Java Less/Semi_2/firstHW.json");
        Scanner scan = new Scanner(fr);
        String s = scan.nextLine();
        scan.close();
        fr.close();
        s = s.substring(1, s.length() - 1);
        s = s.replaceAll("\"", "");
        String[] text = s.split(",");
        for (int i = 0; i < text.length; i++) {
            String[] temp = text[i].split(": ");
            if (!temp[1].equals("null")) {
                System.out.println(temp[0] + ": " + temp[1]);
            }
        }
    }
}
