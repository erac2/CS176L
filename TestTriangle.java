package lab9.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();

		Triangle tri1 = new Triangle(20, 20, 20);
		triangles.add(tri1);
		
		Triangle tri2 = new Triangle(210, 210, 210);
		triangles.add(tri1);
		
		Triangle tri3 = new Triangle(120, 120, 120);
		triangles.add(tri1);
		
		Triangle tri4 = new Triangle(40, 40, 40);
		triangles.add(tri1);
		
		Triangle tri5 = new Triangle(100, 100, 100);
		triangles.add(tri1);
		
		Collections.sort(triangles);

		System.out.println(triangles.toString());

	}

}
