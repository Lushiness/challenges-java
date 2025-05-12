package Bank_account;

abstract public class account {
    protected int id;
    protected String name;
    private datasource mydata;

    public void PerformOperations(datasource _mydata){
        mydata = _mydata;
        mydata.execute();
    }


    
}
