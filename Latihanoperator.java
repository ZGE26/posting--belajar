package part2;

import java.util.Scanner;

public class Latihanoperator {
    public static void main(String[] args) {
        
        String nama;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        nama = keyboard.nextLine();

        System.out.println("Nama saya " + nama );

        keyboard.close();
    }
}
