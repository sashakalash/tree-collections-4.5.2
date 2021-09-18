import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CandidatesList candidates = new CandidatesList();
        addCandidates(candidates);
        showCandidates(candidates);
    }

    public static void addCandidates(CandidatesList candidates) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):\n" +
                    "  Фамилия Имя Отчество, пол, возраст, релевантность резюме, оценка на собеседовании:");
            String input = scanner.nextLine();
            if (" ".equals(input)) {
                break;
            }
            String[] splittedString = input.split(", ");
            candidates.addCandidate(createCandidate(splittedString));
            System.out.println("Кандидат успешно добавлен!");
        }
    }

    public static Candidate createCandidate(String[] data) {
        String fio = data[0];
        String sex = data[1];
        String age = data[2];
        Integer relevance = Integer.parseInt(data[3]);
        Integer rating = Integer.parseInt(data[4]);
        return new Candidate(fio, sex, age, relevance, rating);
    }

    public static void showCandidates(CandidatesList candidates) {
        System.out.println("ФИО, Релевантность резюме, Оценка на собеседовании");
        candidates.getCandidates().forEach(candidate -> System.out.println(candidate.toString()));
    }
}
