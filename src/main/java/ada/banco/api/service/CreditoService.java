package ada.banco.api.service;

import ada.banco.api.entity.conta.Conta;
import ada.banco.api.entity.usuario.Usuario;


public class CreditoService {
    //TODO - criar classes ValueObject para diminuir a quantidade de parametros
    public static void realizarCredito(Conta contaDestino, Double valorCredito, Usuario usuarioOrigem, Usuario usuarioDestino, String obs){
        //TODO - Sera implementado um array de Validadores para garantir a consistencia do deposito (CONTA ATIVA, VALIDA, ETC)
        contaDestino.deposito(valorCredito,usuarioOrigem,usuarioDestino, obs);
    }
}
