
package banksampah;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Mainclass {

  
    public static void main(String[] args) {
        
       //Awalan program dijalakan
        System.out.println("SELAMAT DATANG DI BANK SAMPAH KELAS X JURUSAN RPL");
        System.out.println("                SMK TELKOM MALANG               ");
        System.out.println("--------------------------------------------------");
        System.out.println("Jadwal BUKA Bank Sampah!");
        
        //percabangan buka tutup bank sampah
        String hari,jawab;
        Scanner input = new Scanner(System.in);
        
        //object
        Setoran S = new Setoran();
        
        
        String[]buka ={"Senin","Selasa","Rabu","Kamis","Jumat"};
        for(int i = 0; i < buka.length; i++){
        System.out.println((i+1)+". " + buka[i]+"");}
        System.out.print("Masukkan hari : ");
        jawab = input.nextLine();
        
        //percabangan buka tutup toko
        switch (jawab){
            
            case "Senin" :
      
        S.menu();
        S.inputmenu();
        S.Penyetor();
        S.Jenis();
        S.inputjenis();
        S.percabangan();
        S.tabungan();
        
    System.out.println("Penanggung Jawab");
    System.out.println(S.setNama());
    System.out.print("X RPL ");System.out.println(S.setKelas());
                break;
                
            case "Selasa" :
        
        S.menu();
        S.inputmenu();
        S.Penyetor();
        S.Jenis();
        S.inputjenis();
        S.percabangan();
        S.tabungan();
        
    System.out.println("Penanggung Jawab");
    System.out.println(S.setNama());
    System.out.print("X RPL ");System.out.println(S.setKelas());
                break;
                
                case "Rabu" :
       
        S.menu();
        S.inputmenu();
        S.Penyetor();
        S.Jenis();
        S.inputjenis();
        S.percabangan();
        S.tabungan();
        
    System.out.println("Penanggung Jawab");
    System.out.println(S.setNama());
    System.out.print("X RPL ");System.out.println(S.setKelas());
                break;
                
                case "Kamis" :
       
        S.menu();
        S.inputmenu();
        S.Penyetor();
        S.Jenis();
        S.inputjenis();
        S.percabangan();
        S.tabungan();
    
    System.out.println("Penanggung Jawab");
    System.out.println(S.setNama());
    System.out.print("X RPL ");System.out.println(S.setKelas());
                break;
                
                case "Jumat" :
                    
        S.menu();
        S.inputmenu();
        S.Penyetor();
        S.Jenis();
        S.inputjenis();
        S.percabangan();
        S.tabungan();
        
    System.out.println("Penanggung Jawab");
    System.out.println(S.setNama());
    System.out.print("X RPL ");System.out.println(S.setKelas());
                break;
                
                default :
        System.out.println("Mohon Maaf Bank Sampah tutup,silahkan berkunjung lain hari!");
                break;
        }
        
    
    System.out.println("-----------------------");
    System.out.println("TERIMA KASIH");
    }
     
        }

