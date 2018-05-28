package strategy.invalid.missingStrategiesEdgeCase;

import java.io.File;
import java.util.ArrayList;

/**
 * Source: https://dzone.com/articles/design-patterns-strategy
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        for (String arg: args) {
            fileList.add(new File(arg));
        }

        CompressionContext ctx = new CompressionContext();
        //get a list of files...
        ctx.createArchive(fileList);
    }
}