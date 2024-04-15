import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Triangle> triangles = readFile();

    }

    public static ArrayList<Triangle> readFile() throws FileNotFoundException {
        ArrayList<Triangle> triangles = new ArrayList<>();
        String filename = "INPUT.txt";
        Scanner scan = new Scanner(new File(filename));

        while (scan.hasNext()) {
            Point a = new Point( scan.nextDouble(), scan.nextDouble());
            Point b = new Point( scan.nextDouble(), scan.nextDouble());
            Point c = new Point( scan.nextDouble(), scan.nextDouble());
            triangles.add(new Triangle(a, b,c));
        }
        scan.close();
        System.out.println(triangles);
        return triangles;
    }
}
