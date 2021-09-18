import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class CandidatesList {
    private TreeSet<Candidate> candidates = new TreeSet<>(Comparator.comparing(Candidate::getRelevance, Comparator.reverseOrder())
            .thenComparing(Candidate::getRating, Comparator.reverseOrder()));

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        System.out.println(candidates);
    }

    public TreeSet<Candidate> getCandidates() {
        return candidates;
    }

}
