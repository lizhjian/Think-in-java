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
* Java父类调用被子类重写的方法 https://www.cnblogs.com/pomodoro/p/9488086.html
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
   
## 第九章
* 适配器模式 ???
* AdapterRandowDoubles
* A917 内部接口

## 第十章
* 内部类有外围类的所有元素的访问权
* 当外部类的对象创建了一个内部类对象时，此内部类对象必定会秘密捕获一个纸箱那个外围类的引用。参考Sequence.java
* 外部类可以访问内部类私有构造函数(https://blog.51cto.com/android/384809  参考Parcel5.java)
   * 在内部类中偷偷摸摸的创建了包可见构造器，从而使外部类获得了创建权限。
   * 在外部类中偷偷摸摸的创建了访问私有变量的静态方法，从而 使 内部类获得了访问权限。
  这样，类中定义的内部类无论私有，公有，静态都可以被包围它的外部类所访问。
* 如果定义一个内名内部类,并且希望它使用一个在其外部定义的对象,那么编译器会要求其参数应用是final ???
* 非静态内部类对象的创建必须依附于外部类的实例  

## 第十一章
* ArrayList集合源码
* 对象的equals比较 todo
* TreeSet将元素存储在红-黑树数据结构中
* HashSet使用李离散函数
* LinkedHashList使用了散列 看起来它使用了链表维护元素的插入顺序
* linkHashMap的两种遍历方式
  ```
  使用Iterator遍历
   LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap();
          linkedHashMap.put("a", "a");
          linkedHashMap.put("b", "b");
          linkedHashMap.put("c", "c");
          Iterator it = linkedHashMap.entrySet().iterator();
          while (it.hasNext()) {
              Map.Entry entry = (Map.Entry) it.next();
              System.out.println("key:" + entry.getKey() + "   value:" + entry.getValue());
          }
  ```
  ```
    foreach循环遍历
     LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap();
             linkedHashMap.put("a", "a");
             linkedHashMap.put("b", "b");
             linkedHashMap.put("c", "c");
             for(Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                 System.out.println("key:" + entry.getKey() + "   value:" + entry.getValue());
             }
    ```
* PriorityQueue
    * 优先级队列 声明下一个弹出元素是最需要的元素采用offer方法插入对象时，这个对象会在队列中被排序见Demo28
     
* 可以可以用ForEach进行遍历的结构说明实现了Iterable接口  
   * 参考NonCollectionSequence.clas 只要有方法能返回Iterable接口的实现  那么这个方法就可以用forEach遍历
