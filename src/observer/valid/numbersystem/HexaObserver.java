package observer.valid.numbersystem;

/**
 * Source: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
