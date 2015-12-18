package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		Date dBirthDate2 = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1960-08-18");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bob", "Joesph", "Smith", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student("Larry", "Joesph", "White", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Shelly", "Elizabeth", "Black", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student("Wanda", "Elizabeth", "Jones", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		
		HashMap<UUID, Student> studentmap = new HashMap<>();
		studentmap.put(UUID.randomUUID(), stu1);
		studentmap.put(UUID.randomUUID(), stu2);
		studentmap.put(UUID.randomUUID(), stu3);
		studentmap.put(UUID.randomUUID(), stu4);
		studentmap.put(UUID.randomUUID(), stu5);
		

		assertTrue(studentmap.size()==5);
	}

}
