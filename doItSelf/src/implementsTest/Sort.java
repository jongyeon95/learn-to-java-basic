package implementsTest;

public interface Sort {
	void ascending(int[] a);
	void descending(int [] a);
	default void description() {
		System.out.println("�̰���  ���ڸ� �����ϴ� �˰��� �Դϴ�");
	};

}
