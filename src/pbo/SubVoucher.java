package pbo;

public class SubVoucher extends Voucher {
    
    //counstructor
    public SubVoucher (String name, String novchr){
        super (name, novchr);
    }
    public String getNamaKartu(){
        String kdNmKrt = getNovchr().substring(0, 2);
        switch (kdNmKrt){
            case "01":
                return "Indosat";
            case "02":
                return "XL";
            case "03":
                return "Smartfren ";
            case "04":
                return "IM3";
            case "05":
                return "Telkomsel";
            default:
                return "Tidak terdaftar dilayanan kami";
        }
    }
    public String getKuota(){
        String kdKuota = getNovchr().substring(2, 4);
        switch (kdKuota){
            case "01":
                return "1GB";
            case "05":
                return "5GB";
            case "10":
                return "10GB";
            case "25":
                return "25GB";
            case "50":
                return "50GB";
            case "75":
                return "75GB";
            default:
                return "Tidak ada paket data";
        }
    }
    public String getDaerah(){
        String kdWil = getNovchr().substring(4, 6);
        switch(kdWil){
            case "99":
                return "Barito Kuala";
            case "88":
                return "Tabalong";
            case "77":
                return "Balangan";
            default:
                return "Tidak terdaftar dilayanan kami";
        }
    }
    public int getNoReg(){
        return Integer.parseInt(getNovchr().substring(6));
    }
    //polymorpsm (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nNama Kartu   : "+getNamaKartu()+
                "\nKuota        : "+getKuota()+
                "\nDaerah       : "+getDaerah()+
                "\nNomer Produk : "+getNoReg();
    }
}