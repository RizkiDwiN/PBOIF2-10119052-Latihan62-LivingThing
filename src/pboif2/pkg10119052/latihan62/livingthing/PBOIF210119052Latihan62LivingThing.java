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
public class PBOIF210119052Latihan62LivingThing {
 
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
