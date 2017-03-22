
public class TestSpellChecker {

	public static void main(String[] args) {
		LinuxWords lw = new LinuxWords();
		boolean result = lw.checkSpelling("Linux");
		System.out.println(result);
		
		System.out.println(lw.checkSpelling("Sunshine"));
		System.out.println(lw.checkSpelling("lollipops"));
		System.out.println(lw.checkSpelling("kitten"));
		System.out.println(lw.checkSpelling("unitcorns"));
		System.out.println(lw.checkSpelling("rainbowz"));

	}

}
