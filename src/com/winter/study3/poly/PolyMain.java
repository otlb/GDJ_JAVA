package com.winter.study3.poly;

public class PolyMain {
	
	public static void main(String[]args) {
		Child1 child1 = new Child1();
		child1.num=20;
		child1.p1();
		child1.c1();
		
		
		Child2 child2 = new Child2();
		child2.num=30;
		
		
		//상속관계
		Parent p = child1;
		System.out.println(p.num);
		p.p1();
		
		//p.c1(); 불가능 왜냐면 Parent가 알고 있는 것만 동작 가능하기 떄문
		//그래서 Child1타입으로 다시 변경해줘야함
		
		child1 = (Child1)p;
		//이유는 Parent타입은 Child1과 Child2타입을 즉 2개의 자식타입을 가지고있기때문에
//		c1메서드를 가지고있는 Child1타입으로 변경해줘야함
		
	}

}
