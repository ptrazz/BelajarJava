import javax.swing.JOptionPane;

public class Belanja {
    public static void main(String[] args) {
        int pengeluaran = 0;
        String input;

        while (true) {
            input = JOptionPane.showInputDialog("Masukkan pengeluaran Anda (atau 0 untuk berhenti):");
            if (input == null) {
                break;
            }

            int jumlahPengeluaran = Integer.parseInt(input);
            if (jumlahPengeluaran == 0) {
                break;
            }
            pengeluaran += jumlahPengeluaran;
            JOptionPane.showMessageDialog(null, "Anda telah menambahkan pengeluaran sebesar: " + jumlahPengeluaran);
        }

        JOptionPane.showMessageDialog(null, "Total pengeluaran Anda hari ini adalah: " + pengeluaran);
    }
}