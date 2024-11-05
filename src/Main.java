public class Main {
    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        String[] rader = textReader.läsRader();

        LineCounter lineCounter = new LineCounter(rader);
        System.out.println("Antal rader: " + lineCounter.raknaRader());
        System.out.println("Antal tecken: " + lineCounter.raknaTecken());
    }
}