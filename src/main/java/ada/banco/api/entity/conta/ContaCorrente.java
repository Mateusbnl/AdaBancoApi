package ada.banco.api.entity.conta;

import ada.banco.api.entity.usuario.Usuario;


public interface ContaCorrente extends Conta{

    void investimento(Double valor, Usuario usuarioOrigem, Usuario usuarioDestino);
}
