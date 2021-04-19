package com.buddha;

public class JDK {
    // JVM      Java Virtual Machine  Java跨平台的基础
    // JRE      Java Runtime Environment 包含了JVM和核心类库
    // JDK      Java Development Kit 包含了JRE和编译器等开发工具

    // 环境变量设置
    // JAVA_HOME    D:\Java\jdk8
    // Path         %JAVA_HOME%\bin;
    // classpath    是JVM用到的一个环境变量，它用来指示JVM如何搜索class。
    /**
     * 在系统环境变量中设置classpath环境变量，不推荐；
     * 在启动JVM时设置classpath变量，推荐。
     * 我们强烈不推荐在系统环境变量中设置classpath，那样会污染整个系统环境。在启动JVM时设置classpath才是推荐的做法。实际上就是给java命令传入-classpath或-cp参数：
     *
     * java -classpath .;C:\work\project1\bin;C:\shared abc.xyz.Hello
     * 或者使用-cp的简写：
     *
     * java -cp .;C:\work\project1\bin;C:\shared abc.xyz.Hello
     *  不要把任何Java核心库添加到classpath中！JVM根本不依赖classpath加载核心库！
     *  有很多“如何设置classpath”的文章会告诉你把JVM自带的rt.jar放入classpath，但事实上，根本不需要告诉JVM如何去Java核心库查找class，JVM怎么可能笨到连自己的核心库在哪都不知道？
     *
     *  不要把任何Java核心库添加到classpath中！JVM根本不依赖classpath加载核心库！
     * 更好的做法是，不要设置classpath！默认的当前目录.对于绝大多数情况都够用了。
     *
     * 假设我们有一个编译后的Hello.class，它的包名是com.example，当前目录是C:\work，那么，目录结构必须如下：
     *
     * C:\work
     * └─ com
     *    └─ example
     *       └─ Hello.class
     * 运行这个Hello.class必须在当前目录下使用如下命令：
     *
     * C:\work> java -cp . com.example.Hello
     */
}
