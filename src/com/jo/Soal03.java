package jo;

public class Soal03 {
    public Soal03(int inputValue) {
        Resolve(inputValue);
    }

    public static void Resolve(int inputValue) {
        double[] arrRecipt = {125, 100, 100}; //15 cupcake
        double[] ingredients = new double[arrRecipt.length];
        for (int i = 0; i < arrRecipt.length; i++) {
            ingredients[i] = arrRecipt[i] / 15;
        }

        double terigu = ingredients[0] * inputValue;
        double gulaPasir =  ingredients[1] * inputValue;
        double susu = ingredients[2] * inputValue;


        System.out.println("membuat " + inputValue + " cupcake dibutuhkan: ");
        System.out.println("terigu: " + (int)terigu);
        System.out.println("gula pasir: " + (int)gulaPasir);
        System.out.println("Susu: " + (int)susu);
    }
}
