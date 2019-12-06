package StaticInnerClass;

import MemberInnerClass.Other;
import MemberInnerClass.Outer;

public class test {
	public static void main(String[] args) {
		Other.otherShow();
		
		System.out.println("--------------------\n\n");
		Outer outer = new Outer();
		outer.outerShow();
		
	}
}
