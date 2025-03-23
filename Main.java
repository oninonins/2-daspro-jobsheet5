import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi05 mhs = new MahasiswaBerprestasi05();
        
        System.out.println("==== Input Data Mahasiswa ====");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            Mahasiswa05 m = new Mahasiswa05();
            m.inputData();
            mhs.tambah(m);
        }
        
        System.out.println("Data Mahasiswa Sebelum Sorting");
        mhs.tampil();
        
        System.out.println("Data Mahasiswa Setelah Sorting by IPK");
        mhs.insertionSort();
        mhs.tampil();

        
        
    }
}