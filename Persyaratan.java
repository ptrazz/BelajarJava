import javax.swing.JOptionPane;

public class Persyaratan {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Masukkan nama lengkap:");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur:"));
        String message = "Hello " + name + ", " + usia(umur);
        JOptionPane.showMessageDialog(null, message);
    }

    static String usia(int umur) {
        if (umur < 17) {
            return "maaf, Anda belum memenuhi kualifikasi";
        } else {
            return "selamat, Anda telah memenuhi kualifikasi";
        }
    }
}