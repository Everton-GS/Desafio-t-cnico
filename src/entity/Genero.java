public enum Genero {

    Masculino("masculino"),
    Feminino("feminino");

    private String genero;

    private Genero(String genero){
        this.genero=genero;
    }

    public String generoGet(){
        return genero;
    }

}
