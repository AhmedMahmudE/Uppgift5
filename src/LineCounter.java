public class LineCounter {
    private String[] rader;

    public LineCounter(String[] rader) {
        this.rader = rader;
    }

    public int raknaRader() {
        return rader.length; // Räknar antalet rader
    }

    public int raknaTecken() {
        int totalTecken = 0;
        for (String rad : rader) {
            totalTecken += rad.length(); // Lägger till längden av varje rad
        }
        return totalTecken;
    }
}