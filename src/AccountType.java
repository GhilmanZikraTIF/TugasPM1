public enum AccountType {
    CURRENT("CU"),
    SAVINGS("SA"),
    DEPOSIT("DP");
    private String code;
    private AccountType(String code){

        this.code=code;
    }
    public String getCode() {

        return code;
    }
}

