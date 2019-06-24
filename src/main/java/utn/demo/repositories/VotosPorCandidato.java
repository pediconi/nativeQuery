package utn.demo.repositories;

public interface VotosPorCandidato {
    String getNombre();
    String getCantidadVotos();          // se machean con los campos de la query (deben coincidir los nombres)
    Integer getDni();
    Integer getEdad();
}
