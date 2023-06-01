public class Lembrete { // Classe lembrete
    private String nome; // Atributo nome da classe lembrete 
    private String data; // Atributo data da classe lembrete 

    public Lembrete(String nome, String data) { //Construtor da classe lembretes 
        this.nome = nome; // Atributo nome
        this.data = data; // Atributo data 
    }

    public String getNome() { // Método getNome
        return nome; // retorno do método getNome
    }

    public String getData() { // Método getData
        return data; // retorno do método getData
    }

    public void setData(String data) { // Método setData
        this.data = data; // retorno do método setData
    }

    public void setNome(String nome) { // Método setNome
        this.nome = nome; // retorno do método setNome
    }

    @Override
    public String toString() { // Método toString 
        return "Nome do lembrete : " + nome + ", Data do lembrete: " + data; // Retorno do toString para exibir o lembrete e a data
    }
}
