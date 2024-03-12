package ua.com.cbs.trelloPractice.oop.infoStudents;

public class Students {
  private final String lastName;
  private final String groupNumber;
  private final int physicGrade;
  private final int informGrade;
  private final int historyGrade;
  private final float avrMark;

  public Students(String lastName, String groupNumber, int physicGrade, int informGrade, int historyGrade) {
    this.lastName = lastName;
    this.groupNumber = groupNumber;
    this.physicGrade = physicGrade;
    this.informGrade = informGrade;
    this.historyGrade = historyGrade;
    this.avrMark = (float) (physicGrade + informGrade + historyGrade) / 3;
  }

  public float getAvrMark() {
    return avrMark;
  }

  @Override
  public String toString() {
    return "Students{" +
        "lastName='" + lastName + '\'' +
        ", groupNumber='" + groupNumber + '\'' +
        ", physicGrade=" + physicGrade +
        ", informGrade=" + informGrade +
        ", historyGrade=" + historyGrade +
        ", avrMark=" + String.format("%.02f", avrMark) +
        '}';
  }
}
