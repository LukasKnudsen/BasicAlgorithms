public class Record implements Comparable<Record> {

    String name;
    String grade;

    public Record(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Record other) {
        int gradeComparison = compareGrades(this.grade, other.grade);

        if (gradeComparison == 0) {
            return this.name.compareTo(other.name);
        }
        return gradeComparison;
    }

    private static int compareGrades(String g1, String g2) {
        // Highest -> lowest
        String order = "A B C D E FX F";

        String base1 = g1.replaceAll("[+-]", "");
        String base2 = g2.replaceAll("[+-]", "");

        int idx1 = findIndex(order, base1);
        int idx2 = findIndex(order, base2);

        int baseComparison = Integer.compare(idx1, idx2);
        if (baseComparison != 0) return baseComparison;

        return Integer.compare(extraDescribers(g2), extraDescribers(g1));
    }

    private static int findIndex(String order, String grade) {
        String[] grades = order.split(" ");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals(grade)) return i;
        }
        return 0;
    }

    private static int extraDescribers(String grade) {
        int score = 0;
        for (char ch : grade.toCharArray()) {
            if (ch == '+') score++;
            else if (ch == '-') score--;
        }
        return score;
    }
}