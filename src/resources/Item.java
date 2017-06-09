package resources;

import java.util.Collections;
import java.util.List;

public class Item {
    
    /** Attributes */
    private String nome;
    private String descricao;
    private List<Efeito> efeitos;
  
    /**
     * Operation
     *
     * @param 
     * @param 
     * @param 
     * @return 
     */
    public Item (String nome, String descricao, List<Efeito> efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        for (Efeito efeito : efeitos) {
            this.efeitos.add(efeito);
        }
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

}