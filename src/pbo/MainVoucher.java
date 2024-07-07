package pbo;

import java.util.Scanner;

public class MainVoucher {
    public static void main(String[] args) {
    //errorhandling
    try{   
    //io 
    Scanner scanner = new Scanner(System.in);
    
    //array
    SubVoucher[] vcr = new SubVoucher[2];
    
    //perulangan for biasa
    for(int i=0; i<vcr.length; i++){
        System.out.print("Masukkan Nama Anda Yang Ke "+(i+1)+": ");
        String name =scanner.nextLine();
        System.out.print("Masukkan Kode Voucher Anda (Yang Ke) "+(i+1)+": ");
        String novchr =scanner.nextLine();
    //objek
        
        vcr[i] = new SubVoucher(name, novchr);
    }
    //perulangan for array
    for(SubVoucher data: vcr){
        System.out.println("=======================");
        System.out.println(">>>>Informasi Kartu<<<<");
        System.out.println("=======================");
        System.out.println(data.displayInfo());
    }
        }catch (StringIndexOutOfBoundsException x){
            System.out.println("Kesalahan format voucher: "+x.getMessage());
        }
    }
}