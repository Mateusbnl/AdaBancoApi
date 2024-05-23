package ada.banco.api.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrarClientePFRequestDto {

    private String cpf;
    private String nome;
    private String dataNascimento;

}
