import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String[] Array1 = new String[9];
        Scanner input = new Scanner(System.in);

        System.out.println("Введите элементы первого массива");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = input.nextLine();
        }
        System.out.println("Введите размерность и элементы второго массива");
        int size = input.nextInt();
        String[] Array2 = new String[size];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = input.nextLine();
        }

        System.out.println(Arrays.asList(Array1));
        System.out.println(Arrays.asList(Array2));

        String String_out = new String();

        for (int counter= 0; counter < 9; counter++) {
          Boolean counterChar = false;
            for (int counter2 = 0; counter2 < Array2.length; counter2++) {
                if (Array1[counter].equals(Array2[counter2])) {
                    counterChar = true;
                    break;
                }
                else {
                    counterChar = false;
                }
            }
          if(counterChar.equals(true)){
              String_out = String_out + "1";
          }
          else {
              String_out = String_out + "0";
          }
        }
        System.out.println(String_out);
    }
}
