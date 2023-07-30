package loaders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveLoader {
    final static String DATA_ROOT = "src/data/";
    public static List<String> load(String filename){
        Scanner in = null;
        try {
            in = new Scanner(new File(DATA_ROOT + filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> materials = new ArrayList<>();
        while (in.hasNextLine()){
            materials.add(in.nextLine());
        }
        return materials;
    }
}
