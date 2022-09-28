package bootcamp2;

public class methods {

    public static void main(String[] args) {
    sayiBulmaca();



    }


    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if(sayi==aranacak) {
                varMi=true;
                break;
            }
        }
        String mesaj = " ";
        if(varMi)
            System.out.println("Sayı Mevcuttur");
        else
            System.out.println("Sayı Mevcut değildir");





    }

    public static void mesajver(String mesaj) {
        System.out.println(mesaj);
    }


}
