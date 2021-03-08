package cvicenie4;

public class Contact {

    private String firstName;
    private String surname;

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    private Contact[] friends;

    public Contact(String fullName){
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }

    public static Contact parseFromFullName(String fullName){
        return new Contact(fullName);

    }

    public void setFriends(Contact...newFriends){
        this.friends = newFriends;


    }
    public void setFriendsFromArray(Contact[] newFriends){
    this.friends = newFriends;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
