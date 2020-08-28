package presenca;

public class ListaAlocada implements TADLista<Object> {
	private Object[] list = new Object[5];
	private int ponto;
	
	public ListaAlocada() {
		ponto = -1;
	}

	@Override
	public void set(int pos, Object e) {
		
		if(pos >ponto+1 || pos <0) {
			System.out.println("Exceção posição alem do limite estipulado");
		}
		list[pos]=0;
	}

	@Override
	public void addPrimeiro(Object e) {
		if(cheio()){
			System.out.println("lista cheia!!!");
		}else {
			for (int i=ponto; i>=0; i--) {
				list[i+1]=list[i];
			}
			ponto++;
			list[0]=e;
		}
	}

	@Override
	public void addUltimo(Object e) {
		if(cheio()) {
			System.out.println("lista cheia!!!");
		}
		list[++ponto]=e;
	}

	@Override
	public void addAntes(int pos, Object e) {
		if(cheio()) {
			System.out.println("lista cheia!!!");
		}else {
			for(int i=ponto; i>=pos-1;i++) {
				list[i+1]=list[i];
			}
			list[pos-1]=e;
			ponto++;
		}

		
	}

	@Override
	public void addApos(int pos, Object e) {
		if(cheio()) {
			System.out.println("lista cheia!!!");
		}else {
			for (int i = ponto; i>pos; i--) {
				list[i+1]=list[i];
			}
			list[pos+1]=e;
			ponto++;
		}
	}

	@Override
	public void remove(Object e) {
        if (vazio()) {
            System.out.println("lista está vazia");
        }else {
    		for(int i=0; i<=ponto; i++) {
    			if(list[i]==e) {
    				for (int j = i; j<ponto; j++) {
    					list[j]=list[j+1];
    				}
    				break;
    			}
    		}
    		list[ponto++]=null;
        }
	}

	@Override
	public void remove(int pos) {
		if(vazio()) {
			System.out.println("Lista vazia");
		}else {
			for (int i=pos; i<ponto; i++) {
				list[i]=list[i+1];
			}
			list[ponto--]=null;
		}

	}

	@Override
	public Object first() {
        if (vazio()) {
            return null;
        }else {
            for (int i = 0; i < ponto; i++) {
                list[i] = list[i + 1];
            }
            list[ponto--] = null;
        }
        return list;
	}

	@Override
	public Object last() {
        if (vazio()) {
            System.out.println("Empty List.");
            return null;
        }
        list[ponto--] = null;
        return list;
	}

	@Override
	public Object anterior(int pos) {
		ponto--;
		return list[ponto--];
	}

	@Override
	public Object posterior(int pos) {
		ponto--;
		return list[ponto++];
	}

	@Override
	public boolean cheio() {
		return ponto == list.length-1;
	}

	@Override
	public boolean vazio() {
		return ponto == -1;
	}

	@Override
	public void limpaLista() {
		int i =0;
		while(list[i]!=null) {
			list[i]=null;
		}
		ponto=-1;
	}
	
	
}
