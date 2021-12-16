package lab9.interfaces;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangle1 = new Triangle(2, 2, 2);
		Triangle triangle2 = new Triangle(4, 4, 6);

		triangle1.setColor("yellow");
		triangle1.setFilled(true);
		
		triangle2.setColor("blue");
		triangle2.setFilled(false);
		
		System.out.println(triangle1.toString());
		System.out.println();
		System.out.println(triangle2.toString());
		
		System.out.println("Triangle 1 < Triangle 2: " + triangle1.lessThan(triangle2));
		System.out.println("Triangle 1 > Triangle 2: " + triangle1.greaterThan(triangle2));
		System.out.println("Triangle 1 = Triangle 2: " + triangle1.equals(triangle2));


	}

}
