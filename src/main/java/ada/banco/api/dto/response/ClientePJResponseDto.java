package ada.banco.api.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientePJResponseDto {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

}
