package week2;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short s = b;
        System.out.println(b+ " "+ s);
        int x = scanner.nextInt();
        short y = (short)x;

    }
}
