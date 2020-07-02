import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class main {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

                BufferedWriter writer = new BufferedWriter(new FileWriter("filename.txt", true));
                for (int i = 1; i <= 20000000; i++){

                    writer.append("AhgsHAGSjHAGSuyA3t12834283yt48234y2834ybBAJHgAGjyAGwyGEuyAGEuyGEyAGEygeuyAGYEuGEAIYGAYEAHSuyGSDUYGSDuyGsreuyguy42g34uygu34g5u34gy5uYAGUYEGUYSrguyegruysgreyuwg");
                    writer.newLine();

                }
                writer.close();
                System.out.println("File populated");

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}