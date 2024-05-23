package ada.banco.api.entity.usuario;

import ada.banco.api.enums.ClassificacaoEnum;
import java.math.BigInteger;

public class UsuarioPJ extends UsuarioBase  {
    public UsuarioPJ(BigInteger id, ClassificacaoEnum classificacao, String nome) {
        super(id, classificacao, nome);
    }
}
