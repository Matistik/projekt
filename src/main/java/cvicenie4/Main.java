package cvicenie4;

public class Main {

    public static void main(String[] args) {

        var absolvent = new Graduate("Ing.", "Tomas", "Kovacik");

        absolvent.setFriends(new Graduate("Ing.", "asd", "sss"), new Graduate("Ing.", "Tom", "Kova"));
        System.out.println(absolvent.akoText());
        System.out.println(absolvent.akoTextSTitulom());

        System.out.println(absolvent);

    }


}
