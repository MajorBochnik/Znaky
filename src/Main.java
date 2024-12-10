import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Znaky znaky = new Znaky();
/*1.*/
znaky.vypisAhoj();

/*2*/
String slovicko = sc.nextLine();
System.out.println(znaky.vypisSlovo(slovicko));

/*3*/
znaky.vypisCislo();

/*4*/
znaky.nasobPeti();

/*5*/
znaky.zjistiPrvocislo();

/*6*/
znaky.porovnaniCisel();

/*7*/
znaky.zadejJmeno();

/*8*/
znaky.intervalN();

/*9*/

/*10*/
    }
}