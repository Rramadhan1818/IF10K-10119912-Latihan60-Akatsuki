/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public class IF10K10119912Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemimpinAkatsuki pa = new PemimpinAkatsuki("Pain", "konoha", "pain");
        pa.setPemimpin("Pemimpin");
        pa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + pa.getPemimpin());
        
        System.out.println("");
    
        AnggotaAkatsuki aa = new AnggotaAkatsuki("Uchiha", "konoha", "zabuza");
        aa.setAnggota("Anggota");
        aa.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + aa.getAnggota());
        System.out.println("");
    }
    
}
