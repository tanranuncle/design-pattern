## 适配器模式（Adapter Pattern）  
### 应用场景  
1、想复用已存在的类，但接口不符合当前的需求  
### 优点  
1、提高了类的复用性    
2、可以让接口不一致的两个类协同工作  
### 缺点  
1、过多的使用适配器，会使得系统混乱不易维护（以为调用的是A接口，实际上被适配成了B接口）  
### 注意事项  
1、适配器只是为了解决原有老系统的问题，不应当在系统设计之初就被引入  