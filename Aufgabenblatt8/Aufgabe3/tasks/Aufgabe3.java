/*
    Aufgabe3) Bäume

    In der Klasse StringTree haben Sie eine Baumimplementierung gegeben, die
    analog zu Aufgabe4 einen sortierten Binärbaum abbildet. Nun wird anstatt
    eines int-Elements ein String in jedem Knoten abgelegt.

    Jede Veränderung des Baumes durch eine Methode muss gewährleisten, dass
    dieser sortiert bleibt. Dazu sollen Sie folgende zusätzliche Methoden
    implementieren:

    - add:              Fügt einen Knoten in den Baum ein. Die Strings werden
                        sortiert nach ihrer lexikografischen Ordnung in den Baum
                        eingefügt. Hinweis: Sie können dazu
                        String.compareTo(...) verwenden. Werden folgende
                        Elemente {"Mama", "Hugo", "Kasten", "Nordpol", "Haus",
                        "Nase", "Insel", "Natrium"} nacheinander in den Baum
                        eingefügt, wird folgender Baum aufgebaut:
                                                Mama
                                          /             \
                                       Hugo            Nordpol
                                    /       \          /
                                 Haus     Kasten     Nase
                                          /             \
                                       Insel          Natrium
    - height:           Liefert die Höhe des Baumes zurück. Der leere Baum hat
                        die Höhe 0. Hat der Baum nur einen Knoten (Wurzel), dann
                        hat er die Höhe 1. Mit jeder zusätzlichen Stufe von
                        Nachfolgern erhöht sich die Höhe um 1. Der oben gezeigte
                        Baum hat die Höhe 4.
    - printLeaves:      Diese Methode gibt die Elemente der Blattknoten aus,
                        wobei das linke Blatt immer vor dem rechten Blatt
                        ausgegeben wird. Verwenden Sie an entsprechender Stelle
                        für die Ausgabe -> System.out.println(this.elem);
    - printInOrderUp:   Diese Methode gibt alle Elemente eines Teilbaums in
                        aufsteigender Reihenfolge aus. Dazu wird der Methode ein
                        Element übergeben, welches dem Wurzelknoten des
                        Teilbaums entspricht. Nun wird der komplette Teilbaum
                        inklusive Wurzel ausgegben. Verwenden Sie an
                        entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printPostOrder:   Diese Methode gibt alle Elemente in der sogenannten
                        Post-Order aus. Die Post-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge: (Haus,Insel,Kasten,
                        Hugo,Natrium,Nase,Nordpol,Mama). Verwenden Sie an
                        entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printPreOrder:    Diese Methode gibt alle Elemente in der sogenannten
                        Pre-Order aus. Die Pre-Order für den oben abgebildeten
                        Baum ergibt folgende Reihenfolge:(Mama,Hugo,Haus,Kasten,
                        Insel,Nordpol,Nase,Natrium). Verwenden Sie an
                        entsprechender Stelle für die
                        Ausgabe -> System.out.println(this.elem);
    - printLevelOrder:  Diese Methode gibt alle Elemente in der sogenannten
                        Level-Order aus. Die Level-Order bildet den Baum Level
                        für Level ab. Der oben stehende Baum produziert folgende
                        Ausgabe:       #Mama#
                                       #Hugo#Nordpol#
                                       #Haus#Kasten#Nase#
                                       #Insel#Natrium#
    - printNodesStartWith(char letter):
                        Diese Methode gibt alle Elemente aus, die mit dem
                        Buchstaben "letter" beginnen. Dazu wird Groß- und
                        Kleinschreibung nicht unterschieden.
                        z.B.:
                        printNodesStartWith('H') -> liefert: Haus und Hugo
                        printNodesStartWith('h') -> liefert: Haus und Hugo
                        Hinweis: String.toLowerCase(), String.toUpperCase()
                        und String.charAt(...) können für die Implementierung
                        hilfreich sein.
    - toString:         Retourniert alle Elemente des Baumes in aufsteigender
                        Reihenfolge als String. z.B. der oben stehende Baum
                        liefert das Ergebnis:
                        "[Nordpol->Natrium->Nase->Mama->Kasten->Insel->Hugo->Haus]".
                        Für einen leeren Baum wird "[+]" zurückgegeben.

    Zusatzfragen:
    1. Falls die Elemente beim Einfügen in den Baum in ungünstiger Reihenfolge
       auftreten, könnte im schlimmsten Fall ein entarteter Baum entstehen. Wie
       würde dieser für unser Beispiel in der Angabe aussehen?

*/
public class Aufgabe3 {

    public static void main(String[] args) {
    }
}
