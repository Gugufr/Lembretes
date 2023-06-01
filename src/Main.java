import java.util.*; //Importação da biblioteca util que importa grande parte das bibliotecas do java

public class Main {
    
    private static List<Lembrete> lembretes = new ArrayList<>();  // Utilização da estrutura de dados lista que já é pronta do JAVA 
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in); // Classe Scanner para ler do Teclado
        int opcao; // Declaração da variável opção que será usada na estrutura de dados switch case para o menu

        do{ // Menu usando o laço de repetição do-while
            System.out.println(" Digite 1 para inserir um lembrete\n Digite 2 para visualizar os seus lembretes\n Digite 3 para apagar um lembrete\n Digite 4 para sair do programa ");
            opcao= leitura.nextInt(); 
            if(opcao==1){
                adicionarLembrete();
            }
            else if(opcao==2){
                listarLembretes();
            }
            else if(opcao==3){
                apagarLembrete();
            }
        }while(opcao!=4); 

    }

    private static void adicionarLembrete() { // Método de adicionar um lembrete 
        Scanner leitura = new Scanner(System.in); 
        String nome, data;

        System.out.println("Digite o nome do lembrete:");
        nome = leitura.next();

        System.out.println("Digite a data no formato: dd/mm/yyyy");
        data = leitura.next();

        Lembrete lembrete = new Lembrete(nome, data);
        lembretes.add(lembrete);
        System.out.println("Seu lembrete foi adicionado com sucesso");
    }

    private static void listarLembretes() { // Método de listar um lembrete 
        if (lembretes.isEmpty()) { // isEmpty verifica se a variável lembretes tem valor
            System.out.println("Não existem lembretes para serem exibidos.");
        } else {
            for (Lembrete lembrete : lembretes) {
                System.out.println(lembrete);
            }
        }
    }

    private static void apagarLembrete() { // Método para apagar um lembrete 
        Scanner leitura = new Scanner(System.in); 
        boolean encontrado;
        String nome; 
      
        if (lembretes.isEmpty()) { // isEmpty verifica se a variável lembretes tem valor
            System.out.println("Não existem lembretes para serem apagados.");
        } else {
            System.out.println("Digite o nome do lembrete para ser apagado: ");
            nome = leitura.next();
            encontrado = false; 

            for (Lembrete lembrete : lembretes) {
                if (lembrete.getNome().equals(nome)) { // .equals compara variáveis de tipo String
                    lembretes.remove(lembrete);
                    encontrado = true; // validar se o lembrete foi encontrado. 
                    System.out.println("Lembrete removido com sucesso");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Lembrete não encontrado.");
            }
        }
    }
}





    

