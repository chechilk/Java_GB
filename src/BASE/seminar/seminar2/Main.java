package BASE.seminar.seminar2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Task1.execute();
//        ///////// Задача 2
//        String line = "aaaaaaabbccdd";
//        if (line.isEmpty()){
//            System.out.println("Строка пустая");
//        }
//        else {
//            String compressedLine = Task2.compressLine(line);
//            System.out.println(compressedLine);
//        }
        /////////
        //Task4.addTextInFile(100);

        // Задача 5
//        * Напишите метод, который вернет содержимое текущей папки в виде
//        массива строк.
//        * Напишите метод, который запишет массив, возвращенный предыдущим
//        методом в файл.
//        * Обработайте ошибки с помощью try-catch конструкции. В случае
//        возникновения исключения, оно должно записаться в лог-файл.
        try{
            String[] fldrCnt = Task5.getCrntFldrCnts();
            Task5.wrtArrToFile(fldrCnt, "filenames.txt");
            Task5.dtrmFileExts(fldrCnt);
        }
        catch (IOException e){
            Task5.wrtExcptToLogFile(e, "log.txt");
        }
    }
}