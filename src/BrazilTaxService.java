public class BrazilTaxService extends TaxService{ //Promovendo o desacoplamento: Permite adicionar por herança várias taxas de impostos diferentes, sem mexer no código de TaxService

    @Override
    public double tax(double amount) { //tax: imposto | amount: montante, quantia
        return amount * 0.3;
    }
}
