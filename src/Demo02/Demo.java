package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-20 14:49
 */
public class Demo {
    public static void main(String[] args) {
        phone xiaomi11 = new phone();
       /*
        xiaomi11.width = 55;
        xiaomi11.height = 135;
        xiaomi11.weight = 255;
        xiaomi11.color = "color";
        */

        phone iphone = new phone(56, 136, 256, "土豪金");

        phone xiaomi = new phone(56, 234, 23);
        System.out.println(iphone);  //Demo02.phone@7ef20235
        System.out.println(xiaomi);  // Demo02.phone@27d6c5e0
    }
}
