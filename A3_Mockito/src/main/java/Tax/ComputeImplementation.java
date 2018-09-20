package Tax;

public class ComputeImplementation implements ICompute {

	ICompute obj;
	public int square(int n1) {
		return obj.square(n1);
	}
	public int multiply (int n1, int n2) {
	return obj.multiply (n1,n2);
}
	public void setobj(ICompute obj ) {
	this.obj = obj;
	}
}
