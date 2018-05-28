package strategy.invalid.missingStrategiesEdgeCase;

import java.io.File;
import java.util.ArrayList;

/**
 * Source: https://dzone.com/articles/design-patterns-strategy
 */
public class CompressionContext {
    private int useless;
    private CompressionStrategy strategy;
    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(ArrayList<File> files) {
        strategy.compressFiles(files);
    }
}