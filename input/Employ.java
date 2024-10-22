package input;

abstract class Employ {
    int year;
    String pangalan;
    String job;

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public String getpangalan() {
        return pangalan;
    }

    public void setpangalan(String pangalan) {
        this.pangalan = pangalan;
    }

    public String getjob() {
        return job;
    }

    public void setjob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return ("year: " + year + "\npangalan: " + pangalan + "\njob: " + job);
    }

    public abstract void ability();

}

class Itepirsonel extends Employ {
    public Itepirsonel(int year, String pangalan, String job) {
        this.year = year;
        this.pangalan = pangalan;
        this.job = job;
    }

    @Override
    public void ability() {
        System.out.println("PANGIT KA");
    }
}
