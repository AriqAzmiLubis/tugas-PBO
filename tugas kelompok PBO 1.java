import java.util.Scanner;

public class kubalok {
    public static void main(String[] args) {
    //sebelumnya mohon maaf bila ada kesalahan

        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do {
            System.out.println("Aplikasi Penghitungan  Luas Permukaan :");

            System.out.println("1. Kubus");
            System.out.println("2. Tabung");

            System.out.println("0. EXIT");
            System.out.println("Masukan Pilihan Anda : ");

            pilihan=masukan.nextInt();
            switch(pilihan){
                case 1 : kubus();break;
                case 2 : tabung();break;

            }
            }while(pilihan !=0);
    }
    

    private static void kubus(){
        Scanner masukan = new Scanner(System.in);
        float sisi , v, pl;
        System.out.print("Masukkan nilai sisi : ");
        sisi = masukan.nextFloat();  
        pl= 6* (sisi*sisi);
        v=sisi*sisi*sisi;
        System.out.println("Luas Permukaan Kubus adalah : "+ pl);
//        System.out.println("Volume Kubus adalah : "+ v);
}
    private static void tabung(){
     Scanner masukan = new Scanner(System.in);
     float jari2, l, t, v, pl;
     System.out.print("Masukkan nilai jari-jari : ");
     jari2 = masukan.nextFloat();     
     System.out.print("Masukkan nilai Tinggi : ");
     t = masukan.nextFloat();
     pl = 2* 3.14f * jari2 * (jari2 + t);
     v= 3.14f * (jari2 * jari2)* t;
     System.out.println("Luas Permukaan Tabung Adalah : " + pl);
//     System.out.println("Volume Tabung Adalah : " + v);
   }

    
}
