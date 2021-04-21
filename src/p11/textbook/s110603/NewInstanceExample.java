package p11.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p11.textbook.s110603.SendAction");
			Class clazz1 = Class.forName("p11.textbook.s110603.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			Action action1 = (Action) clazz1.newInstance();
			action.execute();
			action1.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
