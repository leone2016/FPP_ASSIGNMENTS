package prob1;

public class Driver {
	public static void main(String[] args) {
		Figure[] figures = {
				new HatMaker(),
				new HatMaker(),
				new VeeMaker(),
				new ParallelMaker(),
				new FaceMaker()
		};
		new Driver(figures);
	}

	public Driver(Figure[] figures) {
		final String SPACE = " ";
		for (Figure f : figures) {
			System.out.print(f.getFigure() + SPACE);
		}
	}
}
