public class SalaryService { //SalaryService = Serviço de Salário

//    //ERRADO:
//    TaxService taxService = new TaxService();
//    PensionService pensionService = new PensionService();

    //CORRETO: INJEÇÃO DE DEPENDÊNCIAS VIA MÉTODO CONSTRUTOR:
    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) { //netSalary = salário líquido | employee = funcionário
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
