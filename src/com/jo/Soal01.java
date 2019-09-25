package jo;

public class Soal01 {
    public Soal01(String name, String inputString) {
        Resolve(name, inputString);
    }

    public static void Resolve(String name, String inputString) {
        int[] arInt = jo.Utility.stringToInt(inputString);
        int orderTotal = 0;

        for (int i = 0; i < arInt.length; i++) {
            orderTotal += arInt[i];
        }

        int discount = 0;
        int tax =0;

        if (orderTotal >= 30000) {
            discount = orderTotal * 50 / 100;
            if (name.toUpperCase().contains("A") && name.toUpperCase().contains("I")) {
                if (discount >= 30000) {
                    discount = 30000;
                }
            } else {
                if (discount >= 20000) {
                    discount = 20000;
                }
            }
        }
        orderTotal -= discount;
        tax = orderTotal * 10 / 100;
        System.out.println("Total Price: "+(orderTotal+tax));
    }
}
