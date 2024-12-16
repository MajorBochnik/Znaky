import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Znaky znaky = new Znaky();
        System.out.println("Jaký úkol byste chtěl vybrat?");
        int n = sc.nextInt();

while(n > 0 && n <=8) {

    switch (n) {
        case 1:
            znaky.vypisAhoj();
            break;
        case 2:
            sc.nextLine();
            String slovicko = sc.nextLine();
            System.out.println(znaky.vypisSlovo(slovicko));
            break;
        case 3:
            znaky.vypisCislo();
            break;
        case 4:
            znaky.nasobPeti();
            break;
        case 5:
            znaky.zjistiPrvocislo();
            break;
        case 6:
            znaky.porovnaniCisel();
            break;
        case 7:
            znaky.zadejJmeno();
            break;
        case 8:
            znaky.intervalN();
            break;
        default:
            System.out.println("NEEEEEEEE!");
            break;
    }
    System.out.println("Jaký úkol byste chtěl vybrat?");
    n = sc.nextInt();
}

    }
}