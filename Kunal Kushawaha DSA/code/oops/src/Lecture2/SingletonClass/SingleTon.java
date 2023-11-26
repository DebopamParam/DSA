package Lecture2.SingletonClass;

public class SingleTon {

    int count = 0 ;
    private SingleTon()
    {
    }
    static SingleTon instance = null;
    public static SingleTon getInstance()
    {
        if(instance == null)
        {
            instance = new SingleTon();
        }
        return instance;
    }
}
