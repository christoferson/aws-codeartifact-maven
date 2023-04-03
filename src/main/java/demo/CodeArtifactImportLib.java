package demo;

public class CodeArtifactImportLib {
	
	public static final String VERSION = "1.0";

	public static void main(String[] args) {
		System.out.printf("Args.Length: %s %n", args.length);
		for (String arg : args) {
			System.out.printf("Arg[x]: %s %n", arg);
		}
		System.out.printf("Env.APP_ENV: %s %n", System.getenv("APP_ENV"));
		
		boolean isBlankOrNull1 = StringUtils.isNullOrBlank("foo");
		System.out.printf("isBlankOrNull1: %s %n", isBlankOrNull1);
		boolean isBlankOrNull2 = StringUtils.isNullOrBlank("");
		System.out.printf("isBlankOrNull2: %s %n", isBlankOrNull2);

	}

}
