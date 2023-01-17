import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Eveniment one = new Eveniment();
        one = getData(one);
        System.out.println("Detaliile evenimentului 1");
        System.out.println("Numele evenimentului = " + one.getNumarEveniment() + " \nNr invitati " + one.getGuests() + " \n" + one.getPretoaspete() + "  RON \n" + one.isLargeEvent()+" \n Nr telefon"+one.getnumarTelefon());
        Eveniment two = new Eveniment();
        two.setNumarEveniment("A200");
        two.setGuests(0);

        System.out.println("Numele evenimente2" + two.getNumarEveniment() + "\n Nr de invtati" + two.getGuests());

    }

    public static Eveniment getData(Eveniment event) {
        int numarPersoane;
        String nume, z,numarTelefon,nt,repNumar,tipEveniment;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Da numele evenimetului");
        nume = keyboard.nextLine();
        z = nume;
        for (int i = 0; i < nume.length(); i++) {
            if(nume.length()==4) {
                if (nume.charAt(0) >= 'a' && nume.charAt(0) <= 'z') {
                    if (nume.charAt(1) >= '0' && nume.charAt(1) <= '9') {
                        if (nume.charAt(2) >= '0' && nume.charAt(2) <= '9') {
                            if (nume.charAt(3) >= '0' && nume.charAt(3) <= '9') {
                                nume = z;
                            } else nume = "A000";
                        } else nume = "A000";
                    } else nume = "A000";
                } else nume = "A000";
            }else nume = "A000";
        }
        System.out.print("Dati numarul de telefon = ");
        numarTelefon=keyboard.nextLine();

        repNumar=numarTelefon.replaceAll("[^a-zA-Z0-9]","");
        nt=repNumar;
        for(int j=0;j<repNumar.length();j++)
        {
            if(repNumar.length()==10)
            {
                repNumar=nt;
            }
            else repNumar="0000000000000000";
        }


        System.out.print(" \n Dati numarul de persoane ");
        numarPersoane=keyboard.nextInt();
        System.out.print("Dati tipul de eveniment =");
        tipEveniment=keyboard.nextLine();
        String d = nume.toUpperCase();
        event.setNumarEveniment(d);
        event.setGuests(numarPersoane);
        event.setNumarTelefon(Numar);
        event.setTipEveniment(tipEveniment);
        return event;
    }}