/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang waktu saat ini.
 */
public class PBO210117070Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar cd = Calendar.getInstance();
        
        SimpleDataFormat tgl = new SimpleDataFormat("EEEE,d MMMM YYYY, "
                +"hh:mm:ss");
        
        String kalendar = tgl.format(cd.getTime());
        System.out.println("Hari ini adalah Hari\t: "+ kalendar);
    }
    
}
