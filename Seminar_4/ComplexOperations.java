public class ComplexOperations {
    
    public void ComplexOperation() {
        Terminal test1 = new Terminal();
        Parser tempNumber = new Parser();
        ComplexNumbers number1 = tempNumber.Parse(test1.GetComplex());
        System.out.printf("First number: %f + %fi\n", number1.GetX(), number1.GetY());
        char simbol = test1.GetSimbol();
        ComplexNumbers number3 = number1;
        ComplexNumbers number2 = new ComplexNumbers();
        ComplexOperations operations = new ComplexOperations();
        
        while (simbol != '=') {
            switch (simbol) {
                case '+':
                    number2 = tempNumber.Parse(test1.GetComplex());
                    System.out.printf("Add number: %f + %fi\n", number2.GetX(), number2.GetY());
                    number3 = operations.Sum(number3, number2);
                    System.out.printf("Result: %f + %fi\n", number3.GetX(), number3.GetY());
                    break;
                case '-':
                    number2 = tempNumber.Parse(test1.GetComplex());
                    System.out.printf("Add number: %f + %fi\n", number2.GetX(), number2.GetY());
                    number3 = operations.Sub(number3, number2);
                    System.out.printf("Result: %f + %fi\n", number3.GetX(), number3.GetY());
                    break;
                case '/':
                    System.out.printf("ещё не поняла как считать");
                    break;
                    
                case '*':
                    number2 = tempNumber.Parse(test1.GetComplex());
                    System.out.printf("Add number: %f + %fi\n", number2.GetX(), number2.GetY());
                    number3 = operations.Mult(number1, number2);
                    System.out.printf("Result: %f + %fi\n", number3.GetX(), number3.GetY());
                    break;
                default:
                    System.out.println("Wrong simbol");
                    break;
            }
            simbol = test1.GetSimbol();
        }
        System.out.printf("Final result: %f + %fi\n", number3.GetX(), number3.GetY());
    }
    
    public ComplexNumbers Sum(ComplexNumbers a, ComplexNumbers b){
        ComplexNumbers c = new ComplexNumbers();
        c.PutX(a.GetX() + b.GetX());
        c.PutY(a.GetY() + b.GetY());
        return c;
    }

    public ComplexNumbers Sub(ComplexNumbers a, ComplexNumbers b){
        ComplexNumbers c = new ComplexNumbers();

        c.PutX(a.GetX() - b.GetX());
        c.PutY(a.GetY() - b.GetY());
        return c;
    }

    public ComplexNumbers Mult(ComplexNumbers a, ComplexNumbers b){
        ComplexNumbers c = new ComplexNumbers();

        c.PutX((a.GetX() * a.GetY()) - (b.GetX() * b.GetY()));
        c.PutY((a.GetX() * b.GetY()) - (a.GetY() * b.GetX()));
        return c;
    }

    /*TO DO  division
     * Деление

    Пусть два комплексных числа заданы в показательной форме записи

    z1 = z1 e jφ1 ;  z2 = z2 e jφ2 нужно найти частное этих чисел

    z3 = z1: z2 = z1 e jφ1 : z2 e jφ2 = (z1/ z2 ) e j(φ1 - φ2)

    То есть при делении модули делятся, а аргументы вычитаются.
     */


}
