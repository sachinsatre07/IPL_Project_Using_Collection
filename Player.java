package IPL;

public class Player {
	
	private String name;
	private int jnumber;
	private String tname;
	private int runs;
	private int wickets;

	public Player() {
			super();
		}

	public Player(String name, int jnumber, String tname, int runs, int wickets) {
			super();
			this.name = name;
			this.jnumber = jnumber;
			this.tname = tname;
			this.runs = runs;
			this.wickets = wickets;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJnumber() {
		return jnumber;
	}

	public void setJnumber(int jnumber) {
		this.jnumber = jnumber;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return " name=" + name + ", jnumber=" + jnumber + ", tname=" + tname + ", runs=" + runs + ", wickets=" + wickets
				+ "";
	}


}
