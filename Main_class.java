import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_class extends Iuran_Warga {
    public static void main(String[] args) {
        int pilih=0;
        String lanjut;
        Data_Warga data_Warga=new Data_Warga();

        Overloading overloading=new Overloading();
        Overriding overriding=new Overriding();
        List<Integer> result=new ArrayList<Integer>();
        do{
            Scanner sc=new Scanner(System.in);

            if(data_Warga.getNama()!=null){
                System.out.println("Lanjut Bayar Iuran ?");
                lanjut=sc.nextLine();
                if(lanjut.equalsIgnoreCase("ya")){
                    pilih=2;
                }else{
                    pilih=0;
                }
            }else{
                System.out.println("=====================================");
                System.out.println("Pendataan dan Pembayaran Iuran Warga");
                System.out.println("=====================================");
                System.out.println("1. Input Data Warga");
                System.out.println("2. Input Iuran Warga");
                System.out.print("Pilihan Menu : ");
                pilih = sc.nextInt();
            }
            System.out.println("-----------------o0o-----------------");
            if(pilih==1){
                data_Warga = overloading.inputData_Warga();
            }else if(pilih==2){
                overriding.inputDataIuran(data_Warga.getNik());
                result =  overriding.getResult();
            }
        }while (pilih!=0);

        System.out.printf("|| %-28s || %-10s ",
                "NIK",result.get(0));
        System.out.println();
        System.out.printf("|| %-10s || %-5s ",
                "Total Pembayaran Iuran Warga",result.get(1));
        System.out.println();
        System.out.println("Terimakasih "+data_Warga.getNama()+" Iuran Anda Sudah di Bayarkan");

    }
}