package ada.banco.api.entity.conta;

import java.math.BigInteger;

public class ContaInvestimentoImpl extends ContaBase implements Conta {

    public ContaInvestimentoImpl(int id, BigInteger idUsuario) {
        super(id, idUsuario);
    }
}
