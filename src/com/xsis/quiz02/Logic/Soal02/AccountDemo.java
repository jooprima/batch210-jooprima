package com.xsis.quiz02.Logic.Soal02;

import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {
        //membuat objek klass baru
        Account acc = new Account(12345,1000000);
        Account acc2 = new Account(12346,1500000);
        Account acc3 = new Account(12347,2500000);
        Account acc4 = new Account(12348,2550000);

        //membuat objek class menjadi array
        Account[] listAccount = {acc,acc2,acc3,acc4};

        Scanner inputUser = new Scanner(System.in);

//        System.out.print("Enter command (1=Debet,2=Transfer,0=Exit) : ");
//        int command = inputUser.nextInt();

        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Menu Utama ATM\n");
            System.out.println("1.\tDebet / Tarik Tunai");
            System.out.println("2.\tTrandfer");
            System.out.println("3.\tExit");

            System.out.print("\nPilihan anda : ");
            int command = inputUser.nextInt();

            switch (command) {
                case 1:
                    getDebet(acc);
                    break;
                case 2:
                    showAccount(listAccount);

                    System.out.println("Masukan pilihan : ");
                    int pilihAcc = inputUser.nextInt();

                    Account accountReceive = getAccount(listAccount,pilihAcc);

                    getTransfer(acc,accountReceive);

                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan \nsilahkan input 1/2/0");
            }
            isContinue = getYesOrNo("Apakah anda ingin melanjutkan ? ");
        }


    }


    private static boolean getYesOrNo(String message) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n) ? ");
        String pilihanUser = inputUser.next();
        
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n !!!");
            System.out.print("\n"+message+" (y/n) ? ");
            pilihanUser = inputUser.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void getDebet(Account account) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("\nPenarikan Uang Tunai : ");
        int tarikTunai = inputUser.nextInt();
        System.out.println("==============================");

        double sisa = account.getSaldo() - tarikTunai;

        System.out.println("Current Saldo \t: Rp. " + account.getSaldo());
        System.out.println("Tarik Tunai \t: Rp. " + tarikTunai );
        System.out.println("Sisa \t\t\t: Rp. " + sisa);

        account.setSaldo(sisa);
    }

    private static void showAccount(Account[] listAccount){
        for (int i = 0; i < listAccount.length; i++) {
            System.out.println("no rekening yg dipilih : " + listAccount[i].getNoRek());
            System.out.println("Saldo Account = Rp. " + listAccount[i].getSaldo());
        }
    }

    static Account getAccount(Account[] listaccount, int noRek){
        Account account = null;
        for (int i = 0; i < listaccount.length; i++) {
            if (noRek == listaccount[i].getNoRek()){
                account = listaccount[i];
            }
        }
        return account;
    }

    private static void getTransfer(Account account,Account account2) {
        Scanner inputuser = new Scanner(System.in);

        System.out.println("Transfer");
        double transfer = inputuser.nextDouble();

        System.out.println("Current Saldo : Rp. " + account.getSaldo());
        System.out.printf("Trandfer : %.2f  %.2f ", transfer, account.getSaldo());

        if (transfer > account.getSaldo()){
            System.out.println("Maaf Saldo anda tidak mencukupi....!!!");
        }else {
            double sisaSaldo = account.getSaldo() - transfer;
            System.out.println("Sisa saldo : Rp. " + sisaSaldo);
            account.setSaldo(sisaSaldo);
            System.out.println("Saldo awal penerima : Rp. " + account2.getSaldo());

            account2.setSaldo(account2.getSaldo() + transfer);
            System.out.println("Saldo penerima : Rp. " + account2.getSaldo());
        }
    }

    private static void exit() {
        System.exit(0);
    }

}
