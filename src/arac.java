public class arac {

    private String beygir;
    private String bütce;
    private String yiltercih;
    private String model;
    private String yakit;

    public arac(String beygir, String bütce, String yiltercih, String model, String yakit){
        this.beygir=beygir;
        this.bütce=bütce;
        this.yiltercih=yiltercih;
        this.model=model;
        this.yakit=yakit;
    }

    public String getBeygir() {
        return beygir;
    }

    public void setBeygir(String beygir) {
        this.beygir = beygir;
    }

    public String getBütce() {
        return bütce;
    }

    public void setBütce(String bütce) {
        this.bütce = bütce;
    }

    public String getYiltercih() {
        return yiltercih;
    }

    public void setYiltercih(String yiltercih) {
        this.yiltercih = yiltercih;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

}
