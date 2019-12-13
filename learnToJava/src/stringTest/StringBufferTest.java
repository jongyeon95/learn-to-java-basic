package stringTest;

public class StringBufferTest {

	public static void main(String[] args) {
		String str1=new String("Hello");
		String str2=new String("Java");
		String result;
		StringBuffer buffer=new StringBuffer(str1);
		buffer.append(" "+str2);
		result=new String(buffer.toString());
		System.out.println(result);
		
	}

}
