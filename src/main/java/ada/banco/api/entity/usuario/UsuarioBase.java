package ada.banco.api.entity.usuario;
import ada.banco.api.entity.conta.Conta;
import ada.banco.api.enums.ClassificacaoEnum;
import ada.banco.api.enums.StatusUsuarioEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_pessoa", discriminatorType = DiscriminatorType.STRING, length = 10)
public abstract class UsuarioBase  {

    @Id
    protected BigInteger id;

    @Enumerated(EnumType.STRING)
    protected ClassificacaoEnum classificacao;
    protected String nome;
    protected Date dataCadastro;
    protected List<Conta> contas;
    protected StatusUsuarioEnum statusUsuario;


}
