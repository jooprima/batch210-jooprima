package jo;

public class Soal02 {
    public Soal02(int inputValue) {
        Resolve(inputValue);
    }
    public static void Resolve(int inputValue){
        int saldo = inputValue;
        int esPrice = 18000;
        int minOrder = 40000;
        int maxDiscount = 100000;
        int item = saldo/esPrice;
        int totalPrice = item*esPrice;
        int discount = 0;
        int cashback = 0;
        int finalSaldo = 0;

        if(totalPrice > minOrder){
            discount = totalPrice * 50 /100;
            if(discount > maxDiscount){
                discount = maxDiscount;
            }
        }
        totalPrice -= discount;
        cashback = totalPrice *10/100; //3000
        if(cashback > 30000){
            cashback = 30000;
        }

        finalSaldo = saldo - totalPrice + cashback;
        System.out.println(cashback);

        System.out.println("jumlah cup: "+item+" sisa saldo: "+finalSaldo);
    }
}
