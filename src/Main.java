public class Main {
    public static void main(String[] args) {
        hello();
        System.out.println("Rezultatul operatiei de adunare dintre 4 si 56 este: " + adunare(4,56));
        System.out.println("Rezultatul impartirii dintre 34 si 12 este: " + impartire(34,12));
        System.out.println("Rezultatul scaderii dintre 6 si 3 este: " + scadere(6,3));
        System.out.println("Rezultatul inmultirii dintre 3 si 9 este: " + inmultire(3,9));
        operatii();
        viteze(90000, 1, 0, 0);
        text();
        System.out.println(" ");
        face();
        System.out.println("Media celor 3 numere este: " + medie(3,5,7));
        System.out.println("Restul impartirii celor 2 numere este: " + rest(8,5));
        System.out.println("Conversia din grade Farenheit in grade Celsius: " + conversie(200));
        System.out.println("Conversia in metri din inch este: " + inchToMeters(5));

    }
    static void text(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   v v  aaaaa");
        System.out.println(" JJ  a     a   v  a     a");
    }
    static void face(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +_____+ ");
    }
    static float medie(float x,float y, float z){
        float med = (x + y + z)/3;
        return med;
    }
    static float rest(float x, float y){
        float rest = x % y;
        return rest;

    }
    static float conversie(float x){
        float c = 5/9f * (x-32);
        return c;
    }
    static float inchToMeters(float x){
        float conv = x * 0.0254f;
        return conv;
    }
    static void viteze(float dmetri, int ore, int min, int sec){
        //float vitMperS = dmetri / (sec + min * 60 + ore * 3600);
        float vitKmperH = (dmetri / 1000f) / (ore + min / 60f + sec / 3600f);
        float vitMperS = vitKmperH / 3.6f;
        float vitMperH = vitKmperH / 1.609f;
        System.out.println("Viteza in metri pe secunda este: " + vitMperS);
        System.out.println("Viteza in km pe ora este: " + vitKmperH);
        System.out.println("Viteza in mile pe ora este: " + vitMperH);

    }
    static void hello(){
        System.out.println("Hello \nCristi");
    }
    static int adunare(int x, int y){
        int rezAd = x+y;
        return rezAd;
    }
    static float scadere(float x, float y){
        float rezSc = x - y;
        return rezSc;
    }
    static float impartire(float x, float y){
        float rezImp = x / y;
        return rezImp;
    }
    static float inmultire(float x, float y){
        float rezImp = x / y;
        return rezImp;
    }
    static void operatii(){
        float rezA =  -5 + 8 * 6;
        float rezB = (55+9) % 9;
        float rezC = 20 + -3*5f / 8;
        float rezD = 5 + 15 / 3f * 2 - 8 % 3;
        System.out.println("Rezultatul operatiei (- 5 + 8 * 6) este: " + rezA);
        System.out.println("Rezultatul operatiei ((55+9) % 9) este: " + rezB);
        System.out.println("Rezultatul operatiei (20 + -3*5 / 8) este: " + rezC);
        System.out.println("Rezultatul operatiei (5 + 15 / 3 * 2 - 8 % 3) este: " + rezD);
    }
}