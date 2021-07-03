package homework.hospital.repository;

import homework.hospital.model.Doctor;

import java.util.HashMap;
import java.util.Map;

public class Doctors {
   public static Doctor okulist = new Doctor("Eyehealer");
   public static Doctor lor = new Doctor("Lor");
   public static Doctor herurg = new Doctor("Herurg");
   public static Doctor terapevt = new Doctor("Terapevt");
   public static Map<String, Doctor> doctors = new HashMap<>();
   public static void initializeDoctors(){
      doctors.put(okulist.getSpecialisation(), okulist);
      doctors.put(lor.getSpecialisation(), lor);
      doctors.put(herurg.getSpecialisation(), herurg);
      doctors.put(terapevt.getSpecialisation(), terapevt);
   }


}
