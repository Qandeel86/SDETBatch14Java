package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        right click on your file and click copypathreference then click from Content root
         */
        var path="Data/config.properties";//location of the file
        var fileInputStream=new FileInputStream(path);//it helps us Navigate to the file
        var properties=new Properties();
        properties.load(fileInputStream);//loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();//closes the file
    }
}
