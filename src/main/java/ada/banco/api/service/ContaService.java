package ada.banco.api.service;

import java.math.BigInteger;
import ada.banco.api.entity.conta.*;
import ada.banco.api.entity.usuario.Usuario;

public class ContaService {
    //TODO - id provisorio para retirarda em proximas evolucoes
    public static Conta criarContaCorrente(int id, BigInteger idUsuario){
        return new ContaCorrenteImpl(id,idUsuario);
    }

    public static Conta criarContaPoupanca(int id, BigInteger idUsuario){
        return new ContaPoupancaImpl(id,idUsuario);
    }

    public static Conta criarContaInvestimento(int id, BigInteger idUsuario){ return new ContaInvestimentoImpl(id,idUsuario); }

    public static Double consultaSaldo(Conta conta){
        return conta.saldo();
    }
}
