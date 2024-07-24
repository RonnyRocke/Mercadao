import java.util.Scanner;

public class Mercadao {
    int opcao;
    String pressione = null;
    int desejafazer;
    double eggs = 12;
    double paos = 4;
    double margarina = 7;
    double rice = 20;
    double cookie = 5;

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Mercadao m = new Mercadao();
        Produtos p = new Produtos();
        Usuario u = new Usuario();
        Saldo s = new Saldo();
        boolean menu = true;

        while (menu) {
            System.out.println("**********************");
            System.out.println("🇲​​🇪​​​​​🇷​​​​​🇨​​​​​🇦​​​​​🇩​​​​​🇦​​​​​🇴​​​​​");
            System.out.println(" ");
            System.out.println("Autor: Ronny Rocke");
            System.out.println("Date: 24/07/24");
            System.out.println("**********************");
            System.out.println(" ");
            System.out.println("1: Iniciar");
            System.out.println("2: Sair");
            System.out.println(" ");
            System.out.print("Digite Uma Opção: ");
            m.opcao = tecla.nextInt();

            switch (m.opcao) {
                case 1:
                    boolean tela = true;
                    while (tela) {
                        System.out.println(" ");
                        System.out.println("**********************");
                        System.out.print("Digite Seu Login: ");
                        String login = tecla.next();

                        System.out.print("Digite Sua Senha: ");
                        int password = tecla.nextInt();

                        if (login.equals(u.Login) && password == u.Password) {
                            System.out.println(" ");
                            System.out.println("**********************");
                            System.out.println("LOGIN REALIZADO COM SUCESSO!");
                            System.out.println(" ");
                            System.out.print("PRESSIONE 0 PARA CONTINUAR: ");
                            m.pressione = tecla.next();
                            System.out.println(" ");
                            System.out.println("**********************");
                            System.out.println("3: Consultar Produtos ");
                            System.out.println("4: Consultar Meu Saldo ");
                            System.out.println("5: Depositar Dinheiro ");
                            System.out.println("6: Sacar Dinheiro ");
                            System.out.println("7: SAIR");
                            System.out.println("**********************");
                            System.out.println(" ");
                            System.out.print("Digite O Que Deseja fazer: ");
                            m.desejafazer = tecla.nextInt();

                            switch (m.desejafazer) {
                                case 3:
                                    boolean tela2 = true;
                                    while (tela2) {
                                        System.out.println(" ");
                                        System.out.println("**********************");
                                        System.out.println(" ");
                                        System.out.println("PRODUTOS");
                                        System.out.println(" ");
                                        p.listarprodutos();
                                        System.out.println("**********************");
                                        System.out.println(" ");
                                        System.out.print("Digite Qual Produto deseja comprar: ");
                                        int comprar = tecla.nextInt();

                                        switch (comprar) {
                                            case 8:
                                                System.out.println("-----------------");
                                                System.out.println(p.produtos[0]);
                                                System.out.println("Você Selecionou ovos!");
                                                System.out.print("Você Quer Comprar (SIM/NAO): ");
                                                String comprando = tecla.next();
                                                if (comprando.equalsIgnoreCase("sim")) {
                                                    if (s.Carteira[0] >= m.eggs) {
                                                        s.Carteira[0] -= m.eggs;
                                                        System.out.println("Você comprou ovos!");
                                                        s.ConferirSaldo();
                                                    } else {
                                                        System.out.println("VOCÊ NÃO POSSUI SALDO PARA COMPRAR ESTE PRODUTO!");
                                                    }
                                                } else {
                                                    System.out.println("Você Não quer comprar!");
                                                }
                                                break;

                                            case 9:
                                                System.out.println("-----------------");
                                                System.out.println(p.produtos[1]);
                                                System.out.println("Você Selecionou Pao");
                                                System.out.print("Você Quer Comprar (SIM/NAO): ");
                                                comprando = tecla.next();
                                                if (comprando.equalsIgnoreCase("sim")) {
                                                    if (s.Carteira[0] >= m.paos) {
                                                        s.Carteira[0] -= m.paos;
                                                        System.out.println("Você comprou pao!");
                                                        s.ConferirSaldo();
                                                    } else {
                                                        System.out.println("VOCÊ NÃO POSSUI SALDO PARA COMPRAR ESTE PRODUTO!");
                                                    }
                                                } else {
                                                    System.out.println("Você Não quer comprar!");
                                                }
                                                break;

                                            case 10:
                                                System.out.println("-----------------");
                                                System.out.println(p.produtos[2]);
                                                System.out.println("Você Selecionou Manteiga");
                                                System.out.print("Você Quer Comprar (SIM/NAO): ");
                                                comprando = tecla.next();
                                                if (comprando.equalsIgnoreCase("sim")) {
                                                    if (s.Carteira[0] >= m.margarina) {
                                                        s.Carteira[0] -= m.margarina;
                                                        System.out.println("Você comprou Manteiga!");
                                                        s.ConferirSaldo();
                                                    } else {
                                                        System.out.println("VOCÊ NÃO POSSUI SALDO PARA COMPRAR ESTE PRODUTO!");
                                                    }
                                                } else {
                                                    System.out.println("Você Não quer comprar!");
                                                }
                                                break;

                                            case 11:
                                                System.out.println("-----------------");
                                                System.out.println(p.produtos[3]);
                                                System.out.println("Você Selecionou Arroz");
                                                System.out.print("Você Quer Comprar (SIM/NAO): ");
                                                comprando = tecla.next();
                                                if (comprando.equalsIgnoreCase("sim")) {
                                                    if (s.Carteira[0] >= m.rice) {
                                                        s.Carteira[0] -= m.rice;
                                                        System.out.println("Você comprou Arroz!");
                                                        s.ConferirSaldo();
                                                    } else {
                                                        System.out.println("VOCÊ NÃO POSSUI SALDO PARA COMPRAR ESTE PRODUTO!");
                                                    }
                                                } else {
                                                    System.out.println("Você Não quer comprar!");
                                                }
                                                break;

                                            case 12:
                                                System.out.println("-----------------");
                                                System.out.println(p.produtos[4]);
                                                System.out.println("Você Selecionou Biscoito");
                                                System.out.print("Você Quer Comprar (SIM/NAO): ");
                                                comprando = tecla.next();
                                                if (comprando.equalsIgnoreCase("sim")) {
                                                    if (s.Carteira[0] >= m.cookie) {
                                                        s.Carteira[0] -= m.cookie;
                                                        System.out.println("Você comprou Biscoito!");
                                                        s.ConferirSaldo();
                                                    } else {
                                                        System.out.println("VOCÊ NÃO POSSUI SALDO PARA COMPRAR ESTE PRODUTO!");
                                                    }
                                                } else {
                                                    System.out.println("Você Não quer comprar!");
                                                }
                                                break;

                                            default:
                                                System.out.println("PRODUTO NÃO ENCONTRADO!");
                                                break;
                                        }
                                    }
                                    break;

                                case 4:
                                    System.out.println(" ");
                                    System.out.println("**********************");
                                    System.out.println(" ");
                                    System.out.println("Nome Da Conta: Eduardo Carvalho");
                                    System.out.println("Tipo De Conta: Poupança ");
                                    System.out.println("Banco: PICPAY");
                                    System.out.println("Agência: 1009");
                                    System.out.println("Número Da Conta: 00000-1");
                                    s.ConferirSaldo();
                                    break;

                                case 5:
                                    boolean tela3 = true;
                                    while (tela3) {
                                        System.out.println(" ");
                                        System.out.println("**********************");
                                        System.out.print("Digite Quanto Quer Depositar: ");
                                        double deposito = tecla.nextDouble();
                                        s.Carteira[0] += deposito;
                                        System.out.println("VOCÊ DEPOSITOU " + "R$" + deposito);
                                        System.out.println("SALDO ATUAL: " + s.Carteira[0]);
                                        System.out.println(" ");
                                        System.out.println("**********************");
                                        tela3 = false;
                                    }
                                    break;

                                case 6:
                                    boolean tela4 = true;
                                    while (tela4) {
                                        System.out.println(" ");
                                        System.out.println("**********************");
                                        System.out.print("Digite Quanto Quer Sacar: ");
                                        double saque = tecla.nextDouble();
                                        if (saque > s.Carteira[0]) {
                                            System.out.println("SALDO INSUFICIENTE!");
                                        } else {
                                            s.Carteira[0] -= saque;
                                            System.out.println("VOCÊ SACOU " + "R$" + saque);
                                            System.out.println("SALDO ATUAL: " + s.Carteira[0]);
                                            System.out.println(" ");
                                            System.out.println("**********************");
                                        }
                                        tela4 = false;
                                    }
                                    break;

                                case 7:
                                    System.out.println("VOCÊ SAIU!");
                                    menu = false;
                                    tela = false;
                                    break;

                                default:
                                    System.out.println("OPÇÃO INVÁLIDA!");
                                    break;
                            }
                        } else {
                            System.out.println("USUÁRIO OU SENHA INCORRETOS!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Obrigado Por Utilizar o Mercadao!");
                    menu = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        tecla.close();
    }
}
