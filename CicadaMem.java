package tushar;

class Member { 
	private int memberPrn;
	private String memberName;
	public Member(int memberPrn, String memberName) {
		super();
		this.memberPrn = memberPrn;
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberPrn+ " "+memberName;
	}		
}
public class CicadaMem {
	public static void main(String[] args) {
		Member first = new Member(115, "Shubham koli");
		System.out.println(first);
	}
}
