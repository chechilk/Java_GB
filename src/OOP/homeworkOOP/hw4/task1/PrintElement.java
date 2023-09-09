package OOP.homeworkOOP.hw4.task1;

 class PrintElement {
    public <T> void print(T element){
        System.out.println("Тип элемента: " + element.getClass() + " " +element);
    }
}

