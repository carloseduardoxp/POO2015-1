package state.enumeracao;

import java.util.List;

import state.util.No;

public enum Cor {
	BRANCO {
		public void busca(No no, List<No> list) {
			//no.setCor(CINZA, list);
		}
	},
	CINZA {
		void assumiu(No no, List<No> list) {
			for (No adj : no.getAdjacentes())
				adj.buscaProfundidade(list);
			//no.setCor(PRETO, list);
		}
	},
	PRETO {
		void assumiu(No no, List<No> list) {
			list.add(no);
		}
	};
	
	
	void busca(No no, List<No> list) {
	}

	void assumiu(No no, List<No> list) {
	}
}
