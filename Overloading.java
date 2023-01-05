import java.util.Scanner;

public class Overloading {

    public Data_Warga inputData_Warga(){
        Data_Warga data_Warga=new Data_Warga();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("*** Data Warga ***");
        System.out.println("Masukan Nama");
        data_Warga.setNama(sc.nextLine());
        System.out.println("Masukan NIK");
        data_Warga.setNik(sc.nextLine());
        System.out.println("Masukan Alamat");
        data_Warga.setAlamat_rmh(sc.nextLine());
        System.out.println("Masukan No. Tlp");
        data_Warga.setNo_tlp(sc.nextLine());
        
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Pekerjaan ***");
        System.out.println("Masukan Pekerjaan");
        data_Warga.setJenis_pekerjaan(sc.nextLine());
        System.out.println("Masukan Alamat Kantor");
        data_Warga.setAlamat_kantor(sc.nextLine());
        
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Status ***");
        System.out.println("Masukan Status ");
        data_Warga.setStatus(sc.nextLine());
        System.out.println("Masukan Nama Suami/Istri");
        data_Warga.setNama_pasangan(sc.nextLine());
        System.out.println("Masukan Jumlah Anak");
        data_Warga.setJml_anak(sc.nextInt());

        return data_Warga;
    }

}