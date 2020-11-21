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
public abstract class LivingThing {

    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
