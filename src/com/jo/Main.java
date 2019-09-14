package jo;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        Scanner inputObject = new Scanner(System.in);
        System.out.println("input Case number: ");
        int inputCase= inputObject.nextInt();
        int inputValue = 0;
        String inputString = "";
        String inputString2="";
        switch (inputCase){
            case 1:
                System.out.println("input Name: ");
                inputObject.nextLine();
                String name = inputObject.nextLine();
                System.out.println("input row order price: ");
                inputString = inputObject.nextLine();
                Soal01 soal01 = new Soal01(name,inputString);
                break;
            case 2:
                System.out.println("input Saldo: ");
                inputValue = inputObject.nextInt();
                Soal02 soal02 = new Soal02(inputValue);
                break;
            case 3:
                System.out.println("input N cupcake: ");
                inputValue = inputObject.nextInt();
                Soal03 soal03 = new Soal03(inputValue);
                break;
            case 4:
                System.out.println("input saldo: ");
                inputValue = inputObject.nextInt();
                Soal04 soal04 = new Soal04(inputValue);
                break;
            case 5:
                System.out.println("input deret jarak dalam meter: ");
                inputObject.nextLine();
                inputString = inputObject.nextLine();
                Soal05 soal05 = new Soal05(inputString);
                break;
            case 6:
                System.out.println("input deret A");
                inputObject.nextLine();
                inputString = inputObject.nextLine();
                System.out.println("input deret B");
                inputString2 = inputObject.nextLine();
                Soal06 soal06 = new Soal06(inputString, inputString2);
                break;
            case 7:
                System.out.println("input Hattori Simbol:");
                inputObject.nextLine();
                inputString = inputObject.nextLine();
                Soal07 soal07 = new Soal07(inputString);
                break;
            case 8:
                System.out.println("input ukuran kertas A");
                inputValue = inputObject.nextInt();
                Soal08 soal08 = new Soal08(inputValue);
                break;
            case 9:
                System.out.println("input pulsa");
                inputValue = inputObject.nextInt();
                Soal09 soal09 = new Soal09(inputValue);
                break;
            case 10:
                System.out.println("input N: ");
                inputValue = inputObject.nextInt();
                Soal10 soal10 = new Soal10(inputValue);
                break;
            default:
                System.out.println("case doesn't exist");
                break;
        }

    }
}
