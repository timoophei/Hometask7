package task1;

public class Therapist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Терапевт лечит!");
    }

    public void assignDoctor(Patient patient){
        if (patient.getPlanOfTreatment() == 1){
            patient.setDoctor(new Surgeon());
        } else if (patient.getPlanOfTreatment() == 2) {
            patient.setDoctor(new Dentist());
        } else {
            patient.setDoctor(this);
        }
        patient.printInfo();
    }
}