package symtable;

public class Symtable {

	  public EntryTable top; // apontador para o topo da tabela (mais recente)
	  public int scptr; // número que controla o escopo (aninhamento) corrente
	  public EntryClass levelup; // apontador para a entrada EntryClass de nível sup.
	  
	  public Symtable(){ // cria uma tabela vazia
		  top = null;
	      scptr = 0;
	      levelup = null;
	  }
	  
	  public Symtable(EntryClass up) { // cria tabela vazia apontando para nível sup.
		  top = null;
		  scptr = 0;
		  levelup = up;
	  }
	  
	  public void add(EntryTable x) {
		  x.next = top; // inclui nova entrada no topo
		  top = x;
		  x.scope = scptr; // atribui para a entrada o número do escopo
		  x.mytable = this; // faz a entrada apontar para a tabela à qual pertence
	  }
	  
	  public void beginScope() {
	      scptr++; // inicia novo aninhamento de variáveis
	  }
	  
	  public void endScope() {
	      while ((top != null) && (top.scope == scptr))
	          top = top.next; // retira todas as variáveis do aninhamento corrente

	      scptr--; // finaliza aninhamento corrente
	  }
	  
	  // Continua..
	  
	  
	  
	     
	  
}
