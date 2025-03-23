import java.util.Scanner;
public class Mahasiswa05 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default 
    Mahasiswa05(){

    }

    //konstruktor berparameter
    Mahasiswa05 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    //tambah data input 
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();
        System.out.print("Masukkan IPK : ");
        ipk = input.nextDouble();
        System.out.println("-----------------------------");
    }

    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }


}
