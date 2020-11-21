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
public class AnggotaAkatsuki extends ClanAkatsuki{
    private String anggota;
    
    public AnggotaAkatsuki(String nama, String clan, String pasangan) {
        super(nama, clan, pasangan);
        this.nama=nama;
        this.clan=clan;
        this.pasangan=pasangan;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
    
}
