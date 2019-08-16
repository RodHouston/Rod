public class Contributor {
    private String name;
    private String city;
    private String country;
    private String phone;
    private double contribution;
    private int id;

    public Contributor(String name, String city, String country, String phone, double contribution, int id) {
        //initialize each value in the Contributor object
	this.name = name;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.contribution = contribution;
        this.id = id;
    }
    
    public void printContributor() {
		//display the contents of the Contributor object
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Phone: " + phone);
        System.out.println("Contribution: " + contribution);
        System.out.println("ID: " + id);
        System.out.println();
    }
}
