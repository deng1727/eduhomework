package singleton;

public class Singleton {
    private static volatile Singleton singleton  ;
    private Singleton(){
        System.out.println("生成一个单例！！！");
    }
    public  static Singleton getInstance(){
        if (null == singleton){
            synchronized (Singleton.class){
                if (null == singleton){
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }
}
