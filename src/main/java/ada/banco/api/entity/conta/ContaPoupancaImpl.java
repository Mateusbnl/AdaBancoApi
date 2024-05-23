package ada.banco.api.entity.conta;


import java.math.BigInteger;

public class ContaPoupancaImpl extends ContaBase implements Conta {

    public ContaPoupancaImpl(int id, BigInteger idUsuario) {
        super(id, idUsuario);
    }
}
