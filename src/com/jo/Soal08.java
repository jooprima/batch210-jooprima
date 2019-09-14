package jo;

public class Soal08 {
    public Soal08(int inputValue) {
        Resolve(inputValue);
    }
    public static void Resolve(int inputValue){
        int input = inputValue;
        int sum =0;
        if(input == 5){
            sum = (int) Math.pow(2,1);
        }
        switch(input){
            case 5:
                sum = (int) Math.pow(2,1);
                break;
            case 4:
                sum = (int) Math.pow(2,2);
                break;
            case 3:
                sum = (int) Math.pow(2,3);
                break;
            case 2:
                sum = (int) Math.pow(2,4);
                break;
            case 1:
                sum = (int) Math.pow(2,5);
                break;
            default:
                System.out.println("kertas harus lebih besar dari A6");
                break;
        }

        System.out.println(sum);
    }
}
