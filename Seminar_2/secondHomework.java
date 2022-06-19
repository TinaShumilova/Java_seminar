/**
 * Задача №3
 */
public class secondHomework {

    public static void main(String[] args) {
        int n = 4;
        if (n < 0) {
            System.out.println("Неверное число");
        }else{
            //double number = TrippleNimberBasic(n);
            int number = TrippleNimberRecurrent(n);
            System.out.println(number);
        }                   
    }
        
    static double TrippleNimberBasic(int n){
        double answer = 0;
        if (n==0) {
            return answer;
        }else{
            answer = 0.5 * n  * (n +1);
            return answer;
        }
    }
    
    static int TrippleNimberRecurrent(int n){
        int result = 0;
        if (n == 0) {
            return result;
        }
        if (n == 1) {
            result = 1;
            return result;
        }else{
            result = TrippleNimberRecurrent(n - 1) + n;
            return result;
        }
    }
}