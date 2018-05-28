package strategy.valid.compression;

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
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ctx.createArchive(fileList);
    }
}