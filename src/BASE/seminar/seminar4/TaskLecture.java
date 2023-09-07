package BASE.seminar.seminar4;/*
import java.util.Stack;

import static java.lang.Character.isDigit;
///////////

public class TaskLecture {
    // Вычислить значение выражения в постфиксной форме записи.
    // Дано выражение 123*+
    // в КОНЕЦ стэка добавляется первый элемент выраэения (1)
    // Далее элемент 2
    // Далее 3
    // Когда доходим до элемента не Integer, берём 2 последних элемента стэка и выполняем операцию *
    // Результат сохраняем в стэк
    // Далее берём + из выражения
    // Применяем + с перым значением стека и прибавляем.
    // Получаем результат.
    public static void main(String[] args) {

        // var exp = "7 8 + 3 *".split(" "); // (7 + 8) * 3
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        Stack<Integer> st = new Stack<>(); // хранилище стэк

        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) { // проверка на число
                st.push(Integer.parseInt(exp[i])); // если число положить в стэк.
            } else {
                switch ((exp[i])) { // иначе применить операторы к числам
                    case "+":
                        res = st.pop() + st.pop(); // взять 2 последних эл-та
                        st.push(res); // добавить результат выражения в стэк
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }

//    private static boolean isDigit(String s) {
//        return true;
//    }
}
 */
