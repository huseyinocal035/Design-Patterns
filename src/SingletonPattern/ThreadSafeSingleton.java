package SingletonPattern;

// We can use ENUM for thread safe Singleton as well
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {};

    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null)
            threadSafeSingleton = new ThreadSafeSingleton();

        return threadSafeSingleton;
    }

}
