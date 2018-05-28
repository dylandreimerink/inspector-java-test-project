/**
 * Source: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
package singleton.valid;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}