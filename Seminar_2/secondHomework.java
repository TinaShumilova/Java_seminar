/**
 * Задача №3
 */
public class secondHomework {

    public static void main(String[] args) {
        double number = TrippleNimberBasic(4);
        System.out.println(number);
    }
    static double TrippleNimberBasic(int n){
        double answer = 0.5 * n  * (n +1);
        return answer;
    }

}