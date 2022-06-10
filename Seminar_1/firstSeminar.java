import java.io.FileReader;
import java.io.BufferedReader;;
/**
Задача №1
 */
public class firstSeminar {
    static String[] ReadNumber(String file_name) throws Exception{
        BufferedReader lines = new BufferedReader(new FileReader(file_name));
        String numbers;
        String number_a = null;
        String number_b = null;
		while ((numbers = lines.readLine()) != null) {
            char temp = numbers.charAt(0);
            switch (temp) {
                case 'a':
                    String temp_a = numbers;
                    number_a = temp_a.replaceAll("\\D+", "");
                    break;
                case 'b':
                    String temp_b = numbers;
                    number_b = temp_b.replaceAll("\\D+", "");
                    break;
            }    

		}
		lines.close();
        return new String[] {number_a, number_b};
    }
    static int FindPow(int a, int b){
        int result = a;
        for (int i = 0; i < b - 1; i++) {
            result = result * a;
        } 
        return result;
    }
    public static void main(String[] args) throws Exception{
        String[] temp_array = ReadNumber("input.txt");
        int a = Integer.parseInt(temp_array[0]);
        int b = Integer.parseInt(temp_array[1]);
        int answer = FindPow(a, b);
        System.out.printf(" %d ^ %d = %d", a, b, answer);


    }
}    
       
    