#ReadMe
##第二章 一切都是对象


## 第五章 初始化与清理
* 如Demo512所示,虚拟机在确定堆内的对象不被引用时才会尝试清理对象,但不一定一定清理
* 类中，静态成员变量最先初始化
  只用用到了静态类，静态类内部的成员才会被初始化(包括new Table() 和 Table.bowl 和Table.show() ) 参考StaticInitialization