package pboif2.pkg10119052.latihan62.livingthing;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program living thing dengan metode pendekatan
 * 
 */
 
public class Human extends LivingThing{
    private String nama;
    
    public String getNama(){
      return nama;  
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama){
        System.out.println(nama+" Sedang Berjalan");
    }  
}