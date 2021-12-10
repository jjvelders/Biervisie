package han.student.domain;

public class Preference {

    private Long id;

    private String email;

    private Beer beer;

    public Preference() {
    }

    public Preference(Long id, String email, Beer beer) {
        this.id = id;
        this.email = email;
        this.beer = beer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }
}
