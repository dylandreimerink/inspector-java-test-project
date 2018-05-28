package strategy.invalid.strategyInterfaceWithoutMethodsEdgeCase;

import java.io.File;
import java.util.ArrayList;

/**
 * Source: https://dzone.com/articles/design-patterns-strategy
 */
public class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(ArrayList<File> files) {
        //using RAR approach
    }
}