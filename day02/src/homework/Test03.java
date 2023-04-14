package homework;
/*
根据需求完成代码:
1.定义动物类：
行为：吼叫 bellow；没有具体的吼叫行为
	 吃饭 eat:没有具体的吃饭行为
2.定义缉毒接口 Drugs
行为: 缉毒
3.定义缉毒狗:犬的一种
行为：
 吼叫:汪汪叫
 吃饭:狗啃骨头
 缉毒:用鼻子侦测毒
4.定义测试类:
以多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法
 */
public class Test03 {
    public static void main(String[] args) {
        drugs d=new drugsDog();
        d.antiDrugs();
        drugsDog d2=(drugsDog)d;
        d2.bellow();

    }
}
abstract class animal{
    public abstract void bellow();
    public abstract void eat();
}

interface drugs{
    void antiDrugs();
}

class drugsDog extends animal implements drugs{

    @Override
    public void bellow() {
        System.out.println("汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void antiDrugs() {
        System.out.println("用鼻子侦毒");

    }
}

