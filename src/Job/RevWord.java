package Job;

public class RevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				String sen = "Java is fun";
				char[] ch = sen.toCharArray();
				int start = 0;
				for (int i = 0; i <= ch.length; i++) {
					if (i == ch.length || ch[i] == ' ') {
						int end = i - 1;

						while (start < end) {
							char temp = ch[start];
							ch[start] = ch[end];
							ch[end] = temp;
							start++;
							end--;
						}

						start = i + 1;
					}
				}

				System.out.println(new String(ch));

	}

}
