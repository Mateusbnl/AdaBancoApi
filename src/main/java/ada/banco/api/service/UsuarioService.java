package ada.banco.api.service;

import ada.banco.api.entity.conta.*;
import ada.banco.api.entity.usuario.*;
import ada.banco.api.enums.ClassificacaoEnum;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;


@Service
public class UsuarioService {
    //TODO - retirar id, provisorio para testes e na proxima evolucao retirar
    //TODO - TALVEZ criar factory para criacao de Usuarios
    public UsuarioBase criarUsuario(BigInteger idUsuario, ClassificacaoEnum classificacao, String nome){
        UsuarioBase novoUsuario;
        Conta contaCorrente;
        if(classificacao.equals(ClassificacaoEnum.PF)){
            contaCorrente = ContaService.criarContaCorrente(1,idUsuario);
            novoUsuario = new UsuarioPF(idUsuario,classificacao,nome);
            novoUsuario.addConta(contaCorrente);
            return novoUsuario;
        }
        if(classificacao.equals(ClassificacaoEnum.PJ)){
            contaCorrente = ContaService.criarContaCorrente(1,idUsuario);
            novoUsuario = new UsuarioPJ(idUsuario,classificacao,nome);
            novoUsuario.addConta(contaCorrente);
            return novoUsuario;
        }
        return null;
    }

    public Conta retornaContaDeUsuarioPorId(UsuarioBase usuario, int idConta){
        for(Conta conta: usuario.getContas()){
            if(conta.getId() == idConta){
                return conta;
            }
        };
        return null;
    }

    public List<UsuarioBase> listarTodos(){

    }
}
