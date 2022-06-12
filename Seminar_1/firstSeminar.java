import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
/**
Задача №1
 */
public class firstSeminar {

    public static void main(String[] args) throws Exception{
        String[] temp_array = ReadNumber("input.txt");
        int a = Integer.parseInt(temp_array[0]);
        int b = Integer.parseInt(temp_array[1]);
        String answer = FindPow(a, b);
        System.out.printf("a = %d, b = %d \n", a, b);
        System.out.printf("ответ: %s ", answer);
        WriteNumber(answer, "output.txt");
    }
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
                    int length_a = temp_a.length();
                    for (int i = 0; i < length_a; i++) {
                        if (Character.isDigit(temp_a.charAt(i)) || temp_a.charAt(i) == '-'){
                            number_a = number_a + temp_a.charAt(i);
                        }
                    }
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
        switch (a) {
            case 0:
                if (b == 0){
                    answer = "не определено";
                } else {
                    answer = "0";
                }
                break;
            default:
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
                answer = Double.toString(result);
                break;
        }
        return answer;
    }
    static void WriteNumber(String answer, String fileName)throws Exception{
        FileWriter text = new FileWriter(fileName, false);
        text.append(answer);
        text.close();
    }
}    