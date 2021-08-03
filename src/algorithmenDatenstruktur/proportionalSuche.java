package algorithmenDatenstruktur;

public class proportionalSuche {

    public int proSuche(int schluessel, int daten[]) {
        int links = 0;                  // linke Teilfeldbegrenzung
        int rechts = daten.length - 1;  // rechte Teilfeldbegrenzung
        int versch;                     // Anzahl verschiedener Elemente
        int pos;                        // aktuelle Teilungsposition

        // solange der Schlüssel im Bereich liegt (andernfalls ist das gesuchte
        // Element nicht vorhanden)
        while( schluessel >= daten[links] && schluessel <= daten[rechts] ){
            // Aktualisierung der Anzahl der verschiedenen Elemente
            versch = daten[rechts] - daten[links];

            // Berechnung der neuen interpolierten Teilungsposition
            pos = links + (int)(((double)rechts - links) * (schluessel - daten[links])
                    / versch);

            if( schluessel > daten[pos] )            // rechtes Teilintervall
                links = pos + 1;                       // daten[pos] bereits überprüft
            else if( schluessel < daten[pos] )      // linkes Teilintervall
                rechts = pos - 1;                      // daten[pos] bereits überprüft
            else                                     // Element gefunden
                return pos;                            // Position zurückgeben
        }

        return -1;                                 // Element nicht gefunden
    }}