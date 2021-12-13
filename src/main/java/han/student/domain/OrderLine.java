package han.student.domain;

public class OrderLine {
    private Long id;

    private int beerAmount;

    private int netVote;

    private Beer beer;

    public OrderLine() {
    }

    public OrderLine(Long id, int beerAmount, int netVote, Beer beer) {
        this.id = id;
        this.beerAmount = beerAmount;
        this.netVote = netVote;
        this.beer = beer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBeerAmount() {
        return beerAmount;
    }

    public void setBeerAmount(int beerAmount) {
        this.beerAmount = beerAmount;
    }

    public int getNetVote() {
        return netVote;
    }

    public void setNetVote(int netVote) {
        this.netVote = netVote;
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }
}
