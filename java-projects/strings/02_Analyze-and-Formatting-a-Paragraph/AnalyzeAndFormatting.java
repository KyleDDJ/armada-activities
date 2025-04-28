import java.util.Scanner;

class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void clean() {
        text = text.trim().replaceAll("\\s+", " ");
    }

    public void replace(String before, String after) {
        text = text.replace(before, after);
    }

    public int getWordCount() {
        return text.isEmpty() ? 0 : text.split(" ").length;
    }

    public String getText() {
        return text;
    }

} 

public class AnalyzeAndFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String input = scanner.nextLine();

        Paragraph paragraph = new Paragraph(input);
        paragraph.clean();
        paragraph.replace("Java", "Python");

        System.out.println("Word Count: " + paragraph.getWordCount());
        System.out.println("Modified Paragraph: " + paragraph.getText());

        scanner.close();
    }

}   