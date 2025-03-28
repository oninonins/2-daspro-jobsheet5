import java.util.Scanner;
public class DataDosen {
    Scanner input = new Scanner(System.in);
    Dosen[] dosen = new Dosen[10];
    int idx = 0; 

    // Tambah data dosen
    void tambah() { 
        if (idx < dosen.length) {
            System.out.print("Masukkan Kode Dosen : ");
            String kd = input.next();
            System.out.print("Masukkan Nama Dosen : ");
            String name = input.next();
            System.out.print("Masukkan Jenis Kelamin Dosen (true/false) : ");
            boolean jk = input.nextBoolean();
            System.out.print("Masukkan Usia Dosen : ");
            int age = input.nextInt();


            dosen[idx] = new Dosen(kd, name, jk, age);
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // Tampil data
    void tampil() {
        for (Dosen m : dosen) {
            if (m != null) {
                m.tampil();
            }
        }
    }
    

    // Bubble Sort ASC \
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 1; j < idx - i; j++) { 
                if (dosen[j].usia < dosen[j - 1].usia) {
                    Dosen temp = dosen[j];
                    dosen[j] = dosen[j - 1];
                    dosen[j - 1] = temp;
                }
            }
        }
    }
    

    // Selection Sort DESC \
    void SortingDSC() {
        for (int i = 0; i < idx; i++) {
            int idxmax = i;
            for (int j = i + 1; j < idx; j++) { 
                if (dosen[j].usia > dosen[idxmax].usia) {
                    idxmax = j;
                }
            }
            Dosen temp = dosen[idxmax];
            dosen[idxmax] = dosen[i];
            dosen[i] = temp;
        }
    }
    

    // Insertion Sort DESC 
    void SortingDSCInsertion() {
        for (int i = 1; i < idx; i++) { 
            Dosen temp = dosen[i];
            int j = i;
            while (j > 0 && dosen[j - 1].usia < temp.usia) {
                dosen[j] = dosen[j - 1];
                j--;
            }
            dosen[j] = temp;
        }
    }
}
