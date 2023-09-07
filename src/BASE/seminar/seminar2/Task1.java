package BASE.seminar.seminar2;

public class Task1 {
    public static void execute(){
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.
        int N = 15;
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++){
            if (i % 2 == 0){
                result.append(c1);
            }
            if (i % 2 == 1){
                result.append(c2);
            }
        }
        System.out.println(result);
    }
}
