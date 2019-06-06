import java.util.ArrayList;

public class No {
	private int id;
	ArrayList<No> proximo = new ArrayList<No>();

	public void addNo(No novo) {

		proximo.add(novo);
	}

	public void colocarNoSobreNo(int id, No no) {
		for (No n : proximo) {
			if (n.getId() == id) {
				n.addNo(no);
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}