public class Choice {
    public void NumberTypeChoice(){
        System.out.println("Choose number type!");
        System.out.println("Press 1 if rational, press 2 if complex");
        Terminal choice = new Terminal();
        Double tempAnswer = choice.GetNumber();
        int answer = tempAnswer.intValue();
        switch (answer) {
            case 1:
                System.out.println("You choesed rational numbers");
                RationalNumbers test1 = new RationalNumbers();
                test1.RationalOperations();
                break;
            case 2:
                System.out.println("You choesed complex numbers");
                System.out.println("Please use sample: a + bi");
                ComplexOperations test2 = new ComplexOperations();
                test2.ComplexOperation();  
                break;
            default:
                System.out.println("Wrong answer");
                break;
        }
    }
}
