import java.util.Scanner;

public class Znaky {
    static Scanner sc = new Scanner(System.in);

/*1*/
    public void vypisAhoj(){
        for(int i =1; i<=30; i++){
            System.out.println(i+" Ahoj svete.");
        }
    }
/*2*/
    public String vypisSlovo(String slovo){
        return slovo;
    }
/*3*/
    public void vypisCislo(){
        int cislo = sc.nextInt();

        switch(cislo){
            case 0:
                System.out.println("Nula");
                break;
            case 1:
                System.out.println("Jedna");
                break;
            case 2:
                System.out.println("Dva");
                break;
            case 3:
                System.out.println("Tři");
                break;
            case 4:
                System.out.println("Čtyři");
                break;
            case 5:
                System.out.println("Pět");
                break;
            case 6:
                System.out.println("Šest");
                break;
            case 7:
                System.out.println("Sedm");
                break;
            case 8:
                System.out.println("Osm");
                break;
            case 9:
                System.out.println("Devět");
                break;
            case 10:
                System.out.println("Deset");
                break;
            case 11:
                System.out.println("Jedenáct");
                break;
            case 12:
                System.out.println("Dvanáct");
                break;
            default:
                if(cislo < 0){
                    System.out.println("Záporné číslo");
                }
                else {
                    System.out.println("Moc velké číslo");
                }
        }
    }

/*4*/
    public void nasobPeti(){
        for(int i = 1; i<=20; i++){
            System.out.println(5*i);
        }
    }

/*5*/
    public void zjistiPrvocislo(){
        int cislo = sc.nextInt();
        int pocetdelitelu=0;
        for(int i =1; i<=cislo; i++){
            if(cislo%i==0){
                pocetdelitelu++;
            }
        }
        if(pocetdelitelu==2){
            System.out.println("Je prvočíslo.");
        }
        else {
            System.out.println("Není prvočíslo.");
        }
    }

/*6*/
    public void porovnaniCisel(){
        System.out.println("Zadej 1. cislo:");
        int cislo1 = sc.nextInt();
        System.out.println("Zadej 2. cislo:");
        int cislo2 = sc.nextInt();
        System.out.println("Zadej 3. cislo:");
        int cislo3 = sc.nextInt();
        int max=0;
        int min=0;

        if(cislo1 > cislo2 && cislo1 > cislo3){
            max = cislo1;
            if(cislo2 > cislo3){
                min = cislo3;
            }
            else {
                min = cislo2;
            }
        }
        else if (cislo2 > cislo1 && cislo2 > cislo3) {
            max = cislo2;
            if(cislo1 > cislo3){
                min = cislo3;
            }
            else {
                min = cislo1;
            }
        }
        else if (cislo3 > cislo1 && cislo3 > cislo2) {
            max = cislo3;
            if(cislo1 > cislo2){
                min = cislo2;
            }
            else {
                min = cislo1;
            }
        }
        System.out.println("Největší je: "+max);
        System.out.println("Nejmenší je: "+min);
        System.out.println(max%min);

    }

/*7*/
    public void zadejJmeno(){
        System.out.println("Zadej jméno:");
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení:");
        String prijmeni = sc.nextLine();

        System.out.println("Tvé jméno je "+jmeno+" "+prijmeni);
    }

/*8*/
    public void intervalN(){
        int n = sc.nextInt();
        sc.nextLine();
        while (n<0){
            System.out.println("Nuh uh, zadej kladné!");
            n = sc.nextInt();
            sc.nextLine();
        }
        for(int i = n; i>=0; i--){
            System.out.println(i);
        }
    }

}

