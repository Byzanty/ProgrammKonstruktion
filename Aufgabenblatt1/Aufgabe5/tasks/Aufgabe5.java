/*
    Aufgabe 5) Verzweigungen und while-Schleife

    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Schreiben Sie eine while-Schleife, die alle Zahlen zwischen
      10-10000 (inklusive) aufsummiert, die sowohl durch 13 als auch und durch 17
      teilbar sind.
    - Geben Sie das Ergebnis mit "System.out.println()" aus.

*/
public class Aufgabe5{

    public static void main(String[] args) {
        // TODO: Implementieren Sie hier die Angabe
        int start = 10;
        int end = 10000;
        int sum = 0;
        while(start<=end){
            if(start%13 == 0 && start %17 == 0){
                sum = start+sum;
            }
            start++;
        }
        System.out.println(sum);
    }
}

