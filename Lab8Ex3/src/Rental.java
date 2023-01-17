public class Rental {
    public static final int ora=60;
    public static final int rata=40;
    private String nrContract;
    private String numarTelefon;
    private String echipament;
    private int nrOreExtra;
    private int minute;
    private int  OreSiMinute;
    private int pret;
    public void setNumeContract(String contact)
    {
        nrContract=contact;
    }
    public void setOreSiMinute(int orele) {
        OreSiMinute = orele / ora;
    }
    public void setEchipament(String echipament1)
    {
        echipament=echipament1;
    }
    public String getEchipament()
    {
        return echipament;
    }
    public static void motto()
    {

        System.out. print("Motto");
    }
    public void setNumarTelefon(String numar)
    {
        numarTelefon=numar.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNrOreextra(int inchiere)
    {
        int inchiriereExtra = 0, Inchiere;

        if (inchiere > 60)
        {
            for(int i = 60; i < inchiere; i++)
            {
                inchiriereExtra++;

            }
        }

        Inchiere=inchiere+inchiriereExtra;
        nrOreExtra=inchiriereExtra;
        pret=Inchiere;
    }

    public String getNrContract()
    {
        return nrContract;
    }

    public int getOreSiMinute() {
        return OreSiMinute;
    }
    public int getNrOre()
    {
        return nrOreExtra;

    }
    public int getPret()
    {
        return OreSiMinute*rata+nrOreExtra;
    }
    public int getTarif()
    {

        return rata;
    }

}
