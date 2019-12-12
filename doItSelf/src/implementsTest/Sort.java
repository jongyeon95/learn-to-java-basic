package implementsTest;

public interface Sort {
	void ascending(int[] a);
	void descending(int [] a);
	default void description() {
		System.out.println("이것은  숫자를 정렬하는 알고리즘 입니다");
	};

}
