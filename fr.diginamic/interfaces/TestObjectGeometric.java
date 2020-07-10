package interfaces;

public class TestObjectGeometric implements ObjectGeometric {

	public static void main(String[] args) {
		
		ObjectGeometric[] objArray = new ObjectGeometric[2];
		
		objArray[0] = new Circle(3.0);
		objArray[1] = new Rectangle(12.0, 6.0);
		
		for (int i = 0; i < objArray.length; i++) {
			System.out.println("Type : " + objArray[i].getType() + " Perimeter is : " + objArray[i].perimeter() + " & Surface is : " + objArray[i].surface());
		}
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}	
}		

