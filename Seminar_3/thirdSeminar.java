
/**
 * №4
 */
public class thirdSeminar {

    public static void main(String[] args) {
        int n = 5; 
        towerOfHanoi(n, 'A', 'C', 'B');
    }


    static void towerOfHanoi(int n, char from_rod, char to_rod, char buf_rod)

    {

        if (n == 1)
        {
            System.out.printf("%d from %c => %c\n", n, from_rod, to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, buf_rod, to_rod);
        System.out.printf("%d from %c => %c\n", n, from_rod, to_rod);
        towerOfHanoi(n-1, buf_rod, to_rod, from_rod);
    }
        
}

