import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Entity.Produto;

public class App {
public static void main(String[] args) throws Exception {
    
    //Inserir entidade no arquivo CSV - Cadastrar dados relacionados à entidade definida na questão 1. Receber dados via teclado e os adicionar através de append a um arquivo CSV.
    public void Cadastrar(){

        int ler = 0;

        List<Produto> produtos = new ArrayList();

        Scanner scan = new Sacnner(System.in);

        while(ler != -1){
            System.out.println("Digite o id do produto: ");
            int id = scan.nextInt();
            System.out.println("Digite o nome do produto: ");
            String name = scan.nextLine();
            System.out.println("Digite o tipo do produto: ");
            String type = scan.nextLine();
            System.out.println("Digite o preço do produto: ");
            double price = scan.nextDouble();
            System.out.println("Digite a data de validade do produto: ");
            Date validityData = scan.nextLine();
            System.out.println("Digite o estoque do produto: ");
            HashMap<String, String> productStock = scan.nextLine();

            produtos.add(new Produto(id, name, type, price, validityData, productStock));

            System.out.println("Digite -1 para sair ou 0 para continuar: ");
            ler = scan.nextInt();
        }
        
        //Adicionar os produtos a lista
        Produto.adicionar(new Produto(0, null, null, 0, null, null));

        //Escrever a lista de produtos no arquivo CSV
        BufferedWriter write = new BufferedWriter(new FileWriter("Produto.csv", True));
        StatefulBeanToCsv<Produto> beanToCsv = new StatefulBeanToCsvBuilder(write).build();
        beanToCsv.write(produtos);
        write.flush();
        write.close();
    }

    // Mostrar a quantidade de entidades existentes no arquivo CSV. Mesmo que você saia da aplicação e a reexecute futuramente, esta funcionalidade deve mostrar a real quantidade
    // de entidades existentes no arquivo CSV, mesmo que dados sejam inseridos ou removidos no arquivo CSV através de um editor de texto externo à sua aplicação.
    // public void f2(){

    // }

    // //Converter os dados do arquivo CSV para gerar um arquivo JSON e um arquivo XML usando a biblioteca Jackson.
    // public void f3(){

    // }
    
    // //não declarado no documento do moodle
    // public void f4(){

    // }

    // //Compactar o arquivo CSV e gerar um novo arquivo de mesmo nome, mas com a extensão ZIP. Deve-se usar a API Java para realizar a compressão.
    // public void f5(){

    // }

    // //Mostrar na tela o hash SHA256 do arquivo CSV. Use a API Java para calcular o hash.
    // public void f6(){
        
    // }

    }  
}
