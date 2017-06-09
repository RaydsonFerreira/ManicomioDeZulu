package resources;

/**
 *
 * @author biiirl
 */
public enum Atributo {
    HP (0),
    CAPACIDADE (1),
    SANIDADE (2);
    
    private final int posicaoNaLista;
    
    Atributo (int posicaoNaLista) {
        this.posicaoNaLista = posicaoNaLista;
    }
    
    public int posicao () {
        return posicaoNaLista;
    }
    
}
