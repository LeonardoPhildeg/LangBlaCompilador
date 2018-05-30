package symtable;

//lista de EntryClass, usada para representar os tipos de uma lista
//de parâmetros
public class EntryRec extends EntryTable{
	
    public EntryTable type; // tipo de um objeto
    public int dim; // dimensão
    public EntryRec next; // apontador para o resto da lista
    public int cont; // número de elementos a partir daquele elemento

    // cria elemento
    public EntryRec(EntryTable p, int d, int c) {
        type = p;
        cont = c;
        dim = d;
        next = null;
    }
    
    // cria elemento e põe no início da lista
    public EntryRec(EntryTable p, int d, int c, EntryRec t) {
        type = p;
        cont = c;
        dim = d;
        next = t;
    }
    
    //Continua...

}
