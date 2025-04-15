import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        //INSTANCIANDO TODAS AS DEPENDÊNCIAS PARA USAR EM SALARYSERVICE E CALCULAR O SALÁRIO LÍQUIDO:
        Employee employee = new Employee(name, grossSalary);
        TaxService taxService = new BrazilTaxService(); //new TaxService();
        PensionService pensionService = new PensionService();

        SalaryService salaryService = new SalaryService(taxService, pensionService);

        System.out.printf("Salario liquido = %.2f%n", salaryService.netSalary(employee));
        sc.close();
    }
}