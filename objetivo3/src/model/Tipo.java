package model;

public enum Tipo {
    //atendido, pendente, cancelado

    A("Atendido"),P("Pendente") , C("Cancelado");

    public String status;

     Tipo(String status){
         this.status = status;
     }

    @Override
    public String toString() {
        return "\nTipo{" +
                "status='" + status + '\'' +
                '}';
    }
}
