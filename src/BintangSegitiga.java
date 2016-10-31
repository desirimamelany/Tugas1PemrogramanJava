import java.util.Scanner;

class BintangSegitiga {
    public static void main(String[] args) {
        int i, j;
        int panjang;
        Scanner input = new Scanner(System.in);
        System.out.printf("Jumlah Karakter/Tinggi Segitiga : ");
        panjang = input.nextInt();
        System.out.print("-----------------------------------");

        // Segitiga siku kiri atas      
        for(i=0;i<=panjang;i++) {
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        
        // Segitiga siku kiri bawah
        for(i=0;i<panjang;i++) {
            for(j=i;j<panjang;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        
        // Segitiga siku kanan atas
        for(i=0; i<=panjang; i++) {
            for(j=0; j<(panjang-i); j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // Segitiga siku kanan bawah
        for(i=0; i<panjang; i++) {
            for(int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for(j=0; j<(panjang-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}