package robo;

/**
 *
 * @author Laura
 */
public class Principal {

    public static void main(String[] args) {
        TestarRobo teste1 = new TestarRobo();
        teste1.definirAmbiente();
        teste1.iniciarRobo();
        teste1.menu();
    }
}
