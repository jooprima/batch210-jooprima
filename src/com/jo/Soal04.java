package jo;

public class Soal04 {
    public Soal04(int inputValue) {
        Resolve(inputValue);
    }
    public static void Resolve(int inputValue){
        int saldo = inputValue;
        int loliPrice = 1000;
        int item = saldo/loliPrice;
        int total = item * loliPrice;
        int bonus = item / 5;
        System.out.println("Total loli: "+(item+bonus));
        System.out.println("sisa uang: "+(saldo-total));

    }
}
