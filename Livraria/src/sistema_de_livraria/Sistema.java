package sistema_de_livraria;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Livro> livros = new ArrayList<>();
	private List<Autor> autores = new ArrayList<>();
	
	public void cadastrarLivros(Livro livro) {
		livros.add(livro);
		
	}
	
	public void cadastrarAutor(Autor autor) {
		autores.add(autor);
	}
	
	

}
