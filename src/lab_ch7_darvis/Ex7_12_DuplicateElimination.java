package lab_ch7_darvis;

import java.util.Scanner;

public class Ex7_12_DuplicateElimination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int values[] = new int[5];
        int count = 0;

        while (count < values.length) {
            System.out.print("Введите число: ");
            int number = sc.nextInt();

            if (10 <= number && number <= 100) {

                boolean flag = false; // флаг на повторение


                for (int i = 0; i < count; i++)

                    if (number == values[i])
                        flag = true;


                if (!flag) {
                    values[count] = number;
                    count++;
                } else
                    System.err.printf("%d уже записано\n",
                            number);
            } else
                System.err.println("число должно быть от 10 до 100");


            for (int i = 0; i < count; i++)
                System.out.printf("%d ", values[i]);
            System.out.println();
        }
    }
}


