package d3031;

public class AccessModifierStudy {

	//자기 자신의 클래스에서만 접근 가능
	private int privateValue;
	
	//동일한 패키지나 파생클래스 에서만 접근 가능(다른 패키지 안에서 extend 하면 사용 가능 extends AccessModifierStudy)
	protected int protectedValue;
	
	//모든 패키지에서 접근 가능
	public int publicValue;
	
	//같은 패키지 안에서만 접근 가능(extend 해도 사용 불가), 변수 앞에 아무것도 정의하지 않으면 default가 붙는다
	int defaultValue;
}
