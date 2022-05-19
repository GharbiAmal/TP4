package beans;

public class RandomBean {
	
	private double nb;

	public RandomBean() {
		setNb(0);
	}
	public double getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}
	public double CalculRandom(double nb){
		return Math.random()* nb;
	}
	

}
