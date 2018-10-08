package co.proyectobase.myextra.model;

public class Target {

	private String name;
	private int row,col;
	
	
	public Target(String name) {
		this.name=name;
	}
	
	public static Target the(String name) {
		return new Target(name);
	}
	
	public Target called(String name) {
		this.name=name;
		return this;
	}
	
	public Target locatedBy(int row, int col) {
		this.row=row;
		this.col=col;
		return this;
	}

	public String getName() {
		return name;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
}	
	

