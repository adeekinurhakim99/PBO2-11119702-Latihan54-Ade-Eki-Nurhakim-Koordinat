/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koordinat;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Koordinat1 k = new Koordinat1();
        k.setX(10);
        k.setY(4);
        
        WarnaKoordinat w = new WarnaKoordinat();
        w.setNamaWarna("Jingga");
        
        System.out.println("Warna Koordinat : "+w.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+k.getX()+", y : "+k.getY());
    }
    
}
