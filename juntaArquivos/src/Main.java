import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] files = new String[]{"C:\\Users\\vitor\\OneDrive\\Área de Trabalho\\juntaArquivos\\src\\teste.txt", "C:\\Users\\vitor\\OneDrive\\Área de Trabalho\\juntaArquivos\\src\\entrada.txt"};
        Scanner reader = null;
        PrintWriter print = new PrintWriter("C:\\Users\\vitor\\OneDrive\\Área de Trabalho\\juntaArquivos\\src\\final.txt");
        for (String name : files) {
            try {
                reader = new Scanner(new BufferedReader(new FileReader(name)));

                while (reader.hasNext()) {
                    String nextWord = reader.next();
                    //System.out.println(nextWord);
                    print.format("%s ", nextWord);
                }
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        }
        print.close();
    }
}
