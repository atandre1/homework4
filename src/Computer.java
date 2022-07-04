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
        System.out.println("��������� - " + CPU);
        System.out.println("����������� ������ - " + RAM);
        System.out.println("������� ���� - " + SSD);
        System.out.println("������ - " + life + " �����");
        if (power == false) {
            System.out.println("��������� ��������");
        } else {
            System.out.println("��������� �������");
        }
        System.out.println();
    }

    public void turnON() {
        Random random = new Random();
        int number1 = random.nextInt(2);
        System.out.println("����� �������� ��������� ������� ����� �� 0 �� 1");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        if (power == false) {
            if (number1 == number2) {
                System.out.println("��������� �������!");
                power = true;
            } else System.out.println("��������� ������! :(");

        } else System.out.println("��������� ��� ��� �������! ������ ��� �� ��������!");

    }

    public void turnOFF() {

        Random random = new Random();
        int number1 = random.nextInt(2);
        System.out.println("����� ��������� ��������� ������� ����� �� 0 �� 1");
        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();
        if (power == true) {
            if (number1 == number2) {
                System.out.println("��������� ��������!");
                power = false;
                cycle++;
            } else System.out.println("��������� ������! :(");
        } else System.out.println("��������� �� �������! ��������� ������!");
        if (cycle >= life) System.out.println("������ ��������! ��������� ������! :(");

    }

    public boolean getStatus() {
        return power;
    }
}