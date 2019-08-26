import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Utilitarios {

	public void gravarArquivoLLAdj(Grafo G) throws IOException {
		ArrayList<Aresta> vetorArestas = G.getVetor();
		FileWriter arq = new FileWriter("src/ListaAdj.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.print(G.getVetor().size());
		gravarArq.println();
		for (int i = 0; i < vetorArestas.size(); i++) {
			gravarArq.printf(vetorArestas.get(i).getIndice() + "|");
			for (int j = 0; j < vetorArestas.get(i).getSize(); j++) {
				gravarArq.printf(vetorArestas.get(i).getLinkedList().get(j).getIndice());

			}
			gravarArq.println();

		}

		arq.close();

	}

	public void lerArquivoMatriz(String txt) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader(txt));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
	}

	public static Object getKeyFromValue(Map hm, Object value) {
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}
}
