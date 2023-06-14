public class PessoaFisica {
    //private para usar get e set
    private String name;
    private String cpf;
    private String accountType; //Poupança ou conta corrente
    private String homeAddress;
    private  String homeNumber;
    private String CEP;
    private String cellphone01;
    private  String cellphone02;

    //constructor


    public PessoaFisica(){}

    //getter
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCellphone01() {
        return cellphone01;
    }

    public String getCellphone02() {
        return cellphone02;
    }
    //Setter

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    public void setAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }

    public void setHomeAddress(String newHomeAddress) {
        this.homeAddress = newHomeAddress;
    }

    public void setHomeNumber(String newHomeNumber) {
        this.homeNumber = newHomeNumber;
    }

    public void setCEP(String newCEP) {
        this.CEP = newCEP;
    }

    public void setCellphone01(String newCellphone01) {
        this.cellphone01 = newCellphone01;
    }

    public void setCellphone02(String newCellphone02) {
        this.cellphone02 = newCellphone02;
    }
}
