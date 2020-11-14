// Figura 5.11: AutoPolicy.java
// Classe que representa uma apólice de seguro de automóvel.

public class AutoPolicy {

    private int contaNumero; // número da conta da apólice
    private String marcaEModelo; // carro ao qual a apólice é aplicada
    private String estado; //Abreviatura do estado

    // construtor
    public AutoPolicy(int contaNumero, String marcaEModelo, String estado)
    {
        this.contaNumero = contaNumero;
        this.marcaEModelo = marcaEModelo;
        this.estado = estado;
    }

    // defina o número da conta
    public void setNumeroConta(int contaNumero)
    {
        this.contaNumero = contaNumero;
    }

    // retorna o número da conta
    public int getNumeroConta()
    {
        return contaNumero;
    }

    // configura a marca e modelo
    public void setMarcaEModelo(String marcaEModelo)
    {
        this.marcaEModelo = marcaEModelo;
    }

    // retorna marca e modelo
    public String getMarcaEModelo()
    {
        return marcaEModelo;
    }

    // define o estado
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    // retorna estado
    public String getEstado()
    {
        return estado;
    }

    // método predicado é retornado se o estado tem seguros "sem culpa"
    public boolean eEstadoSemCulpa()
    {
        boolean estadoSemCulpa;

        //determina se o estado tem seguros de automóvel "sem culpa"
        switch(getEstado())
        {
            case "CE": case "SP": case "BA": case "RJ":
                estadoSemCulpa = true;
                break;
            default:
                estadoSemCulpa = false;
                break;

        }

        return estadoSemCulpa;

    }
    
} // fim da classe AutoPolicy
