import java.util.Random;
import java.util.Scanner;

public class Computer {
    String CPU;
    int RAM;
    int SSD;
    int life;
    int cycle = 0;
    boolean power = false;


    public Computer(String CPU, int RAM, int SSD, int life) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.life = life;
    }

    public void printInfo() {
        System.out.println("Процессор - " + CPU);
        System.out.println("Оперативная память - " + RAM);
        System.out.println("Жесткий диск - " + SSD);
        System.out.println("Ресурс - " + life + " цикла");
        if (power == false) {
            System.out.println("Компьютер выключен");
        } else {
            System.out.println("Компьютер включен");
        }
        System.out.println();
    }

    public void turnON() {
        Random random = new Random();
        int number1 = random.nextInt(2);
        System.out.println("Чтобы включить компьютер введите число от 0 до 1");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        if (power == false) {
            if (number1 == number2) {
                System.out.println("Компьютер включен!");
                power = true;
            } else System.out.println("Компьютер сгорел! :(");

        } else System.out.println("Компьютер все еще включен! Второй раз не включишь!");

    }

    public void turnOFF() {

        Random random = new Random();
        int number1 = random.nextInt(2);
        System.out.println("Чтобы выключить компьютер введите число от 0 до 1");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        if (power == true) {
            if (number1 == number2) {
                System.out.println("Компьютер выключен!");
                power = false;
                cycle++;
            } else System.out.println("Компьютер сгорел! :(");
        } else System.out.println("Компьютер не включен! Выключать нечего!");
        if (cycle >= life) System.out.println("Ресурс исчерпан! Компьютер сгорел! :(");

    }

    public boolean getStatus() {
        return power;
    }
}