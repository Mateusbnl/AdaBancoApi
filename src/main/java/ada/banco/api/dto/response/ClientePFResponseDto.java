package ada.banco.api.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClientePFResponseDto {

    private String cpf;
    private String nome;
    private String dataNascimento;

    private List<ContaResponseDto> contas;

}
