package singleton;

public class SingletonClass {
    // A constructor is used to create multiple instance of a class. But if we make it private then it will no longer be accessible outside this class.
    private SingletonClass(){

    }
    // We are not going to create any instance of Singleton class outside therefore making the instance present here as static
    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
           instance = new SingletonClass(); // we are allowed to use constructor here because its in the same class.
        }
        return instance;
    }
}
