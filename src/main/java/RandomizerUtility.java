import java.util.Date;

public class RandomizerUtility {
	public static void log(String... lines) {
		for (String line : lines) {
			System.out.println(new Date() + " " + line);
		}
	}
}
