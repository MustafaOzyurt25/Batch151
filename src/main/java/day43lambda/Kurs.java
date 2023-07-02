package day43lambda;

// POJO CLASS YAPALIM:1- private variable 2-p'li ve p' siz cons 3-getter ve setter 4-toString() methodu: obj
public class Kurs {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Kurs() {
    }


    public Kurs(String KursAdi, int OgrenciSayisi, String donem, double puanOrt) {
        this.courseName = KursAdi;
        this.numOfStudents = OgrenciSayisi;
        this.season = donem;
        this.averageScore=puanOrt;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    @Override
    public String toString() {
        return "Kurs{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}









