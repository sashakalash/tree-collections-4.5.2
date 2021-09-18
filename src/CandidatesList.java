import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CandidatesList {
    private TreeSet<Candidate> candidates = new TreeSet<>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public List<Candidate> getCandidates() {
        return candidates.stream().sorted(Comparator.comparing(Candidate::getRelevance, Comparator.reverseOrder())
                .thenComparing(Candidate::getRating, Comparator.reverseOrder())).toList();
    }

}
