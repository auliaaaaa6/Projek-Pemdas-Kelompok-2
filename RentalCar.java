package Projek;

public class RentalCar {
    private String merk;
    private String noPlat;
    private double harga;
    private String penyewa; 
    private int durasiSewa;
    private double totalHarga;

public RentalCar() {
    this.merk = "";
    this.noPlat = "";
    this.harga = 0;
    this.penyewa = "";
    this.durasiSewa = 0;
    this.totalHarga = 0;
}

public RentalCar(String merk, String noPlat, double harga, String penyewa, int durasiSewa, double totalHarga) {
    this.merk = merk;
    this.noPlat = noPlat;
    this.harga = harga;
    this.penyewa = penyewa;
    this.durasiSewa = durasiSewa;
    this.totalHarga = totalHarga;
}

public double hitungTotal() {
    return harga*durasiSewa;
}

public void detailSewa() {
    System.out.println("======Detail Sewa======");
    System.out.println("Merk mobil     : " + merk);
    System.out.println("Plat mobil     : " + noPlat);
    System.out.println("Harga sewa     : " + harga);
    System.out.println("Nama penyewa   : " + penyewa);
    System.out.println("Durasi sewa    : " + durasiSewa);
    System.out.println("Total harga    : " + totalHarga);
}

public String getMerk() {return merk;}
public void setMerk(String s) {merk = s;}

public String getNoPlat() {return noPlat;}
public void setNoPlat(String s) {noPlat = s;}

public double getHarga() {return harga;}
public void setHarga(double s) {harga = s;}

public String getPenyewa() {return penyewa;}
public void setPenyewa(String s) {penyewa = s;}

public int getDurasiSewa() {return durasiSewa;}
public void setDurasiSewa(int s) {durasiSewa = s;}

public double getTotalHarga() {return totalHarga;}
public void setTotalHarga(double s) {totalHarga = s;}
}
