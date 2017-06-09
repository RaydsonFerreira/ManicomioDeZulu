package resources;

import java.util.Collections;
import java.util.List;

public class Item {
    
    /** Attributes */
    private final String nome;
    private final String descricao;
    private List<Efeito> efeitos;
    private final boolean consumivel;
  
    /**
     * Operation
     *
     * @param 
     * @param 
     * @param 
     * @return 
     */
    public Item (String nome, String descricao, List<Efeito> efeitos, boolean consumivel) {
        this.nome = nome;
        this.descricao = descricao;
        for (Efeito efeito : efeitos) {
            this.efeitos.add(efeito);
        }
        this.consumivel = consumivel;
    }
    
    /**
     * Operation
     *
     * @return String
     */
    public String getNome () {
        return this.nome;
    }
    
    /**
     * Operation
     *
     * @return String
     */
    public String getDescricao () {
        return this.getDescricao();
    }
    
    /**
     * Operation
     *
     * @return List<Efeito>
     */
    public List<Efeito> getEfeitos () {
        return Collections.unmodifiableList(efeitos);
    }
    
    /**
     * Operation
     *
     * @return List<Efeito>
     */
    public boolean ehConsumivel () {
        return consumivel;
    }

}