import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Thay đổi đường dẫn đến input.txt
        String outputFile = "output.txt";

        replaceText(inputFilePath, outputFile, "Nha Trang", "Vũng Tàu");
    }

    public static void replaceText(String inputFilePath, String outputFileName, String targetWord, String replacement) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(targetWord, replacement);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Thay thế thành công và ghi ra file " + outputFileName);
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
