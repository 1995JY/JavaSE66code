package homework;
/*
根据需求完成代码:
1.定义手机类作为父类
行为:打电话、发短信
2.定义接口IPlay
行为:玩游戏
3.定义旧手机类继承手机类
行为: 打电话：输出语句普通的打电话功能
     发短信：输出语句普通的发短信功能
4.定义新手机继承手机类，并实现IPlay接口
行为:
打电话：输出语句新手机视频通话
发短信：输出语句新手机发送语音和图片
玩游戏：输出语句新手机可以玩游戏
5.定义测试类
在测试类中，创建旧手机对象，调用打电话和发短信的方法。
在测试类中，创建新手机对象，调用打电话和发短信以及玩游戏的方法
 */
public class Test02 {
    public static void main(String[] args) {
        Phone o1=new oldPhone();
        o1.call();
        o1.text();
        Phone n=new newPhone();
        n.call();
        n.text();
        newPhone p=(newPhone)n;
        p.playGame();

    }
}
class Phone{
    public void call(){
        System.out.println("打电话");
    }
    public void text(){
        System.out.println("发短信");
    }
}
interface IPlay{
    void playGame();
}
class oldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("普通的打电话功能");
    }

    @Override
    public void text() {
        System.out.println("普通的发短信功能");
    }

}
class newPhone extends Phone implements IPlay{
    @Override
    public void call() {
        System.out.println("新手机视频通话");
    }

    @Override
    public void text() {
        System.out.println("新手机发送语音和图片");
    }
    @Override
    public void playGame() {
        System.out.println("新手机可以玩游戏");
    }
}
