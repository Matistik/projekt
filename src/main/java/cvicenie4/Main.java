package cvicenie4;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Miso", "Matistik");
        var contact2 = new Contact("Martin", "Kranec");
        var contact3 = new Contact("Tomas", "Kovacik");

        var pat = Integer.parseInt("5");

        var contact4 = Contact.parseFromFullName("Gabriel Juhas");

        var contacts1 = new Contact[] {contact2,contact3,contact4};
        contact.setFriendsFromArray(contacts1);

        contacts1[0].setFirstName("Mato");

        contact.setFriends(contact4,contact3,contact2);

        contact3.setFirstName("kovy");

        contact.getFriends()[0].setFirstName("Gabo");



    }


}
