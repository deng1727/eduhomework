import singleton.TicketMaker;
import singleton.Triple;

public class Test {

    @org.junit.Test
    public void testSingleton(){
        TicketMaker obj1 = TicketMaker.getTicketMakerInstance();
        TicketMaker obj2 = TicketMaker.getTicketMakerInstance();
        if (obj1.getTicketNumber() ==obj2.getTicketNumber()){
            System.out.println("相同");
        }else{
            System.out.println("不相同");
        }
//        for (int i = 0; i <1000 ; i++) {
//            new Thread(new Runnable() {
//                public void run() {
//                    synchronized (this) {
//                        System.out.println(Thread.currentThread());
//                        TicketMaker.getTicketMakerInstance().getTicketNumber();
//                    }
//                }
//            }).start();
//        }

       Triple triple0 = Triple.getInstance(0);
       Triple triple1 = Triple.getInstance(1);
       Triple triple2 = Triple.getInstance(2);
       triple0.toInt();
       triple1.toInt();
       triple2.toInt();
    }
    @org.junit.Test
    public void testTriple(){

    }

}
