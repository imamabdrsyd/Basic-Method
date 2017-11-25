public class Penjumlahan {

	public static void main(String[] args){
        int i, jumlah;                      //deklarasi variabel
        jumlah = 0;                         //memberi nilai default var jumlah
        
        for(i = 1; i <= 10; i += 1)         //perintah looping/perulangannya. i += 1 adalah rumus untuk menambahkan 1 
        {
            jumlah = jumlah + i;
               System.out.println(i+" ");  //cetak hasil looping dgn tampilan kesamping    
        }
        
            System.out.println();           //enter
            System.out.println("Total jumlah: " + jumlah); //cetak total penjumlahan
     
        }
}