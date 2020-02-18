package com.optimizePrime.visaSystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optimizePrime.visaSystem.dao.OffendeeDetailsDAO;
import com.optimizePrime.visaSystem.entities.OffendeeDetails;
	
@SpringBootTest 
class MongoTest {
	
	@Autowired
	OffendeeDetailsDAO offDAO;
	
	//@Test
    void testAddOffendeeDetailsDocument() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(000376763l);
    	od.setForename("Martin");
    	od.setSurname("Leonard");
    	od.setAge(58);
    	od.setCrime("Sexual Abuse");
    	od.setDate("03-07-2017");
    	od.setLocation("Londonderry");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
	//@Test
    void testAddOffendeeDetailsDocument1() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(000376000l);
    	od.setForename("Brian");
    	od.setSurname("Macduff");
    	od.setAge(79);
    	od.setCrime("Child Sex Abuse");
    	od.setDate("03-05-2018");
    	od.setLocation("Shrewsbury");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument2() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(456376090l);
    	od.setForename("Father Malachy");
    	od.setSurname("Finnegan");
    	od.setAge(49);
    	od.setCrime("Child Sex Abuse");
    	od.setDate("03-03-2018");
    	od.setLocation("Stroud/Ireland");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument3() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(222555999l);
    	od.setForename("Francis");
    	od.setSurname("Moore");
    	od.setAge(82);
    	od.setCrime("Attempted Child Rape");
    	od.setDate("09-03-2018");
    	od.setLocation("Glasgow");
    	od.setGender("Male");	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument4() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(222001234l);
    	od.setForename("Shaun");
    	od.setSurname("Powell");
    	od.setAge(34);
    	od.setCrime("Arsen/Pervertion");
    	od.setDate("09-02-2019");
    	od.setLocation("Penryn");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument5() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(987654321l);
    	od.setForename("Patrick");
    	od.setSurname("Mackay");
    	od.setAge(39);
    	od.setCrime("Mass Murder");
    	od.setDate("09-04-2019");
    	od.setLocation("London");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument6() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(555666998l);
    	od.setForename("Kenneth");
    	od.setSurname("Larking");
    	od.setAge(72);
    	od.setCrime("Child Sex Abuse");
    	od.setDate("10-04-2019");
    	od.setLocation("Edinburgh");
    	od.setGender("Male");
    	
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument7() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(457980132l);
    	od.setForename("Harry");
    	od.setSurname("Leigh");
    	od.setAge(19);
    	od.setCrime("Mass Murderer");
    	od.setDate("20-04-2019");
    	od.setLocation("Hastings");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument8() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(457980132l);
    	od.setForename("Harry");
    	od.setSurname("Smith");
    	od.setAge(19);
    	od.setCrime("Mass Murderer");
    	od.setDate("20-04-2019");
    	od.setLocation("Hastings");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument9() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(132444555l);
    	od.setForename("Lee");
    	od.setSurname("Smith");
    	od.setAge(44);
    	od.setCrime("Indecent Images");
    	od.setDate("20-10-2016");
    	od.setLocation("Aylestone");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument10() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999988765l);
    	od.setForename("Francis");
    	od.setSurname("McDermott");
    	od.setAge(83);
    	od.setCrime("Child Sex Abuse");
    	od.setDate("20-03-2019");
    	od.setLocation("Bideford");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument11() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(912376839l);
    	od.setForename("Vincent");
    	od.setSurname("Whelan");
    	od.setAge(71);
    	od.setCrime("Child Grooming");
    	od.setDate("20-08-2018");
    	od.setLocation("Wirral/Wythenshawe");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument12() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(939873450l);
    	od.setForename("Kevin");
    	od.setSurname("Higgs");
    	od.setAge(21);
    	od.setCrime("Child Pornography");
    	od.setDate("20-07-2004");
    	od.setLocation("Chepstow");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument13() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999988476l);
    	od.setForename("Matthew");
    	od.setSurname("Jolley");
    	od.setAge(32);
    	od.setCrime("Religious Sex Offences");
    	od.setDate("17-10-2019");
    	od.setLocation("Warrington");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument14() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(678002008l);
    	od.setForename("Francis");
    	od.setSurname("Simpson");
    	od.setAge(32);
    	od.setCrime("Religious Sex Offences");
    	od.setDate("12-10-2019");
    	od.setLocation("Warrington");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument15() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(678002134l);
    	od.setForename("Phillip");
    	od.setSurname("McBrien");
    	od.setAge(58);
    	od.setCrime("Religious Sex Offences");
    	od.setDate("08-10-2019");
    	od.setLocation("Warrington");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument16() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999333888l);
    	od.setForename("Pauline");
    	od.setSurname("Williams");
    	od.setAge(52);
    	od.setCrime("Terroist");
    	od.setDate("20-10-2019");
    	od.setLocation("Dublin");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument17() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(124567342l);
    	od.setForename("Rose");
    	od.setSurname("West");
    	od.setAge(60);
    	od.setCrime("Terroist");
    	od.setDate("20-11-2015");
    	od.setLocation("Dublin");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument18() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(100084592l);
    	od.setForename("Eileen");
    	od.setSurname("McBrien");
    	od.setAge(62);
    	od.setCrime("Terroist");
    	od.setDate("20-01-2019");
    	od.setLocation("Dublin");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument19() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(100300005l);
    	od.setForename("Gemma");
    	od.setSurname("Watts");
    	od.setAge(21);
    	od.setCrime("Terroist");
    	od.setDate("15-01-2019");
    	od.setLocation("Londonderry");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument20() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(456376090l);
    	od.setForename("Jasmine");
    	od.setSurname("Rowbottom");
    	od.setAge(24);
    	od.setCrime("Terroist");
    	od.setDate("15-10-2019");
    	od.setLocation("Blackpool");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument21() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(456223090l);
    	od.setForename("Rachel");
    	od.setSurname("Tunstill");
    	od.setAge(28);
    	od.setCrime("Terroist");
    	od.setDate("15-11-2019");
    	od.setLocation("Islington");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument22() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(123452000l);
    	od.setForename("Karen");
    	od.setSurname("Robb");
    	od.setAge(43);
    	od.setCrime("Terroist");
    	od.setDate("19-09-2019");
    	od.setLocation("Gloucester");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument23() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999012666l);
    	od.setForename("Patricia");
    	od.setSurname("Moore");
    	od.setAge(49);
    	od.setCrime("Child Sex Addict");
    	od.setDate("19-03-2018");
    	od.setLocation("Stroud");
    	od.setGender("Female");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument24() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999777666l);
    	od.setForename("Ian");
    	od.setSurname("Bensley");
    	od.setAge(38);
    	od.setCrime("Pervertion to Opposite Sex");
    	od.setDate("19-01-2020");
    	od.setLocation("Derby");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument25() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999777666l);
    	od.setForename("Christopher");
    	od.setSurname("Randall");
    	od.setAge(38);
    	od.setCrime("Indecent Images");
    	od.setDate("19-01-2017");
    	od.setLocation("Kilmarnock");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument26() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999757666l);
    	od.setForename("Peter");
    	od.setSurname("Kellett");
    	od.setAge(77);
    	od.setCrime("Terroist");
    	od.setDate("19-12-2015");
    	od.setLocation("Leeds");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument27() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999707606l);
    	od.setForename("Father Francis");
    	od.setSurname("Leonard");
    	od.setAge(58);
    	od.setCrime("Child Sex Offences");
    	od.setDate("19-07-2018");
    	od.setLocation("Londonderry");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    //@Test
    void testAddOffendeeDetailsDocument28() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(999777124l);
    	od.setForename("Vincent");
    	od.setSurname("Simpsons");
    	od.setAge(68);
    	od.setCrime("Mass Murder");
    	od.setDate("29-04-2019");
    	od.setLocation("London");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
    @Test
    void testAddOffendeeDetailsDocument29() {
    	OffendeeDetails od = new OffendeeDetails();
    	od.setPassportNo(986742241l);
    	od.setForename("Vincent");
    	od.setSurname("Lau");
    	od.setAge(25);
    	od.setCrime("Terroist");
    	od.setDate("13-09-2019");
    	od.setLocation("Leeds");
    	od.setGender("Male");
    	
    	od = offDAO.save(od);
    	
    	assertNotNull(od,"Job Position Not Saved");
	}
    
}