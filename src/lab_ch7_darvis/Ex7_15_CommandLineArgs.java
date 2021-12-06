package lab_ch7_darvis;

public class Ex7_15_CommandLineArgs {
    public static void main(String[] args){
        int[] array;
        int x = 5;
        array = new int[(args.length == 1) ? Integer.parseInt(args[0]) : 10];

        System.out.println(" Эл-т" +" \t"+"Значение");

        for(int i=0; i<array.length; i++){
            x+=5;
            array[i]=x;
            System.out.printf("%5d%8d\n", i+1, array[i]);
        }
    }
}
