public class Computer2 {
    public static void main(String[] args) {
        Computer MacBook = new Computer("M2", 24000, 2000, 2);
        for (int j = 0; j < 100; j++){
            //MacBook.printInfo();
            MacBook.turnON();
            MacBook.turnOFF();
        }
    }
}
