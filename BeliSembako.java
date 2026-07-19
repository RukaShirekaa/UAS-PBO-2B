import java.util.Scanner;

public class BeliSembako {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lanjut;

        do {
            double hargaBeras = 25000.0;
            double hargaMinyak = 15000.0;
            double hargaGula = 10000.0;

            System.out.print("Masukkan jumlah uang yang dibawa Ujang: ");
            long uangUjang = input.nextLong();

            System.out.print("Masukkan jumlah kilogram beras yang ingin dibeli: ");
            int jumlahBeras = input.nextInt();

            System.out.print("Masukkan jumlah botol minyak goreng yang ingin dibeli: ");
            int jumlahMinyak = input.nextInt();

            System.out.print("Masukkan jumlah kilogram gula yang ingin dibeli: ");
            int jumlahGula = input.nextInt();

            double totalHarga = (jumlahBeras * hargaBeras) + (jumlahMinyak * hargaMinyak) + (jumlahGula * hargaGula);
            long kembalian = (long) (uangUjang - totalHarga);

            System.out.println("Total harga pembelian: Rp " + totalHarga);
            System.out.println("Kembalian yang diterima Ujang: Rp " + kembalian);

            System.out.print("Apakah ingin melanjutkan program? (y/n): ");
            lanjut = input.next().charAt(0);
        } while (Character.toLowerCase(lanjut) == 'y');

        input.close();
    }
}