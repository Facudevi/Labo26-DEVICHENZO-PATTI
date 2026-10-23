package endocrinologia;

public interface Tratable {
    void comprobarRequisitos() throws TratamientoInvalidoException;
    int costo();
    Tipo_Sangre conocerTipoSangre();
}