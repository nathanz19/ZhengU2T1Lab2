public class ChatBoxRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 5);
        debbie.greeting("Nathan");
        debbie.weather();
        debbie.favoriteNumber(8);
        System.out.println("The sum of 5ft, 8ft, and 10ft is " + debbie.addNumbers(5 , 8, 10) + "ft and this converted into meters is " + debbie.convertFeetToMeters(debbie.addNumbers(5 , 8, 10)));
        debbie.favSports("Basketball");
        System.out.println("I will reach your number at " + debbie.cellNumber("834-234-1344"));
        System.out.println(debbie.goodbye());

    }
}
