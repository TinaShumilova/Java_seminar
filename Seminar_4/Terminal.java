import java.util.Scanner;

public class Terminal {

    public double GetNumber(){
        Scanner iScanner = new Scanner(System.in);
		System.out.printf("Add number: ");
        double number;
        if(iScanner.hasNextDouble()){               
		    number = iScanner.nextDouble();
        }else {
            System.out.println("Wrong number");
            iScanner.next();
            number = GetNumber();
        }
        //iScanner.close();
        return number;
    }

    public char GetSimbol(){
        Scanner iScanner = new Scanner(System.in);
		System.out.printf("Add simbol: ");
        char simbol;
        if(iScanner.hasNext()){               
		    simbol = iScanner.next().charAt(0);
        }else {
            System.out.println("Wrong simbol");
            iScanner.next();
            simbol = GetSimbol();
        }
        //iScanner.close();
        
        return simbol;
    }
}
