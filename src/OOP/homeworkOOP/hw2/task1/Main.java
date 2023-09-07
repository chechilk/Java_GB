package OOP.homeworkOOP.hw2.task1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Владимир");
        market.addPerson("Антон");
        market.addPerson("Виктория");
        market.addPerson("Алексей");

        market.removePerson("Антон");
        market.removePerson("Алексей");
        for (int i = market.size(); i >= 0 ; i--){
            market.update();
            if (market.size() == 0){
                market.update();
                break;
            }else {
                System.out.println("В очереди " + market.size() + " человек(а)");
            }
        }
    }
}
