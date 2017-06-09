package resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static resources.Resultado.*;

public class Habilidade {

    private String nome;
    private List<Efeito> efeitos;

    public Habilidade (String nome, List<Efeito> efeitos) {
        this.nome = nome;
        this.efeitos = new ArrayList<>(efeitos);
    }
    
    /**
     * Operation
     *
     * @return String
     */
    public String getNome () {
        return nome;
    }
    
    /**
     * Operation
     *
     * @return String
     */
    public List<Efeito> getEfeitos () {
        return Collections.unmodifiableList(efeitos);
    }

}