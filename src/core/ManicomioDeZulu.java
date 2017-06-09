
import io.Entrada;
import io.Saida;
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
        
        esquina_Fortran_Python = new Ambiente ();
        esquina_Fortran_Cobol,
        esquina_Fortran_Lua,
        esquina_Fortran_Snobol,
        esquina_Smaltalk_Python,
        esquina_Smaltalk_Cobol, 
        esquina_Smaltalk_Lua,
        esquina_Smaltalk_Snobol,
        esquina_Haskell_Python,
        esquina_Haskell_Cobol, 
        esquina_Haskell_Lua,
        esquina_Haskell_Snobol,
        esquina_Prolog_Python, 
        esquina_Prolog_Cobol, 
        esquina_Prolog_Lua,
        esquina_Prolog_Snobol
        
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
    
    }
    /**
     * Operation
     *
     */
    private void imprimirAjuda () {

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