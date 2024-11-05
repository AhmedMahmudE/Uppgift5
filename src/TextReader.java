import java.util.Scanner;

public class TextReader {
    private Scanner scanner;

    public TextReader() {
        this.scanner = new Scanner(System.in);
    }

    public String[] läsRader() {
        System.out.println("Mata in rader (skriv 'stop' för att avsluta):");
        StringBuilder textBuilder = new StringBuilder();
        
        while (true) {
            String rad = scanner.nextLine();
            if (rad.equalsIgnoreCase("stop")) {
                break; // Avslutar när användaren skriver 'stop'
            }
            textBuilder.append(rad).append("\n"); //
        }

        // Dela upp texten i rader
        return textBuilder.toString().split("\n");
    }
}