package lab_ch7_darvis;
import java.util.Scanner;
public class Ex7_14_VariableLengthList {
    public static void main(String[] args) {

        System.out.println(list(1, 2, 3, 4, 5, 6, 7, 8, 9, 20));
        System.out.println(list(3, 3));
        System.out.println(list(1));
        System.out.println(list(0, 0, 0));
    }
    public static int list(int... args){
        for(int i=0; i<args.length-1; i++){
            System.out.print(args[i] + " * ");
        }
        System.out.print(args[args.length-1] + " = ");
        for(int i=1; i<args.length; i++){
            args[0] = args[0] * args[i];
        }
        return args[0];
    }
}
