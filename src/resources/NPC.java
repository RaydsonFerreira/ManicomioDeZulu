/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.List;

/**
 *
 * @author Filipe Barros Rodrigues
 */
public class NPC extends Ator {

    public NPC(String nome, int hp, int capacidade, Habilidade habilidade, List<Item> bagagem, boolean aliado) {
        super(nome, hp, capacidade, habilidade, bagagem, aliado);
    }

    @Override
    public Resultado afetarAtributo(int atributo, int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
