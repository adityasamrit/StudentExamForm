package examform;

public class Studata 
{
	private String name,number,collegeid,birthday,gender,fifthsub,sixthsub,address;

	public Studata() {
		super();
	}

	public Studata(String name, String number, String collegeid , String birthday,String gender, String fifthsub,String sixthsub, String address) {
		super();
		this.name = name;
		this.number = number;
		this.collegeid = collegeid;
		this.birthday = birthday;
		this.gender = gender;
		this.fifthsub = fifthsub;
		this.sixthsub = sixthsub;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFifthsub() {
		return fifthsub;
	}

	public void setFifthsub(String fifthsub) {
		this.fifthsub = fifthsub;
	}

	public String getSixthsub() {
		return sixthsub;
	}

	public void setSixthsub(String sixthsub) {
		this.sixthsub = sixthsub;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
	

			

			
	