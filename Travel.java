package Projek;
import java.util.Scanner;

public class Travel {
    private String mobil; 
    private int kapasitas; 
    private String rute; 
    private String tanggal; 
    private int jumlahSeat;

public Travel() {
    this.mobil = "";
    this.kapasitas = 0;
    this.rute = "";
    this.tanggal = "";
    this.jumlahSeat = 0;
}

public Travel(String mobil, int kapasitas, String rute, String tanggal, int jumlahSeat) {
    this.mobil = mobil;
    this.kapasitas = kapasitas;
    this.rute = rute;
    this.tanggal = tanggal;
    this.jumlahSeat = jumlahSeat;
}

public void pesanTravel() {
    Scanner input = new Scanner(System.in); 

    System.out.print("Masukkan nama mobil : ");
    this.mobil = input.nextLine(); 

    System.out.print("Masukkan kapasitas mobil : ");
    this.kapasitas = input.nextInt();
    input.nextLine();

    System.out.print("Masukkan rute perjalanan : ");
    this.rute = input.nextLine();

    System.out.print("Masukkan tanggal keberangkatan : ");
    this.tanggal = input.nextLine();

    System.out.print("Masukkan jumlah seat mobil : ");
    this.jumlahSeat = input.nextInt();
    detailTravel();

}

public void detailTravel() {
    System.out.println("====Detail Travel====");
    System.out.println("Mobil : " + mobil);
    System.out.println("Kapasitas : " + kapasitas);
    System.out.println("Rute : " + rute);
    System.out.println("Tanggal : " + tanggal);
    System.out.println("Jumlah seat : " + jumlahSeat);
}

public String getMobil() {return mobil;}
public void setMobil(String s) {mobil = s;}

public int getKapasistas() {return kapasitas;}
public void setKapasitas(int s) {kapasitas = s;}

public String getRute() {return rute;}
public void setRute(String s) {rute = s;}

public String getTanggal() {return tanggal;}
public void setTanggal(String s) {tanggal = s;}

public int getJumlahSeat() {return jumlahSeat;}
public void setJumlahSeat(int s) {jumlahSeat = s;}
    
}
