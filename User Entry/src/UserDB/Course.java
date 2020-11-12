package UserDB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Course {
	private static Collection<Course> courseList;
	private String Season;
	private String courseName;
	private int averageScore;
	private int numberOfStudents;

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param season
	 * @param courseName
	 * @param averageScore
	 * @param numberOfStudents
	 */
	public Course(String season, String courseName, int averageScore, int numberOfStudents) {
		super();
		Season = season;
		this.courseName = courseName;
		this.averageScore = averageScore;
		this.numberOfStudents = numberOfStudents;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return Season;
	}

	/**
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		Season = season;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the averageScore
	 */
	public int getAverageScore() {
		return averageScore;
	}

	/**
	 * @param averageScore the averageScore to set
	 */
	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	/**
	 * @return the numberOfStudents
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	@Override
	public String toString() {
		return Season + "/ "+ courseName  + "/ " + averageScore
				+ "/" + numberOfStudents  ;
	}

	/**
	 * @param numberOfStudents the numberOfStudents to set
	 */
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	//Create a method to check if all average scores are greater than 91
	public static boolean avgScr(List<Course> courseList)
	{
		return courseList.stream().allMatch(t->t.getAverageScore()>91)
	}
	
	//Create a method to check if at least one of the course name contains "Turkish" word
	public static boolean courseNameTurkish(List<Course> courseList)
	{
		return courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
	}
	
	//Create a method to print the course whose average score is the highest 
	public static Optional<Course> courseNameHighestAvgr(List<Course> courseList)
	{
		return courseList.stream().
				sorted(Comparator.comparing(Course::getAverageScore).reversed()).
				findFirst();
	}
	
	public static Stream<Course> seasonAvgSort(List<Course> courseList)
	{
		return courseList.stream().
				sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore));
	}
	
	//Start the list elements according to the name and number of students and limit the element by 2
	public static List<Course> avgSkip(List<Course> list)
	{
		return list.stream().
		     sorted(Comparator.comparing(Course::getAverageScore)).
		     skip(2).
		     limit(1).
		     collect(Collectors.toList());
	}
	
	//lambda can be used as SQL
	
	
	//Get the course whose average score is maximum
	public static List<Course> avgScrMax(List<Course> list)
	{
		return list.stream().
				sorted(Comparator.comparing(Course::getAverageScore).reversed()).
				limit(1).
				collect(Collectors.toList());
				
	}
	
	//Get the course whose average score is maximum
		public static int sumOfstd(List<Course> list)
		{
			return list.stream().
					filter(t->t.getAverageScore()>95).
					mapToInt(t->t.getNumberOfStudents()).sum();
					
		}
		//Get the course whose average score is maximum
				public static OptionalDouble avgGrade(List<Course> list)
				{
					return list.stream().
							filter(t->t.getAverageScore()>93).
							mapToInt(t->t.getNumberOfStudents()).average();
							
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courseList = new ArrayList<Course>();
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		courseList.add(courseEnglishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseTurkishDay);
		seasonAvgSort(courseList).map(t->t.toString()).forEach(System.out::println);
		System.out.println(avgSkip(courseList));
		System.out.println(avgScrMax(courseList));
		System.out.println(sumOfstd(courseList));
		System.out.println(avgGrade(courseList));
		

	}

}
