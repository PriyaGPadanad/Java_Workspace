class HospitalRunner{
public static void main(String[] args){
String patientname="esha";
int age=16;
String mobile="7689543289";
String email="esha@gmail.com";
String sicknes="2 days";
System.out.println("HospitalRunner starts the treatment");
Hospital.checkup(patientname,age,mobile,email,sicknes);
}
}