package resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ambiente
// ## Implementation preserve start class extends. 
// ## Implementation preserve end class extends. 

// ## Implementation preserve start class inheritence. 
// ## Implementation preserve end class inheritence. 

{
    /** Attributes */
    private String descricao;
    private HashMap<String, Ambiente> saidas;
    private List<Item> itens;
    private List<Ator> atores;
    private boolean hostil;
    /**
     * Operation
     *
     * @param 
     * @param 
     * @return 
     */
    public Ambiente (String descricao) {
        this.descricao = descricao;
    }
    /**
     * Operation
     *
     * @param 
     * @param 
     */
    public void ajustarSaidas (String comando, Ambiente ambiente) {
    }
    /**
     * Operation
     *
     * @return String
     */
    
    public String getDescricao () {
        return this.descricao;
    }
    /**
     * Operation
     *
     * @param direcao
     * @return Ambiente
     */
    public Ambiente getAmbiente (String direcao) {
        return saidas.get(direcao);
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getListaItens (){
        String lista = "" ;
        for (Item item : itens) {
            lista += item.getNome() + "\n";
        }
        lista += "\n";
        return lista;
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getListaAtores () { 
        String lista = "" ;
        for (Ator ator : atores) {
            lista += ator.getNome() + "\n";
        }
        lista += "\n";
        return lista;
    }
    /**
     * Operation
     *
     * @param 
     * @return Item
     */
    public Item recolherItem ( String  ) {
    
    }
    /**
     * Operation
     *
     * @param 
     */
    public void colocarItem ( Item  )
    {
        // ## Implementation preserve start class method.colocarItem@void@@@Item 
        // ## Implementation preserve end class method.colocarItem@void@@@Item 
    }
    /**
     * Operation
     *
     * @param 
     * @return Ator
     */
    public Ator selecionarAtor ( String  )
    {
        // ## Implementation preserve start class method.selecionarAtor@Ator@@@String 
        // ## Implementation preserve end class method.selecionarAtor@Ator@@@String 
    }
    public boolean ehAmbienteHostil(){
        return this.hostil;
    }
}
