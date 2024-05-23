package ada.banco.api.entity.conta;

import ada.banco.api.entity.usuario.Usuario;
import java.util.Date;

//TODO - verificar utilidade entre valorPretendido e valorReal
public record Acao(Date data, Character tipo, Double valorPretendido, Double valorReal, Usuario usuarioOrigem, Usuario usuarioDestine, String observacao) {
}
