package cvicenie4;

public class Graduate extends Contact {

    private String academicTitle;




    public Graduate(String firstName, String surname) {
        super(firstName, surname);
        this.academicTitle = "";
    }

    public Graduate(String academicTitle, String firstName, String surname) {
        super(firstName, surname);
        this.academicTitle = academicTitle;
    }

    public String akoTextSTitulom(){
        return String.format("%s %s ", this.academicTitle, this.akoText());
    }


    public String akoText() {
        return String.format("%s %s ", this.academicTitle, super.akoText());
    }

    @Override
    public String getZnamy() {
        var builder = new StringBuilder();
        builder.append("Moji znamy:\n");
        for (int i = 0; i < this.friends.length; i++) {
            builder.append(this.friends[i].akoText());
            builder.append("\n");

        }
        return builder.toString();
    }


}
