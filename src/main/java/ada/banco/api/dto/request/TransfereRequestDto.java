package ada.banco.api.dto.request;

import java.math.BigDecimal;

public class TransfereRequestDto {

    private String numeroContaOrigem;
    private String numeroContaDestino;
    private BigDecimal valor;

    public String getNumeroContaOrigem() {
        return numeroContaOrigem;
    }

    public void setNumeroContaOrigem(String numeroContaOrigem) {
        this.numeroContaOrigem = numeroContaOrigem;
    }

    public String getNumeroContaDestino() {
        return numeroContaDestino;
    }

    public void setNumeroContaDestino(String numeroContaDestino) {
        this.numeroContaDestino = numeroContaDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TransfereRequestDto{" +
                "numeroContaOrigem='" + numeroContaOrigem + '\'' +
                ", numeroContaDestino='" + numeroContaDestino + '\'' +
                ", valor=" + valor +
                '}';
    }
}
