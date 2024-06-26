package ada.banco.api.entity.conta;

import ada.banco.api.entity.usuario.Usuario;

import java.math.BigInteger;
import java.util.Date;

public class ContaCorrenteImpl extends ContaBase implements ContaCorrente {
    public ContaCorrenteImpl(int id, BigInteger idUsuario) {
        super(id, idUsuario);
    }

    @Override
    public void investimento(Double valorInvestimento, Usuario usuarioOrigem, Usuario usuarioDestino) {
        historicoDeAcoes.add(new Acao(new Date(),'D',valorInvestimento,valorInvestimento,usuarioOrigem,usuarioDestino,"Debito para Investimento"));
    }
}
