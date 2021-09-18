public class Candidate implements Comparable<Candidate>{
    private String fio;
    private String sex;
    private String age;
    private Integer relevance;
    private Integer rating;

    public Candidate(String fio, String sex, String age, Integer relevance, Integer rating) {
        this.fio = fio;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getfio() {
        return fio;
    }

    public void setfio(String fio) {
        this.fio = fio;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRelevance() {
        return Integer.toString(relevance);
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public String getRating() {
        return Integer.toString(relevance);
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return fio +
                ", " + relevance +
                ", " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Candidate other = (Candidate) obj;
        return fio.equals(other.getfio());
    }

    @Override
    public int hashCode() {
        return fio.hashCode();
    }

    public int compareTo(Candidate p){

        return fio.compareTo(p.getfio());
    }
}
