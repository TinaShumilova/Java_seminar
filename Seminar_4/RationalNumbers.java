
/**
 * Test
 */
public class RationalNumbers {
	
        public void RationalOperations(){ 
        Terminal test = new Terminal();
        double number = test.GetNumber();
        char simbol = test.GetSimbol();
        double result = number;

        while (simbol != '=') {
            switch (simbol) {
                case '+':
                        number = test.GetNumber();
                        result += number;
                        System.out.printf("Temp result: %f\n", result);
                        break;
                case '-':
                        number = test.GetNumber();
                        result -= number;
                        System.out.printf("Temp result: %f\n", result);
                        break;
                case '/':
                        number = test.GetNumber();
                        result = result / number;
                        System.out.printf("Temp result: %f\n", result);
                        break;
                case '*':
                        number = test.GetNumber();
                        result = result * number;
                        System.out.printf("Temp result: %f\n", result);
                        break;
                default:
                        System.out.println("Wrong simbol");
                        break;
            }
                simbol = test.GetSimbol();		   
        }
        System.out.printf("Final result: %f", result);
        }
}


