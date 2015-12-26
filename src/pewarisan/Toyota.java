/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author user
 */
public class Toyota extends Mobil {

public void tampilkan(){
 double besarsilinder;
 String bahanbakar;
 String kategori;

 besarsilinder=32.5;
 bahanbakar="solar";
 kategori="off-road";

 Mobil m = new Mobil();

 m.inputData("AVANZA", "Merah", "Ekonomis", 5);
 m.tampilkandata();

   System.out.println("silinder :"+besarsilinder);
   System.out.println("jenis bahan bakar :"+bahanbakar);
   System.out.println("jenis kategori :"+kategori);
}
    
}
