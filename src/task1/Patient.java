package task1;

public class Patient {
    private int planOfTreatment;
    private Doctor doctor;

    Patient (int planOfTreatment){
        setPlanOfTreatment(planOfTreatment);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getPlanOfTreatment() {
        return planOfTreatment;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPlanOfTreatment(int planOfTreatment) {
        this.planOfTreatment = planOfTreatment;
    }

    public void printInfo(){
        System.out.print("Пациент с планом " + getPlanOfTreatment() + ": ");
        getDoctor().treat();
    }
}