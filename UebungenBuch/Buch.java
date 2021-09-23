
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Buch
{
    private String autor;
    private String titel;
    private int Seiten;

    /**
     * Konstruktor für Objekte der Klasse Buch
     */
    public Buch(String buchautor,String buchtitel,int anzahlBuchSeiten)
    {
        autor = buchautor;
        titel = buchtitel;
        Seiten = anzahlBuchSeiten;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getBuchautor()
    {
       return autor;
    }
    /** 
    * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getBuchtitel()
    {
       return titel;
    }
    /** 
    * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getPages()
    {
       return Seiten;
    }
}
