
public class Parser {
    
    public ComplexNumbers Parse(String temp){
        String real;
        String imag;
        ComplexNumbers number = new ComplexNumbers(); 
        temp = temp.trim();
        String[] text = temp.split(" ", 3);
        switch (text[1]) {
            case "+":
                real = text[0];
                imag = text[2];
                if(imag.contains("i")){
                    imag = imag.substring(0, imag.length()-1);
                }
                number.PutX(Double.parseDouble(real));
                number.PutY(Double.parseDouble(imag));
                break;
            case "-":
                real = text[0];
                imag = "-" + text[2];
                if(imag.contains("i")){
                    imag = imag.substring(0, imag.length()-1);
                }
                number.PutX(Double.parseDouble(real));
                number.PutY(Double.parseDouble(imag));
                break;
            default:
                System.out.println("Wrong complex number");
                break;
        }
        return number;
    }

} 
