package trabalho1;

import java.util.Scanner;

public class trabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int qtdClientes=0 ;                            //Defini algumas das vari�veis do c�digo0
		int clientes=0 ;
		int seletorDoMenu ;
		int qtdProdutos=0 ;
		int produtos=0 ;
		int alterarDados;
		int alterarDadosProduto;
		
		int qtdEstoque[] = new int [200];                         //Defini os vetores que ser�o usados nas cases do switch
		int valorCompra[] = new int [200];
        String porcentagemLucro[] = new String [200];
		String descricao[] = new String [200];
		String nomeProduto[] = new String [200];
		String telefone[] = new String [200];
		String endereco[] = new String [200];
		String nomePessoa[] = new String [200];
		
		
		Scanner ler = new Scanner(System.in);                         //Defini o menu para a escolha de uma das 7 op��es
        System.out.print("Escolha uma op��o de 1 a 7:\n"
        		+ "Opc�o 1 : Cadasto de cliente:\n"
        		+ "Op��o 2 : Busca por cliente:\n"
        		+ "Op��o 3 : Cadastro de produtos:\n"
        		+ "Op��o 4 : Busca por produto:\n"
        		+ "Op��o 5 : Cadastro de venda:\n"
        		+ "Op��o 6 : Mostrar produtos em estoque:\n"
        		+ "Op��o 7 : Fechar o programa:\n");         
        
        seletorDoMenu = ler.nextInt();
        
        while (seletorDoMenu != 7) {        	        	          //Fiz ser diferente de 7, pois sendo 7 o programa ir� desligar
        switch (seletorDoMenu) {                                           
        
        case 1:                                                       //Fiz o primeiro caso do switch para o cadastro do cliente
          if(qtdClientes == 0) {
          System.out.println("Digite a quantidade de clientes: ");    
          qtdClientes = ler.nextInt();   }
          
          if(clientes < qtdClientes) {                                //Decretei esse if para puxar as perguntas de acordo com ele
          	  
          
          
          System.out.println("Digite o nome dos clientes:");         //Fiz as perguntas e guardei as respostas nas vari�veis
          nomePessoa[clientes] = ler.next();
          
          
          System.out.println("Digite o endere�o dos clientes:");    //Guardei os valores em vetores para conseguir armazen�-los
          endereco[clientes] = ler.next();
          
          
          System.out.println("Digite o telefone dos clientes:"); 
          telefone[clientes] = ler.next();
          
          clientes++;              }                                             //clientes++ para ir ao proximo
            
          break;                                                                   
        
        case 2:
            String clienteProcurado;
            
        	System.out.println("Digite o nome a ser buscado, se o cliente n�o for encontrado voc� voltar� ao menu inicial :");                  //Pedi o nome a ser buscado e o guardei numa vari�vel
            clienteProcurado = ler.next();
            
            for(int procurador = 0 ; procurador < clientes; procurador++) {      //Fiz um for e um if para que juntos vejam se o nome buscado est� guardado no vetor do caso 1
         	                                                                     
            	if(nomePessoa[procurador].equals(clienteProcurado)) {
         		
            		System.out.println("Nome: "+nomePessoa[procurador]);          //Defini para que o programa mostrasse os dados do cliente com o procurador que fiz
               
            		System.out.println("Telefone: " + telefone[procurador]);
                
            		System.out.println("Endere�o: " + endereco[procurador]);
               
            		System.out.println("Deseja mudar o cadastro desse cliente? Se sim digite 1, se n�o digite 2 e volte ao menu:");       
                
            		alterarDados = ler.nextInt();
                
            		if(alterarDados==1) {                                        //Fiz com que digitando 1, aparecesse novamente o caso 1 para a troca das informa��es
                	System.out.println("Digite o nome dos clientes:"); 
                    nomePessoa[procurador] = ler.next();                         //E digitando 2, volta ao menu
                    
                    
                    System.out.println("Digite o endere�o dos clientes:");       //Uso o[procurador] para mudar o nome citado pela pessoa apenas
                    endereco[procurador] = ler.next();
                    
                    
                    System.out.println("Digite o telefone dos clientes:"); 
                    telefone[procurador] = ler.next();
             
                }
                
                
                
         	};
           	}
 
            
        	
        	break;
        
        case 3:                                                                   //O caso 3, basicamente foi uma c�pia do caso 1, por�m mudando as informa��es necess�rias
        	if(qtdProdutos == 0) {                                                         
            System.out.println("Digite a quantidade de produtos a serem cadastrados: ");    
            qtdProdutos = ler.nextInt();   }                                  //Usei um if para iniciar as perguntas, pois um vetor come�a sempre com o valor 0 e armazenei o valor
            
            if(produtos < qtdProdutos) {                                        
            	              
            System.out.println("Digite o nome do produto:");                  //Pedi os valores e os guardei em vetores para conseguir armazen�-los
            nomeProduto[produtos] = ler.next();
            
            
            System.out.println("Digite a descri��o do produto:"); 
            descricao[produtos] = ler.next();
            
            
            System.out.println("Digite o valor do produto:"); 
            valorCompra[produtos] = ler.nextInt();
            
            System.out.println("Digite a porcentagem de lucro do produto:"); 
            porcentagemLucro[produtos]= ler.next();
            
            System.out.println("Digite a quantidade de estoque:"); 
            qtdEstoque[produtos]= ler.nextInt();
            
            
            produtos++;              }                                             //produtos++ para ir ao proximo                               
        	
            break;
        
        case 4:
            String produtoProcurado;
        	System.out.println("Digite o nome do produto a ser buscado, se ele n�o for encontrado voc� voltar� ao menu inicial:");    
            produtoProcurado = ler.next();                        //Pedi o produto que ser� buscado e o guardei em uma vari�vel
            
            for(int procurador = 0 ; procurador < produtos; procurador++) {   //Usei a mesma ideia do for do caso 2, para que junto com o if, ele procurasse se oque a pessoa pediu se assemelha ao que est� armazenado
         	if(nomeProduto[procurador].equals(produtoProcurado)) {
         		
         		System.out.println("Nome: "+nomeProduto[procurador]);         //Coloquei as informa��es quando o nome do produto � encontrado
         		
                System.out.println("Valor de compra: " + valorCompra[procurador]);
                
                System.out.println("Descri��o: " + descricao[procurador]);    //Uso o[procurador] para mudar o nome citado pela pessoa apenas
                
                System.out.println("Porcentagem de lucro: " + porcentagemLucro[procurador]);
                
                System.out.println("Quantidade em estoque: " + qtdEstoque[procurador]);
                
                System.out.println("Deseja mudar o cadastro desse produto? Se sim digite 1, se n�o digite 2:");  //Fiz com que se a pessoa digitasse 1, pedisse a altera��o
                alterarDadosProduto = ler.nextInt();                                                             //E se fosse 2, voltava pro menu, e os guardei numa vari�vel
               
                if(alterarDadosProduto==1) {                                  //Nesse if se a pessoa coloca 1, ela pode alterar oque estava escrito
                	System.out.println("Digite o nome do produto:"); 
                    nomeProduto[produtos] = ler.next();
                    
                    
                    System.out.println("Digite a descri��o do produto:");            //Pedi a descri��o novamente do produto e os guardei em uma vari�vel de cada um
                    descricao[produtos] = ler.next();
                    
                    
                    System.out.println("Digite o valor do produto:"); 
                    valorCompra[produtos] = ler.nextInt();
                    
                    System.out.println("Digite a porcentagem de lucro do produto:"); 
                    porcentagemLucro[produtos]= ler.next();
                    
                    System.out.println("Digite a quantidade de estoque:"); 
                    qtdEstoque[produtos]= ler.nextInt();
             
                }
                
                
                
         	};
           	}
 
            
  
        	break;
        
        case 5:
        	for(int procurador = 0 ; procurador < clientes; procurador++) {
        		System.out.println(nomePessoa[procurador]);
                	}
        	String pessoaEscolhida;
        	System.out.println("Selecione um desses:");
        	pessoaEscolhida = ler.next();
        	
        	for(int procurador = 0 ; procurador < produtos; procurador++) {
        		System.out.println(nomeProduto[procurador]);
                	}
        	String produtoEscolhido;
        	System.out.println("Selecione um desses:");
        	produtoEscolhido = ler.next();
        	
        	int qtdVendida;
        	System.out.println("Quantos produtos foram vendidos para esse cliente?");
        	qtdVendida = ler.nextInt();
        	//qtdEstoque-qtdVendida;
        	
        	
        	
        	
        	break;
        
        case 6:
        	for(int procurador = 0 ; procurador < produtos; procurador++) {      //Fiz o for da mesma forma dos outros para achar os produtos, e os mostrei para o cliente
        		
        		System.out.println(nomeProduto[procurador]);
        		
        		System.out.println(qtdEstoque[procurador]);

        		
        	}
        	break;
        case 7:                                                                       //No caso 7, n�o coloquei nada, pois se a pessoa escolhe esse caso, o pograma se encerra
        	
        	break;
        
        
        
        }
				                    
		     
        System.out.print("Escolha uma op��o de 1 a 7:\n"
        		+ "Opc�o 1 : Cadasto de cliente:\n"         //Coloquei isso fora do switch, para que sempre volte ao menu ap�s a escolha da op��o, a menos que seja a 7 que termina o programa
        		+ "Op��o 2 : Busca por cliente:\n"                  
        		+ "Op��o 3 : Cadastro de produtos:\n"
        		+ "Op��o 4 : Busca por produto:\n"
        		+ "Op��o 5 : Cadastro de venda:\n"
        		+ "Op��o 6 : Mostrar produtos em estoque:\n"
        		+ "Op��o 7 : Fechar o programa:\n");   ;   
        seletorDoMenu = ler.nextInt();  
      }

 }
}