public class Testex04 {
    public static void main(String[] args) {
        Ex4[] contribuintes = {
                new Ex4("Pessoa A", "111", "PR", 3000),   // esperado: 0%
                new Ex4("Pessoa B", "222", "SC", 7000),   // esperado: 5,8%
                new Ex4("Pessoa C", "333", "RS", 20000),  // esperado: 15%
                new Ex4("Pessoa D", "444", "PR", 30000),  // esperado: 27,5%
                new Ex4("Pessoa E", "555", "SC", 50000)   // esperado: 30%
        };

        for (Ex4 c : contribuintes) {
            System.out.println(c.getNome() + " | Renda: " + c.getRendaAnual()
                    + " | Imposto: " + c.calcularImposto());
        }
    }
}

