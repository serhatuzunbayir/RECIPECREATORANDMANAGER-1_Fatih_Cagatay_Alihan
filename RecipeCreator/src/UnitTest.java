import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {

	Patient patient = new Patient();
	Medicine medicine = new Medicine();
	
	@Before
	public void setUp() throws Exception {
		patient.setName("Fatih");
		patient.setSurname("Coþkun");
		patient.setPatientID(1258779963);
		medicine.setMedName("Aspirin");
		medicine.setMedInfo("Once a day");
		medicine.setPrice(12.57);
	}
	@Test
	public void test() {
		assertEquals("Fatih", patient.getName());
	}
	@Test
	public void test2() {
		assertEquals(true, patient.checkName());
	}
	@Test
	public void test3() {
		patient.setName("a");
		assertEquals(false, patient.checkName());
	}
	@Test
	public void test4() {
		patient.setName("qwertyasdfghzxcvb");
		assertEquals(false, patient.checkName());
	}
	@Test
	public void test5() {
		patient.setName("Çað,a,ta,,y");
		assertEquals(false, patient.checkName());
	}
	@Test
	public void test6() {
		assertEquals(true, patient.checkSurname());
	}
	@Test
	public void test7() {
		patient.setSurname("a");
		assertEquals(false, patient.checkSurname());
	}
	@Test
	public void test8() {
		patient.setSurname("qwertyuýopðüiþlkjhgfdsazxcvbnmö");
		assertEquals(false, patient.checkSurname());
	}
	@Test
	public void test9() {
		patient.setSurname("D,o,ð..a;;n");
		assertEquals(false, patient.checkSurname());
	}
	@Test
	public void test10() {
		assertEquals("Coþkun", patient.getSurname());
	}
	@Test
	public void test11() {
		assertEquals(1258779963, patient.getPatientID());
	}
	@Test
	public void test12() {
		assertEquals("Aspirin", medicine.getMedName());
	}
	@Test
	public void test13() {
		assertEquals(true, medicine.checkMedName());
	}
	@Test
	public void test14() {
		medicine.setMedName("a");
		assertEquals(false, medicine.checkMedName());
	}
	@Test
	public void test15() {
		medicine.setMedName("qwertasdfgzxcvbn");
		assertEquals(false, medicine.checkMedName());
	}
	@Test
	public void test16() {
		medicine.setMedName("As,;pi...,rin");
		assertEquals(false, medicine.checkMedName());
	}
	@Test
	public void test17() {
		assertEquals("Once a day", medicine.getMedInfo());
	}
	@Test
	public void test18() {
		assertEquals(12.57, medicine.getPrice(),0.001);
	}
}
