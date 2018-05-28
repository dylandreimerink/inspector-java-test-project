package command.valid.stockmarket;

/**
 * Source: https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}