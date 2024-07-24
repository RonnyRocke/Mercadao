public class Produtos {
    public String[] produtos = new String[5];

    public Produtos() {
        produtos[0] = "8: Ovos - R$12.00";
        produtos[1] = "9: Pao - R$4.00";
        produtos[2] = "10: Manteiga - R$7.00";
        produtos[3] = "11: Arroz - R$20.00";
        produtos[4] = "12: Biscoito - R$5.00";
    }

    public void listarprodutos() {
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }
}
