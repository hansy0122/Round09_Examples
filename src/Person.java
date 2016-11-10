
public class Person {
	String name;
	String jumin;
	String tel;
	String adr;
	Person(){
		name="guest"; jumin="000000-0000000";tel="000-0000-0000";adr="주소 기재하지 않음";	
	}
	Person(String name){
		this();
		this.name=name;
	}
	
	Person(String name,String jumin){
		this(name);
		this.jumin=jumin;
	}
	Person(String name,String jumin,String tel){
		this(name,jumin);
		this.tel=tel;
	}
	Person(String name,String jumin,String tel, String adr){
		this(name,jumin,tel);
		this.adr=adr;
	}
	
	
	
	public static void main(String ar[]){
		Person x=new Person("한승엽","940122-1111111","010-0000-1234","종로구 창경궁로");
		System.out.println(x.adr);
		System.out.println(x.jumin);
		System.out.println(x.name);
		System.out.println(x.tel);
		
	}
}
