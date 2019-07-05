
单元格合并
这里需要解释的是 因为1-6是合并单元格，值取的是第一个单元格的值，所以后面的单元格赋不赋值都无所谓，但是一定要createCell，

https://www.cnblogs.com/itZhy/p/7636615.html

熟悉其他语言的朋友可能会开始吐槽了，在C++中，我们可以把关闭资源的代码放在析构函数中，在C#中，我们有using代码块。这些语法都有一个共同的特性，让外部资源的关闭行为与外部资源的句柄对象的生命周期关联，当外部资源的句柄对象生命周期终结时（例如句柄对象已出作用域），外部资源的关闭行为将被自动调用。这样不仅更加符合面向对象的编程理念（将关闭外部资源的行为内聚在外部资源的句柄对象中），也让代码更加简洁易懂。怎么到了Java这里，就找不到自动关闭外部资源的语法特性了呢。

通过反编译的代码，大家可能注意到代码中有一处对异常的特殊处理：

var2.addSuppressed(var11);
这是try-with-resource语法涉及的另外一个知识点，叫做异常抑制。当对外部资源进行处理（例如读或写）时，如果遭遇了异常，且在随后的关闭外部资源过程中，又遭遇了异常，那么你catch到的将会是对外部资源进行处理时遭遇的异常，关闭资源时遭遇的异常将被“抑制”但不是丢弃，通过异常的getSuppressed方法，可以提取出被抑制的异常。

四、总结
1、当一个外部资源的句柄对象实现了AutoCloseable接口，JDK7中便可以利用try-with-resource语法更优雅的关闭资源，消除板式代码。

2、try-with-resource时，如果对外部资源的处理和对外部资源的关闭均遭遇了异常，“关闭异常”将被抑制，“处理异常”将被抛出，但“关闭异常”并没有丢失，而是存放在“处理异常”的被抑制的异常列表中。

分类: 知识总结


IDEA使用apache-tomcat-9.0.16控制台Tomcat日志中文乱码问题(https://blog.csdn.net/xudc0521/article/details/87438728)
tomcat 参数 http://www.manongjc.com/article/39843.html
