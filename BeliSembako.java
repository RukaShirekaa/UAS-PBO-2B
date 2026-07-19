import java.util.Scanner;

public class BeliSembako {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lanjut;

        double hargaBeras = 25000.0;
        double hargaMinyak = 15000.0;
        double hargaGula = 10000.0;

        System.out.println("==================================================");
        System.out.println("         PROGRAM KASIR SEMBAKO UJANG              ");
        System.out.println("==================================================");

        do {
            System.out.print("Masukkan jumlah uang yang dibawa Ujang: ");
            long uangUjang = input.nextLong();

            System.out.print("Masukkan jumlah kilogram beras yang ingin dibeli: ");
            int jumlahBeras = input.nextInt();

            System.out.print("Masukkan jumlah botol minyak goreng yang ingin dibeli: ");
            int jumlahMinyak = input.nextInt();

            System.out.print("Masukkan jumlah kilogram gula yang ingin dibeli: ");
            int jumlahGula = input.nextInt();

            // Validasi input negatif
            if (uangUjang < 0 || jumlahBeras < 0 || jumlahMinyak < 0 || jumlahGula < 0) {
                System.out.println("\n[!] ERROR: Uang atau jumlah barang tidak boleh bernilai negatif. Silakan ulangi.\n");
            } else {
                // Perhitungan total harga
                double totalHarga = (jumlahBeras * hargaBeras) + (jumlahMinyak * hargaMinyak) + (jumlahGula * hargaGula);

                // Jika uang kurang
                if (uangUjang < totalHarga) {
                    long kekurangan = (long) (totalHarga - uangUjang);
                    System.out.println("\n[!] Maaf, uang Anda tidak cukup.");
                    System.out.println("Total harga pembelian : Rp " + totalHarga);
                    System.out.println("Anda kekurangan uang  : Rp " + kekurangan);

                    // Meminta tambahan uang
                    System.out.print("\nMasukkan tambahan uang (ketik 0 jika ingin batal belanja): ");
                    long tambahanUang = input.nextLong();
                    
                    if (tambahanUang > 0) {
                        uangUjang += tambahanUang; 
                        
                        // Mengecek ulang apakah uang sekarang sudah cukup
                        if (uangUjang >= totalHarga) {
                            long kembalian = (long) (uangUjang - totalHarga);
                            System.out.println("\n[+] Pembayaran berhasil!");
                            System.out.println("Total harga pembelian: Rp " + totalHarga);
                            System.out.println("Kembalian yang diterima Ujang: Rp " + kembalian + "\n");
                        } else {
                            System.out.println("\n[-] Uang tambahan masih belum cukup. Transaksi dibatalkan.\n");
                        }
                    } else {
                        System.out.println("\n[-] Transaksi dibatalkan oleh pengguna.\n");
                    }
                    
                // Jika uang sudah cukup dari awal
                } else {
                    long kembalian = (long) (uangUjang - totalHarga);
                    System.out.println("\n[+] Pembayaran berhasil!");
                    System.out.println("Total harga pembelian: Rp " + totalHarga);
                    System.out.println("Kembalian yang diterima Ujang: Rp " + kembalian + "\n");
                }
            }

    
            System.out.print("Apakah ingin memproses pelanggan lain? (y/n): ");
            lanjut = input.next().charAt(0);
            

            input.nextLine();
            
            System.out.println("--------------------------------------------------");

        } while (Character.toLowerCase(lanjut) == 'y');

        input.close();
        System.out.println("Program selesai. Terima kasih!");
    }
}