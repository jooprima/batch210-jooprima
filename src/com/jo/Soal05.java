package jo;

public class Soal05 {
    public Soal05(String inputString) {
        Resolve(inputString);
    }
    public static void Resolve(String inputString){
        //input: 2000 500 500 2000
        int[]arrInt = Utility.stringToInt(inputString);
        double sum = 0;
        int bensin = 2500;
        for (int i = 0; i < arrInt.length ; i++) {
            sum += arrInt[i];
        }
        System.out.println((sum/bensin)+" Liter");
    }
}
