
import io.Entrada;
import io.Saida;
import java.util.ArrayList;
import java.util.List;
import resources.Ambiente;


/**
 *Classe Comando - Fornece um conjunto de constantes.
 *
 * Esta classe eh parte da aplicacao "World of Zuul - O Manicômio de Zulu".
 * "World of Zuul" é um jogo de aventura muito simples, baseado em texto. 
 * 
 * @author  Raydson Ferreira Carlota
 * @version 2017.06.09
 */
public class ManicomioDeZulu {
    /** Attributes */
    private Entrada entrada;
    private Saida saida;
    private Ambiente ambiente;
    private Cesar protagonista;
    private EstadoDeJogo status;

    /**
     * Operation
     *
     * @return 
     */
    public ManicomioDeZulu () {
        
    }
    /**
     * Operation
     *
     */
    public void jogar () {

    }
    /**
     * Operation
     *
     */
    private void criarAmbientes () {
        Ambiente esquina_Fortran_Python, esquina_Fortran_Cobol, 
                esquina_Fortran_Lua, esquina_Fortran_Snobol,
                esquina_Smaltalk_Python, esquina_Smaltalk_Cobol, 
                esquina_Smaltalk_Lua, esquina_Smaltalk_Snobol,
                esquina_Haskell_Python, esquina_Haskell_Cobol, 
                esquina_Haskell_Lua, esquina_Haskell_Snobol,
                esquina_Prolog_Python, esquina_Prolog_Cobol, 
                esquina_Prolog_Lua, esquina_Prolog_Snobol;
        
        esquina_Fortran_Python = new Ambiente ("Esquina da rua Fortran com a rua Python");
        esquina_Fortran_Cobol = new Ambiente ("Esquina da rua Fortran com a rua Cobol");
        esquina_Fortran_Lua = new Ambiente ("Esquina da rua Fortran com a rua Lua");
        esquina_Fortran_Snobol = new Ambiente ("Esquina da rua Fortran com a rua Snobol");
        esquina_Smaltalk_Python = new Ambiente ("Esquina da rua Smalltalk com a rua Python");
        esquina_Smaltalk_Cobol = new Ambiente ("Esquina da rua Smalltalk com a rua Cobol");
        esquina_Smaltalk_Lua = new Ambiente ("Esquina da rua Smalltalk com a rua Lua");
        esquina_Smaltalk_Snobol = new Ambiente ("Esquina da rua Smalltalk com a rua Snobol");
        esquina_Haskell_Python = new Ambiente ("Esquina da rua Haskell com a rua Python");
        esquina_Haskell_Cobol = new Ambiente ("Esquina da rua Haskell com a rua Cobol");
        esquina_Haskell_Lua = new Ambiente ("Esquina da rua Haskell com a rua Lua");
        esquina_Haskell_Snobol = new Ambiente ("Esquina da rua Haskell com a rua Snobol");
        esquina_Prolog_Python = new Ambiente ("Esquina da rua Prolog com a rua Python");
        esquina_Prolog_Cobol = new Ambiente ("Esquina da rua Prolog com a rua Cobol");
        esquina_Prolog_Lua = new Ambiente ("Esquina da rua Prolog com a rua Lua");
        esquina_Prolog_Snobol = new Ambiente ("Esquina da rua Prolog com a rua Snobol");
        List<Ambiente>  ruaPython = new ArrayList<>();
        for (int i = 1; i <= 17; i++){
            String descricao = "Rua Python, " + (i*4 + 50);
            ruaPython.add(new Ambiente(descricao));
        }
    }
    /**
     * Operation
     *
     * @param 
     * @return boolean
     */
    private boolean processarComando (Comando comando) {
        
    }
    /**
     * Operation
     *
     */
    private void imprimirBoasVindas () {
        System.out.println("Bem Vindo ao Jogo \"World of Zuul - O Manicômio de Zulu\"."
                + "\n Este é um jogo no estilo Adventure em modo texto."
                + "\n\n Boa Sorte e não enlouqeça!!!");
    }
    /**
     * Operation
     *
     */
    private void imprimirAjuda () {
        System.out.println("Você está prestes a enlouquecer ");
    }
    /**
     * Operation
     *
     * @param 
     */
    private void irParaAmbiente (Comando comando){
    
    }
    /**
     * Operation
     *
     */
    private void exibirAmbienteAtual () {
        
    }
    /**
     * Operation
     *
     * @return boolean
     */
    private boolean sair () {
        return false;
    }
}