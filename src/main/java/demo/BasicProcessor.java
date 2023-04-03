package demo;

public class BasicProcessor {

	public static void main(String[] args) {
		System.out.printf("Args.Length: %s %n", args.length);
		for (String arg : args) {
			System.out.printf("Arg[x]: %s %n", arg);
		}
		System.out.printf("Env.APP_ENV: %s %n", System.getenv("APP_ENV"));
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Foo " + i);
				Thread.sleep(1000);
				System.out.println("Bar " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

}
