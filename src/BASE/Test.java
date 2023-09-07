package BASE;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = (Iterator<String>) states.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}
