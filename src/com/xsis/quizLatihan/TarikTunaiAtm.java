package com.xsis.quizLatihan;

import java.util.Scanner;


public class TarikTunaiAtm {
    private int noRek;
    private int saldo;

    public TarikTunaiAtm(int noRek, int saldo) {
        this.noRek = noRek;
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        TarikTunaiAtm acc1 = new TarikTunaiAtm(12345,1000000);
        TarikTunaiAtm acc2 = new TarikTunaiAtm(12346,1500000);
        TarikTunaiAtm acc3 = new TarikTunaiAtm(12347,2000000);
        TarikTunaiAtm acc4 = new TarikTunaiAtm(12348,1500000);

        TarikTunaiAtm[] listAccount = {acc1,acc2,acc3,acc4};

        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        while (loop){
            System.out.println("-------------Menu Utama ATM-------------");
            System.out.println("1.\tTarik Tunai");
            System.out.println("2.\tTransfer");
            System.out.println("3.\tExit\n");
            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();

            switch (menu){
                case 1 :
                    getTarikTunai(acc1);
                    break;
                case 2 :
                    showAccount(listAccount);

                    System.out.print("Masukan nomor rekennig tujuan : ");
                    int pilihAcc = sc.nextInt();

                    int accountReceive =  getAccount(listAccount,pilihAcc);

                    getTransfer(acc1,accountReceive);

                    break;
                case 3 :
                    System.exit(0);
                    break;
                default:
                    System.err.println("silahkan pilih 1 -3 !!!");
            }
            loop = getContinue("Apakah anda ingin melanjutkan ?");
        }

    }

    private static void getTransfer(TarikTunaiAtm acc1, int accountReceive) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Transfer-------------");
        System.out.print("Jumlah Transfer : ");
        int transfer = sc.nextInt();

        System.out.println("Saldo : "+acc1.saldo);
        System.out.println("Transfer ke rekening : "+accountReceive);

        if (transfer > acc1.saldo){
            System.out.println("Maaf saldo anda tidak mencukupi....!!!");
        }else {
            int sisaSaldo = acc1.saldo - transfer;
            System.out.println("Sisa saldo saat ini : "+sisaSaldo);
        }
    }

    private static int getAccount(TarikTunaiAtm[] listAccount, int pilihAcc) {
        int account = 0;

        for (int i = 0; i < listAccount.length; i++) {
            if (pilihAcc == listAccount[i].noRek){
                account = listAccount[i].noRek;
            }
        }
        if (pilihAcc != account){
            System.out.println("Maaf rekening tujuan tidak tersedia!");
        }

        return account;
    }

    private static void showAccount(TarikTunaiAtm[] listAccount) {
        System.out.println("-------------Pilih rekening penerima-------------");
        for (int i = 0; i < listAccount.length; i++) {
            System.out.println("Nomor Rekening  : "+listAccount[i].noRek);
            System.out.println("Saldo           : "+listAccount[i].saldo+"\n");
        }
    }

    private static boolean getContinue(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n"+message+" (y/n) : ");
        String choose = sc.next();

        while (!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")){
            System.err.println("Silahkan pilih y atau n");
            System.out.print("\n"+message+" (y/n) : ");
            choose = sc.next();
        }
        return choose.equalsIgnoreCase("y");
    }

    private static void getTarikTunai(TarikTunaiAtm acc1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Tarik Tunai-------------");
        System.out.print("Penarikan uang tunai : ");
        int tunai = sc.nextInt();
        System.out.println("Nomor Rekening  : " + acc1.noRek);
        System.out.println("Saldo saat ini  : " + acc1.saldo);
        System.out.println("Tarik Tunai     : "+tunai);

        if (tunai%50000!=0){
            System.out.println("\nMaaf penarikan kelipatan nominal Rp.50.000");
        }else if (tunai > acc1.saldo){
            System.out.println("\nMaaf saldo anda tidak cukup...!!!");
        }else{
            int sisaSaldo = acc1.saldo - tunai;
            System.out.println("Sisa Saldo      : "+sisaSaldo);
        }

    }
}
