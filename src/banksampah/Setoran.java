
package banksampah;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Setoran {
     
    //Variabel
    private int kelas;
    private double hasil,berat,bayar,kembalian;
    private String nama;
    String no, No;
    Scanner gg = new Scanner (System.in);
    
    //Menu Opsi Sampah
    void menu(){
        
        System.out.println("\nMENU");
        String[]menu ={"Setor Sampah","Beli Sampah"};
        for(int i = 0; i < menu.length; i++){
        System.out.println((i+1)+". " + menu[i]+"");} 
    }
    
    //method void untuk menginputkan pilihan menu
    void inputmenu (){    
        
        //scanner input untuk memasukkan input dari user
         Scanner input = new Scanner (System.in);
         System.out.print("pilih : ");
         no = input.next();
         System.out.println("");
    }
    
    //Pilihan Sampah
    void Jenis(){
        
        System.out.println("\nJENIS SAMPAH");
        String[] jenis = {"Organik","An Organik"};
        for(int i = 0; i<jenis.length; i++){
        System.out.println((i+1)+". " + jenis[i]+"");
        }
    }
    
    //method void untuk menginputkan pilihan jenis sampah
    void inputjenis (){    
        
         //scanner input untuk memasukkan input dari user
         Scanner input = new Scanner (System.in);
         System.out.print("pilih : ");
         No = input.next();
         System.out.println("");
    }    
    
    //Input Nama dan Kelas
    public void Penyetor(){
        
        System.out.print("Nama  :");
        nama = gg.nextLine();
        System.out.print("Kelas :X RPL  ");
        kelas = gg.nextInt();
    }
    
    //Mengembalikan Variabel(2)
    public String setNama(){
        return nama;
    }
    public int setKelas(){
        return kelas;
    }
        
    //Percabangan
    public void percabangan(){
         if (no.equalsIgnoreCase("1")){
            
             if (No.equalsIgnoreCase("1")){
                 
                System.out.println("NB :Harga setor sampah Organik per gram Rp.1 ");
                System.out.print("Berat Sampah(gram) : ");
                berat = gg.nextDouble();
                hasil = (int) (berat * 1);
                System.out.println("Harga : "+"RP."+hasil);
                
                
            }else if(No.equalsIgnoreCase("2")){
                
                System.out.println("NB :Harga setor sampah Anorganik per gram Rp.10");
                System.out.print("Berat Sampah(gram): ");
                berat = gg.nextDouble();
                hasil = (int) (berat * 10);
                System.out.println("Harga : "+"RP."+hasil);
                
            }
        
        }else if (no.equalsIgnoreCase("2")){
                
            if (No.equalsIgnoreCase("1")){
                
                System.out.println("NB : Beli Sampah Organik per gram Rp.100");
                System.out.print("Berat Sampah(gram): ");
                berat = gg.nextDouble();
                hasil = (int) (berat * 100);
                System.out.println("Harga : "+"RP."+hasil);
                System.out.print("Bayar : ");
                bayar = gg.nextDouble();
                
                if (hasil <= bayar){
                    kembalian = bayar - hasil;
                    System.out.println("Kembalian : "+kembalian);
                    
                }else if (hasil > bayar){
                    System.out.println("Uang Anda Tidak Mencukupi");
                }
                
            }else if(No.equalsIgnoreCase("2")){
            
                System.out.println("NB : Beli Sampah Anorganik per gram Rp.200");
                System.out.print("Berat Sampah(gram): ");
                berat = gg.nextDouble();
                hasil = (int) (berat * 200);
                System.out.println("Harga : "+"RP."+hasil);
                System.out.print("Bayar : ");
                bayar = gg.nextDouble();
                
                if (hasil <= bayar){
                    kembalian = bayar - hasil;
                    System.out.println("Kembalian : "+kembalian);
                    
                }else if (hasil > bayar){
                    System.out.println("Uang Anda Tidak Mencukupi");
                }
            }
        }
    }
    
    //Mengembalikan nilai Hasil,Bayar dan Kembalian
    public double setHasil(){
        return hasil;
    }
    public double setBayar(){
        return bayar;
    }
    public double setKembalian(){
        return kembalian;
    }
    
    //Tabungan
    public void tabungan(){
        
        System.out.println("\n    BUKU TABUNGAN SAMPAH X RPL "+kelas   );
        System.out.println("===================================");
        System.out.println("Nama            = "+nama);
        System.out.println("Kelas           = X RPL "+kelas);
        System.out.println("Berat Sampah    = "+ berat+" gram");
        System.out.println("Harga           = RP. "+hasil);
        System.out.println("");
     
        
    }
}
 
