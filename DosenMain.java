import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        DataDosen data = new DataDosen();

       //menu 
       int pilih ;
       do {
        System.out.println("Menu : ");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampil Data Dosen");
        System.out.println("3. Sorting Data Dosen ASC");
        System.out.println("4. Sorting Data Dosen DESC");
        System.out.println("5. Sorting Data Dosen DESC Insertion");
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                data.tambah();
                break;
            case 2:
                data.tampil();
                break;
            case 3:
                data.SortingASC();
                data.tampil();
                break;
            case 4:
                data.SortingDSC();
                data.tampil();
                break;
            case 5:
                data.SortingDSCInsertion();
                data.tampil();
                break;
            case 6:
                System.out.println("Terima kasih");
                break;
            default:
            System.out.println("pilihan tidak ada");
                break;
        }

       }while (pilih != 6); 
    }
}
