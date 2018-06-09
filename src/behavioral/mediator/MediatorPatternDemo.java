package behavioral.mediator;

/**
 * 优点：
 * 1、降低了类的复杂度，将一对多转化成了一对一。
 * 2、各个类之间的解耦。
 * 3、符合迪米特原则。
 *
 * 缺点：中介者会庞大，变得复杂难以维护。
 *
 * 使用场景：
 * 1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 * 2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 *
 * 注意事项：不应当在职责混乱的时候使用。
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}