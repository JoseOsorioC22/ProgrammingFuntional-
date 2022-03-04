package co.osorio.pruebaEntrevista;

public class Registro {


    public Registro(int idRegistro, Pais pais, Farmaceutica farmaceutica) {
        this.idRegistro = idRegistro;
        this.pais = pais;
        this.farmaceutica = farmaceutica;
    }

    public  Registro()
    {

    }
    @Override
    public String toString() {
        return "co.osorio.pruebaEntrevista.Registro{" +
                "idRegistro=" + idRegistro +
                ", pais=" + pais +
                ", farmaceutica=" + farmaceutica + "} \n";
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public void setFarmaceutica(Farmaceutica farmaceutica) {
        this.farmaceutica = farmaceutica;
    }

    private int idRegistro;
    private Pais pais;
    private Farmaceutica farmaceutica;


}
