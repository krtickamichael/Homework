import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            cena = cena.add(new BigDecimal("0.1"));
        }
        System.out.println(cena);
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void variables() {
        String name = "Pepa";
        String surname = "Novak";
        LocalDate birthday = LocalDate.of(1996,6,28);
        int contracts = 5;
        int overallCarrotSell = 500;
        String city = "prague";
        String spz = "6T4 2522";
        int carConsumption = 7;
        String ip = "192.168.48.39";
        System.out.println("průměrné množství prodané mrkve v tunách na jednu smlouvu je " +(overallCarrotSell/contracts)+ ".");

    }


    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        variables();

    }
}