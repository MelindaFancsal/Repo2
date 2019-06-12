package sci.arrayExample;

public class ArrayEx {

    public static void main(String args[]) {
        int[] numereIntregi = new int[10];
        numereIntregi[0] = 5;
        numereIntregi[1] = 10;
        numereIntregi[2] = 8;
        numereIntregi[3] = 7;
        numereIntregi[4] = 3;

        //afisareNrPare(numereIntregi);
        //  afisareNrImpare(numereIntregi);
        stergerePrimulNumarImpar(numereIntregi);
    }

    private static void stergerePrimulNumarImpar(int[] numereIntregi) {
        int[] copyArray = new int[10];
        boolean aFostPrimulNumarCitit = false;
        int indexCpyArray = 0;

        for (int i = 0; i < numereIntregi.length; i++) {
            if (numereIntregi[i] % 2 != 0 && aFostPrimulNumarCitit == false) {
                aFostPrimulNumarCitit = true;
                continue;
            }

            copyArray[indexCpyArray++] = numereIntregi[i];
            System.out.println(copyArray[indexCpyArray]);
        }

    }

    private static void afisareNrImpare(int[] numereIntregi) {
        System.out.println("afisare numere impare");
        int i = 0;

        while (i < numereIntregi.length) {
            if (numereIntregi[i] % 2 != 0) {
                System.out.println(numereIntregi[i]);
            }

            i++;
        }
    }

    private static void afisareNrPare(int[] numereIntregi) {
        System.out.println("afisare numere pare");
        int i = 0;

        while (i < numereIntregi.length) {
            if (numereIntregi[i] % 2 == 0) {
                System.out.println(numereIntregi[i]);
            }

            i++;
        }
    }
}
