import java.util.LinkedList;

public class Aresta {
	private String indice;
	private LinkedList<Aresta> Sucessor;

	public Aresta(String i) {
		Sucessor = new LinkedList<Aresta>();
		this.indice = i;
	}

	public String getIndice() {
		return this.indice;
	}

	public int getSize() {
		return Sucessor.size();
	}

	public void addSucessor(Aresta a) {
		Sucessor.add(a);
	}

	public boolean arcoExiste(String b) {
		for (int i = 0; i < Sucessor.size(); i++) {
			if (Sucessor.get(i).getIndice().equals(b)) {
				return true;
			}
		}
		return false;
	}

	public LinkedList<Aresta> getLinkedList() {
		return Sucessor;
	}

	public void showSucessores() {
		for (int i = 0; i < Sucessor.size(); i++) {
			System.out.print(Sucessor.get(i) + " / ");
		}
	}

	public String[] getSucessores() {
		String[] m = new String[Sucessor.size()];
		for (int i = 0; i < Sucessor.size(); i++) {
			m[i] = Sucessor.get(i).getIndice();
		}
		return m;
	}

	public String toString() {
		return "Índice= " + indice;
	}
}
