package ada.banco.api.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrarClientePJRequestDto {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

}
