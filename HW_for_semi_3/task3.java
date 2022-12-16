package HW_for_semi_3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
public class task3 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }
    
    public static void Results(ArrayList<Integer> nArray) {
        nArray.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение : " + nArray.get(0));
        System.out.println("Максимальное значение : " + nArray.get(nArray.size()-1));
        double sumValues = 0;
        double arithmeticMean = 0;
        for (int i = 0; i < nArray.size(); i++) {
            sumValues += nArray.get(i);
        }
        arithmeticMean = sumValues / nArray.size();
            String s = Double.toString(arithmeticMean);
            DecimalFormat decimalFormat = new DecimalFormat("0.#####");
            String res = decimalFormat.format(Double.valueOf(s));
        System.out.println("Среднее арифметическое всех значений : " + res);
    }

    public static void main(String[] args){
        ArrayList<Integer> nArray =  GetRandomArray(10);
        System.out.println(nArray);
        Results(nArray);
}
}