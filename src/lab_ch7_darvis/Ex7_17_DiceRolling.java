package lab_ch7_darvis;

import java.util.Date;
import java.util.Random;

public class Ex7_17_DiceRolling {
    private static final Random random = new Random();
    public static void main(String[] args) {

        Date start = new Date();  //начало отсчета таймера
        int[] repetitions = new int[13];
        int rolls = 36000000;
        int total_rolls = 0;
        int max = 0;
        int maxIndex = 0;
        int sum = 0;
        //заполнение массива повторений
        for (int i = 0; i < rolls; i++) {
            int dice1 = 1 + random.nextInt(6);
            int dice2 = 1 + random.nextInt(6);
            sum = dice1 + dice2;

            repetitions[sum]++;
        }

        Date finish = new Date();  //конец отсчета таймера

        //вывод таблицы на экран
        System.out.printf("%s \t\t%s%n", "Сумма", "Число повторений");

        for (int i = 2; i < repetitions.length; i++) {
            total_rolls += repetitions[i];
            System.out.printf("%3d\t\t->\t\t%5d%n", i, repetitions[i]);
        }
        //поиск максимального числа повторений
        for (int i = 0; i < repetitions.length; i++) {
            if (max <= repetitions[i]) {
                max = repetitions[i];
                maxIndex++; //индекс в массиве
            }
        }
        double time_elapsed = (((finish.getTime() - start.getTime())) / 1000.0);

        System.out.println("Потрачено времени \t->\t " + time_elapsed + "s");
        System.out.println("Всего повторений \t->\t " + total_rolls);
        System.out.println("Максимальное число повторений -> " + max + " при индексе суммы = " + (maxIndex-1));
    }
}

