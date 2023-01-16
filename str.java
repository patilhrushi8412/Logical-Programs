package mock;

public class str {
	public static void main(String[] args) {
		String str = "welcome to techno elavate";
		System.out.println(str);
		String[] spl = str.split(" ");
		String temp = "";
		for (int i = 0; i < spl.length; i++) {
			for (int j = 0; j < spl[i].length(); j++) {
				if (j==0) {
					continue;
				}
				temp=temp+spl[i].charAt(j);
			}
			temp=temp+" ";
		}
		System.out.println(temp);
	}
}
