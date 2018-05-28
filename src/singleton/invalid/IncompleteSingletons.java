/**
 * Source: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
package singleton.invalid;

class SingletonWithPublicConstructor {
    private static final SingletonWithPublicConstructor instance = new SingletonWithPublicConstructor();

    //private constructor to avoid client applications to use constructor
    public SingletonWithPublicConstructor(){}

    public static SingletonWithPublicConstructor getInstance(){
        return instance;
    }
}

class SingletonWithDefaultConstructor {
    private static final SingletonWithDefaultConstructor instance = new SingletonWithDefaultConstructor();

    public static SingletonWithDefaultConstructor getInstance(){
        return instance;
    }
}

interface NotAClass {
    public void unrelatedFunction();
}
