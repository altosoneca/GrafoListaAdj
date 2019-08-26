import java.util.ArrayList;

public class Grafo {
	ArrayList<Aresta> vetor;

	public Grafo(int n) {
		vetor = new ArrayList<Aresta>(n);
	}

	public void addAresta(String indice, String destino) {
		for (int i = 0; i < vetor.size(); i++) {
			if (vetor.get(i).getIndice().compareTo(indice) == 0) {
				Aresta a = new Aresta(destino);
				vetor.get(i).addSucessor(a);
				return;
			}
		}
		Aresta a = new Aresta(indice);
		a.addSucessor(new Aresta(destino));
		vetor.add(a);
	}

	public void showSucessores() {
		for (int i = 0; i < vetor.size(); i++) {
			System.out.print("Sucessores do vértice " + vetor.get(i).getIndice().toUpperCase() + ": ");
			vetor.get(i).showSucessores();
			System.out.println();
		}
	}

	public boolean arcoExiste(String a, String b) {
		for (int i = 0; i < vetor.size(); i++) {
			if (vetor.get(i).getIndice().equals(a)) {
				if (vetor.get(i).arcoExiste(b)) {
					return true;
				}
			} else if (vetor.get(i).getIndice().equals(b)) {
				if (vetor.get(i).arcoExiste(a)) {
					return true;
				}
			}

		}
		return false;

	}

	public ArrayList<Aresta> getVetor() {
		return vetor;
	}

}
