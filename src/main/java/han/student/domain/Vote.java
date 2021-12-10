package han.student.domain;

public class Vote {

    private Long id;

    private String email;

    private int voteType;

    private Preference preference;

    public Vote() {

    }

    public Vote(Long id, String email, int voteType, Preference preference) {
        this.id = id;
        this.email = email;
        this.voteType = voteType;
        this.preference = preference;
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

    public int getVoteType() {
        return voteType;
    }

    public void setVoteType(int voteType) {
        this.voteType = voteType;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}