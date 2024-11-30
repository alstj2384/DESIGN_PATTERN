package adapter.solution.P2_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileProperties = new FileProperties();
        try{
            fileProperties.readFromFile("./src/adapter/solution/P2_2/file.txt");
            fileProperties.setValue("width", "1024");
            fileProperties.setValue("height", "512");
            fileProperties.setValue("depth", "32");
            fileProperties.writeToFile("./src/adapter/solution/P2_2/newfile.txt");
            System.out.println("newfile.txt is created");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
