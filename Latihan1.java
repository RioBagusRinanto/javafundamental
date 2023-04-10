import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan1 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        init();
    }

    private static void init() throws IOException{
        System.out.println("--- kalkulator ---");
        System.out.println("Menu");
        System.out.println("1. Luas Bidang");
        System.out.println("2. Hitung Volume");
        System.out.println("0. Exit");
        String choice = reader.readLine();

        switch (choice) {
            case "1":
                luas();
                break;
            case "2":
                volume();
                break;
            case "0":
                break;
            default:
                init();
                break;
        }

    }

    private static void luas() throws IOException{
        System.out.println("-- pilih bidang yang di hitung --");
        System.out.println("1. persegi");
        System.out.println("2. lingkaran");
        System.out.println("3. segitiga");
        System.out.println("4. persegi panjang");
        System.out.println("0. kembali ke menu sebelumnya");
        String choice = reader.readLine();

        switch (choice) {
            case "1":
                System.out.println("-- masukkan nilai sisi --");
                String sisi = reader.readLine();
                int luas = Integer.parseInt(sisi)*Integer.parseInt(sisi);
                System.out.println("Luas perseginya adalah : ");
                System.out.println(luas);
                break;
            case "0":
                init();
                break;
            case "2":
                System.out.println("-- masukkan nilai jari-jari --");
                String jari = reader.readLine();
                double luasL = 3.14 * Double.parseDouble(jari);
                System.out.println("Luas lingkarannya adalah : ");
                System.out.println(luasL);
                break;
            case "3":
                System.out.println("-- masukkan nilai alas --");
                String alas = reader.readLine();
                System.out.println("-- masukkan nilai tinggi --");
                String tinggi = reader.readLine();
                int luasS = (Integer.parseInt(alas) * Integer.parseInt(tinggi)) / 2;
                System.out.println("Luas segitiganya adalah : ");
                System.out.println(luasS);
                break;
            case "4":
                System.out.println("-- masukkan nilai panjang --");
                String panjang = reader.readLine();
                System.out.println("-- masukkan nilai lebar --");
                String lebar = reader.readLine();
                int luasP = Integer.parseInt(panjang) * Integer.parseInt(lebar);
                System.out.println("Luas persegi panjang adalah :");
                System.out.println(luasP);
                break;
            default:
                luas();
                break;
        }
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        reader.readLine();
        init();
        
    }

    private static void volume() throws IOException{
        System.out.println("-- pilih bidang yang akan dihitung --");
        System.out.println("1. kubus");
        System.out.println("2. balok");
        System.out.println("3. tabung");
        System.out.println("0. kembali ke menu utama");
        String choice = reader.readLine();
        switch (choice) {
            case "1":
                System.out.println("-- masukkan nilai sisi --");
                String sisi = reader.readLine();
                int volumK = Integer.parseInt(sisi) * Integer.parseInt(sisi) * Integer.parseInt(sisi);
                System.out.println("Volume kubus : " + volumK);
                break;
            case "2":
                System.out.println("-- masukkan nilai panjang --");
                String panjang = reader.readLine();
                System.out.println("-- masukkan nilai lebar --");
                String lebar = reader.readLine();
                System.out.println("-- masukkan nilai tinggi --");
                String tinggi = reader.readLine();
                int volumB = Integer.parseInt(panjang) * Integer.parseInt(lebar) * Integer.parseInt(tinggi);
                System.out.println("Volume Balok : " + volumB);
                break;
            case "3":
                System.out.println("-- masukkan nilai jari-jari --");
                String jari = reader.readLine();
                System.out.println("-- masukkan nilai tinggi --");
                String tinggiT = reader.readLine();
                double volumT = (3.14 * Double.parseDouble(tinggiT)) * Double.parseDouble(jari);
                System.out.println("Volume Tabung : "+ volumT);
                break;
            default:
                init();
                break;
        }
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        reader.readLine();
        init();
    }
}