package com.buddha;

/**
 * 基本数据类型：  byte    1个字节 = 8个bit
 *              short   2个字节
 *              int     4个字节  默认的整数类型
 *              long    8个字节  后缀L
 *              float   4个字节  比long的范围更广，后缀F
 *              double  8个字节  默认的小数类型
 *              char    2个字节
 *              boolean 1个字节
 *
 */
public class HelloWorld {
    // javac 编译器
    // java  解释和执行器
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("Hello, Java!");
        System.out.println("");

        // 整数常量
        System.out.println(123);
        System.out.println(-123);

        // 浮点数常量 (double)
        System.out.println(3.14);
        System.out.println(-3.14);
        System.out.println(-0.000000);  // -0.0
        System.out.println(-0001.000001); // -1.000001

        // 字符常量
        System.out.println('Y');
        // System.out.println('');    // 编译 error
        System.out.println(' ');
        System.out.println('\'');
        System.out.println('器');

        // 布尔常量
        System.out.println(true);
        System.out.println(false);

        // System.out.println(null); // 编译 error

        String a;
        //System.out.print("result:" + a); // 编译 error
        a = null;
        System.out.println("result:" + a);  // result:null

        autoConvert();
    }

    /**
     * 自动数据类型转化（隐式）
     * 1. 特点： 自动完成，代码不需要特殊处理
     * 2. 规则： 数据范围从小转到大
     */
    public static void autoConvert() {
        long num1 = 100;
        System.out.println(num1);   // 100

        double num2 = 0.23F;
        System.out.println(num2);   // 0.23000000417232513

        float num3 = 100L;
        System.out.println(num3);   // 100.0
    }


    /**
     * 强制数据类型转换 （显式）
     * 语法：（范围小的类型）范围大的类型
     * 注意事项：
     * 1. 数据溢出，精度丢失
     * 2. byte、short、char可以发生数学运算，运算前会被提升为int类型
     * 3. boolean类型不能发生数学运算
     */
}
