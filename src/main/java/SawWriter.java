import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;


public class SawWriter {

    public void writeToFile(List<Saw> saws) {
        File csvFile = new File("Saw.csv");
        try (PrintWriter out = new PrintWriter(csvFile)) {


            for (Saw saw : saws) {
                out.println(saw.getHeaders());
                out.println(saw.toCSV());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        List<Saw> saw = new ArrayList<>();
        saw.add(new Chainsaw(10, "intel", 800, 10, 4.0, false));
        saw.add(new Chainsaw(8, "asus", 1000, 15, 5.0, false));
        saw.add(new ElectricSaw(6, "apple", 900, 3200, "el-4", false));
        saw.add(new ElectricSaw(10, "msi", 500, 2200, "sc-1", false));
        SawWriter sawWriter = new SawWriter();

        sawWriter.writeToFile(saw);

    }
}