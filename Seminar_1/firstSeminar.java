import java.io.FileReader;
import java.io.BufferedReader;
/**
Задача №1
 */
public class firstSeminar {
    static String[] ReadNumber(String file_name) throws Exception{
        BufferedReader lines = new BufferedReader(new FileReader(file_name));
        String numbers;
        String number_a = "";
        String number_b = "";
		while ((numbers = lines.readLine()) != null) {
            char temp = numbers.charAt(0);
            switch (temp) {
                case 'a':
                    String temp_a = numbers;
                    number_a = temp_a.replaceAll("\\D+", "");
                    break;
                case 'b':
                    String temp_b = numbers;
                    int length_b = temp_b.length();
                    for (int i = 0; i < length_b; i++) {
                        if (Character.isDigit(temp_b.charAt(i)) || temp_b.charAt(i) == '-'){
                            number_b = number_b + temp_b.charAt(i);
                        }
                    }
                    break;
            }    

		}
		lines.close();
        return new String[] {number_a, number_b};
    }
    static String FindPow(int a, int b){
        double result = a;
        String answer = null;
        if(a == 0){
           if (b == 0){
               answer = "не определено";
           } else {
               answer = "0";
           }
        } else {
            if (b > 0){
                for (int i = 0; i < b - 1; i++) {
                    result = result * a;
                }
            } else {
                if (b == 0){
                    result = 1;
                } else {
                    b = b * -1;
                    for (int i = 0; i < b - 1; i++) {
                        result = result * a;
                    }
                    result = 1 / result;
                }    
            }
        }
        answer = Double.toString(result);
        return answer;
    }
    public static void main(String[] args) throws Exception{
        String[] temp_array = ReadNumber("input.txt");
        int a = Integer.parseInt(temp_array[0]);
        int b = Integer.parseInt(temp_array[1]);
        String answer = FindPow(a, b);
        System.out.printf("a = %d, b = %d \n", a, b);
        System.out.printf("ответ: %s ", answer);
    }
}    