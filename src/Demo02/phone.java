package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-20 14:47
 */
public class phone {
    public double width;
    public double height;
    public int weight;
    public String color;


    /**
     * 方法的重载：*/

    /**
     * 构造方法： 1：一定没有返回值
     * 2：方法的名字必须和类的名字完全一致
     */

    /*构造方法、构造器、构造函数*/
    /*无参构造方法，不管写不写,系统都会生成*/
    public phone() {
        System.out.println("我被调用了，有一个对象产生了");
    }

    //构建方法  包含全部的参数   也叫全参构建方法
    public phone(double width, double height, int weight, String color) {
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
//构造函数
    public phone(double kuandu, double gaodu, int zhonglian) {
        width = kuandu;
        height = gaodu;
        weight = zhonglian;
    }

    public phone(int zhonglian,int kuandu, int gaodu ) {
        width = kuandu;
        height = gaodu;
        weight = zhonglian;
    }

    public void startup() {
        System.out.println("正在开机");
    }

    public void suoping() {
        System.out.println("手机即将锁屏");
    }
    public String toString(){
        return  "{" + this.width +"\t"+ this.height+"\t"+this.weight+"\t"+this.color+"}";
    }
   /* Object

    return getClass().getName() + "@" + Integer.toHexString(hashCode());
   */
    /**huyuansong*/
    /**static   静态的*/


}
