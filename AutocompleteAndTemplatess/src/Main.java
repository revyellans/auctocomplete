import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Main adalah kelas utama
 * main di gunakan untuk mengeksekusi program
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.println("HALLO, INI ADALAH KONVERSI MASSA!");
        out.print("silahkan masukkan massa dalam kilogram : ");
        double kilogram = input.nextDouble();

        double gram = kilogram * 1000;
        out.println(kilogram + " kilogram adalah " + gram + " gram.");

        input.close();
    }
}
