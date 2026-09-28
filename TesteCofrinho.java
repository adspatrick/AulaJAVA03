public class TesteCofrinho {

    public static void main(String[] args) {
        Cofrinho c1, c2;
        Pessoa p1, p2;

        p1 = new Pessoa(Teclado.leString("Nome do dono do cofrinho 1:"), Teclado.leInt("Idade:"));
        p2 = new Pessoa(Teclado.leString("Nome do dono do cofrinho 2:"), Teclado.leInt("Idade:"));

        c1 = new Cofrinho(p1);
        c1.deposita50c();
        c1.deposita25c();
        c1.deposita10c();

        c2 = new Cofrinho(p2);
        c2.deposita50c();
        c2.deposita25c();

        System.out.println("-------");
        System.out.println(c1.informaTotal());
        System.out.println(c2.informaTotal());
        System.out.println("-------");

        double totalDoisCofrinhos = c1.calculaTotal() + c2.calculaTotal();
        System.out.println("Valor total dos Cofrinhos: " + totalDoisCofrinhos);
    }
}