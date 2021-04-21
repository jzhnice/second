package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-21 08:23
 */
public class Demo04 {
    int size = 0;
    //代码块
    {
        size = 10;
    }
    //  静态变量
    static  int count = 30;
    //静态代码块
    static{
        count = 10;
    }
    public  Demo04(){
        System.out.println("构造方法");
        System.out.println(count);   //10
        System.out.println(size);  //10
    }



}
