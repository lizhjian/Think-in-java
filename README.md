# ReadMe
## 第二章 一切都是对象


## 第五章 初始化与清理
* 如Demo512所示,虚拟机在确定堆内的对象不被引用时才会尝试清理对象,但不一定一定清理
* 类中，静态成员变量最先初始化
  只用用到了静态类，静态类内部的成员才会被初始化(包括new Table() 和 Table.bowl 和Table.show() ) 参考StaticInitialization
* 代码块每次实例化都会执行  代码块不实例化不会执行(Demo515)
* protected为不同包下的子类访问父类提供了可能,但是和"子类中先定义父类再访问父类的方法"是不一样的(可以理解为不用super.bite自己定义父类,就是抛弃父子的概念,既然抛弃了父子关系,proected自然也就不为其提供便利,这时是"其他包访问其他包"的现象,也就导致无法访问protecte方法) 参考ChocolateShip1类

## 复用类
* 不指明的情况下,子类调用父类不带参数的构造器，如果父类没有不带参数的构造器,子类报错
* final作为参数,不能重新分配指向(Demo719)
* 只要涉及到类,类就被加载 同时类中的静态资源也被加载

## 多态
* 子类只有实现或者覆盖了父类的方法,才叫多态,没有成功的实现或者覆盖多态不生效(PrivateOverride.java)https://blog.csdn.net/wn1017888485/article/details/46051981
* 访问变量看声明，访问方法看实际对象类型,（new出来的类型)https://blog.csdn.net/qq_23476319/article/details/53892776
* 当子类中存在和父类同名的属性时，父类属性会被隐藏起来，但在多态的情况下属性被调用时会激活父类的属性而隐藏子类的属性，而方法不会被隐藏，只能使用super在子类中调用父类的方法。
* 类的加载顺序
   * main()中不new子类
      * 父类静态变量....初始化
      *  子类静态变量....初始化
   *  如果有静态代码块 
      * 父类静态代码块01...
      * 父类静态变量....初始化
      * 父类静态代码块02...
      * 子类静态变量....初始化
      * 子类静态代码块01...
      * 子类静态代码块02...
   * main()中new子类
      * 父类静态变量....初始化
      * 子类静态变量....初始化
      * 父类成员变量...初始化
      * 父类...构造函数
      * 子类成员变量...初始化
      * 子类....构造函数
   * 如果有静态代码块
      * 父类静态  代码块01...
      * 父类静态  变量....初始化
      * 父类静态  代码块02...
      * 子类静态  代码块01...
      * 子类静态  变量....初始化
      * 子类静态  代码块02...
      
      * 父类成员变量...初始化
      * 父类代码块01...
      * 父类代码块02...
      * 父类...构造函数
      
      * 子类代码块01...
      * 子类成员变量...初始化
      * 子类代码块02...
      * 子类....构造函数   
__总结:不管new不new子类父类和子类的静态代码块和静态变量都会初始化(顺序部分前后),new 子类时，先初始化父类的代码块或成员变量(不分前后),再执行父类构造函数,然后执行子类成员变量(代码块)初始化最后执行构造函数参考(PortableLunch)__       
   
   
