class Doctor{
static void treatment(String patientname , int age){
System.out.println("Doctor is giving treatment:"+patientname+age);
Nurse.assist(patientname,age);
}
}