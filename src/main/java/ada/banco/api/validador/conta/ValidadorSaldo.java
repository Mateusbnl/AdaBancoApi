package ada.banco.api.validador.conta;

public class ValidadorSaldo {
    public static boolean validaSaldo(Double saldoConta, Double valorDebito){
        if(valorDebito > saldoConta)
            return false;
        return true;
    }
}
