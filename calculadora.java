package calculadora;
import java.util.Scanner; // Importación de la clase Scanner.
 
public class TestCalculadora{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0;
        String val="a";
        double res = 0;
        
        System.out.println("Que calculo realizarás? Ingresa el signo ");

        switch (val){
            case "+": 
            res= num1+num2;
            break;

            case"-":
            res= num1-num2;
            break;
        }