package creational.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 描述：这种方式采用双锁机制，线程安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton1 {
    private volatile static Singleton1 singleton;
    private Singleton1(){}
    public static Singleton1 getSingleton() {
    if (singleton == null) {  
        synchronized (Singleton1.class) {
        if (singleton == null) {  
            singleton = new Singleton1();
        }  
        }  
    }  
    return singleton;  
    }  
}  