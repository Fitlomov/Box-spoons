import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String[] Array1 = {
            "test", "service", "test2", "dev", "test3", "service2", "test4", "prod", "test5"
        };
        String[] Array2 = {
            "test5", "service2", "test3", "prod", "dev"
        };
        System.out.println(Arrays.asList(Array1));
        System.out.println(Arrays.asList(Array2));

        String String_out = new String();

        for (int counter= 0; counter < 9; counter++) {
          Boolean counterChar = false;
            for (int counter2 = 0; counter2 < 5; counter2++) {
                if (Array1[counter] == Array2[counter2]) {
                    counterChar = true;
                    break;
                }
                else {
                    counterChar = false;
                }
            }
          if(counterChar == true){
              String_out = String_out + "1";
          }
          else {
              String_out = String_out + "0";
          }
        }
        System.out.println(String_out);
    }
}
