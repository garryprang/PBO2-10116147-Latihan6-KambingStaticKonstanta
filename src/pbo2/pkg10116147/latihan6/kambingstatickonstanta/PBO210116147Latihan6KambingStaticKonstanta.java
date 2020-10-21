/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan6.kambingstatickonstanta;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan jumlah kambing (static dan konstanta).
 */

public class PBO210116147Latihan6KambingStaticKonstanta {
public static int jumlahKambing;

//  NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
   
    public static void main(String[] args) {
        PBO210116147Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                          + PBO210116147Latihan6KambingStaticKonstanta.jumlahKambing);
    }
    
}
