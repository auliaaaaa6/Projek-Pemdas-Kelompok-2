package Projek;

public class Pelanggan {
    private String nama; 
    private String noHp; 
    private String alamat;

public Pelanggan() {
    this.nama = "";
    this.noHp = "";
    this.alamat = "";
}

public Pelanggan(String nama, String noHp, String alamat) {
    this.nama = nama;
    this.noHp = noHp;
    this.alamat = alamat;
}
    
public void infoPelanggan() {
    System.out.println("======Info Pelanggan======");
    System.out.println("Nama         : " + nama);
    System.out.println("Nomor HP     : " + noHp);
    System.out.println("Alamat       : " + alamat);
}

public String getNama() {return nama;}
public void setNama(String s) {nama = s;}

public String getNoHp() {return noHp;}
public void setNoHp(String s) {noHp = s;}

public String getAlamat() {return alamat;}
public void setAlamat(String s) {alamat = s;}

}