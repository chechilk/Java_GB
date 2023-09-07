package BASE.seminar.seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task4 {
    public static void addTextInFile(int n) throws IOException{
        try (PrintWriter pw = new PrintWriter(new FileWriter("Sem2TEST.txt"))){
            pw.println(generateText("TEST", n));
        }
    }

    public static String generateText(String s, int countRepeat){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countRepeat; i++){
            sb.append(s);
        }
        return sb.toString();
    }


    //// Вариант 2 с обработкой ошибок
//    public static String createString(){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100; ++i){
//            sb.append("TEST");
//        }
//        String result = sb.toString();
//        return result;
//    }
//
//    public static void writeToFile(String line) throws IOException{
//        File file = new File("Sem2Test2.txt");
//        try(FileWriter fw = new FileWriter(file, false)){
//            fw.write(line);
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}
