package command.valid.stockmarket;

/**
 * Source: https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}