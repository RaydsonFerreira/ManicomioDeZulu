package resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe Abstrata Ator - A generalização de todo personagem do jogo.
 *
 * Esta classe eh parte da aplicacao "World of Zuul - O Manicômio de Zulu".
 * "World of Zuul" é um jogo de aventura muito simples, baseado em texto.  
 *
 * Essa classe é o modelo padrão de todo personagem do jogo, desde os NPCs
 * inimigos até mesmo o próprio personagem principal. Todo personagem está
 * inserido em algum {@link Ambiente}, com exceção do {@link Cesar}, o
 * personagem principal.
 * 
 * @author  Filipe Barros Rodrigues
 * @version 2017.06.07
 */
public abstract class Ator {

    private String nome;
    private int hp;
    private Habilidade habilidade;
    private List<Item> bagagem;
    private boolean aliado;

    /**
     * Construtor padrão da classe Ator.
     *
     * @param nome O nome do Ator.
     * @param hp A quantidade de pontos de vida do Ator. Se for igual a zero,
     * está morto. Maior que zero, vivo. Menor que zero é imortal.
     * @param habilidade A habilidade especial do Ator.
     * @param bagagem Uma {@link java.util.List} de {@link Item}s portados pelo Ator.
     * @param aliado Se o Ator é aliado do protagonista ({@link Cesar}), true. Senão, false.
     */
    public Ator (String nome, int hp, Habilidade habilidade, List<Item> bagagem, boolean aliado) {
        this.nome = nome;
        this.hp = hp;
        this.habilidade = habilidade;
        this.bagagem = new ArrayList<>(bagagem);
        this.aliado = aliado;
    }
    
    /**
     * Operation
     *
     * @param 
     * @param 
     * @return boolean
     */
    private int getItemPorNome (String nomeDoItem) {
        int encontrado = -1;
        int i = 0;
        
        while (i < bagagem.size() && encontrado < 0) {
            if (nomeDoItem.equalsIgnoreCase((Item) bagagem.get(i).getNome())) {
                encontrado = i;
            } 
        }
        
        return encontrado;
    }
    
    /**
     * Operation
     *
     * @param 
     * @param 
     * @return boolean
     */
    public boolean darItem (String nomeDoItem, Ator alvo) {
        
    }
    /**
     * Operation
     *
     * @param 
     * @param 
     * @return boolean
     */
    public boolean usarItem ( String , Ator  )
    {
        // ## Implementation preserve start class method.usarItem@boolean@@@String@Ator 
        // ## Implementation preserve end class method.usarItem@boolean@@@String@Ator 
    }
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    public boolean coletarItem ( Item  )
    {
        // ## Implementation preserve start class method.coletarItem@boolean@@@Item 
        // ## Implementation preserve end class method.coletarItem@boolean@@@Item 
    }
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    public boolean usarHabilidade ( Ator  )
    {
        // ## Implementation preserve start class method.usarHabilidade@boolean@@@Ator 
        // ## Implementation preserve end class method.usarHabilidade@boolean@@@Ator 
    }
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    public boolean afetarHP ( int  )
    {
        // ## Implementation preserve start class method.afetarHP@boolean@@@int 
        // ## Implementation preserve end class method.afetarHP@boolean@@@int 
    }
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    abstract public boolean receberDano ( int  );
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    public boolean interagir ( Ator  )
    {
        // ## Implementation preserve start class method.interagir@boolean@@@Ator 
        // ## Implementation preserve end class method.interagir@boolean@@@Ator 
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getStatus (  )
    {
        // ## Implementation preserve start class method.getStatus@String@@ 
        // ## Implementation preserve end class method.getStatus@String@@ 
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getNome (  )
    {
        // ## Implementation preserve start class method.getNome@String@@ 
        // ## Implementation preserve end class method.getNome@String@@ 
    }
    /**
     * Operation
     *
     * @return int
     */
    public int getHP (  )
    {
        // ## Implementation preserve start class method.getHP@int@@ 
        // ## Implementation preserve end class method.getHP@int@@ 
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getDescricaoHabilidades (  )
    {
        // ## Implementation preserve start class method.getDescricaoHabilidades@String@@ 
        // ## Implementation preserve end class method.getDescricaoHabilidades@String@@ 
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getListaItens (  )
    {
        // ## Implementation preserve start class method.getListaItens@String@@ 
        // ## Implementation preserve end class method.getListaItens@String@@ 
    }
    /**
     * Operation
     *
     * @return String
     */
    public String getNomeHabilidade (  )
    {
        // ## Implementation preserve start class method.getNomeHabilidade@String@@ 
        // ## Implementation preserve end class method.getNomeHabilidade@String@@ 
    }
    /**
     * Operation
     *
     * @return boolean
     */
    public boolean taVivo (  )
    {
        // ## Implementation preserve start class method.taVivo@boolean@@ 
        // ## Implementation preserve end class method.taVivo@boolean@@ 
    }
    /**
     * Operation
     *
     * @return boolean
     */
    public boolean ehAliado (  )
    {
        // ## Implementation preserve start class method.ehAliado@boolean@@ 
        // ## Implementation preserve end class method.ehAliado@boolean@@ 
    }
    // ## Implementation preserve start class other.operations. 
    // ## Implementation preserve end class other.operations. 
}

// ## Implementation preserve start class closing. 
// ## Implementation preserve end class closing. 
