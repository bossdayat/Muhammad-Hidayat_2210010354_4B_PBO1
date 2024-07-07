package pbo;

public class Voucher {
    
    //atribut
    private String name;
    private String novchr;
    
    //constructor
    public Voucher (String name, String novchr){
        this.name = name;
        this.novchr = novchr;
    }
    
    //accessor
    public String getName(){
        return name;
    }
    public String getNovchr(){
        return novchr;
    }
    
    //mutator
    public void setName (String name){
        this.name = name;
    }
    public void setNovchr (String novchr){
        this.novchr =novchr;
    }
    
    //methot
    public String displayInfo(){
        return "Nama         : "+getName()+
               "\nNo Voucher   : "+getNovchr();
    }
}