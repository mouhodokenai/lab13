import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите строку");
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("(((\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3})(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("IP.txt"))) {
                bw.write(matcher.group());
            } catch (IOException e) {
                System.out.println("возникла ошибка");
            }
        }
        else{
            System.out.println("не найдено");
        }


    }
}