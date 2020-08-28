package presenca;



public interface TADLista<E> {

	public abstract void set(int pos, E e);
	
	public abstract void addPrimeiro(E e);
	public abstract void addUltimo(E e);
	
	public abstract void addAntes(int pos, E e);
	public abstract void addApos(int pos, E e);//pos:posicao
	
	public abstract void remove(E e);
	public abstract void remove(int pos);
	
	public abstract E first();
	public abstract E last();
	
	public abstract E anterior(int pos);
	public abstract E posterior(int pos);
	
	//verificar se lista esta cheia ou vazia
	public abstract boolean cheio();
    public abstract boolean vazio();

    //esvaziar lista
    public abstract void limpaLista();
}
