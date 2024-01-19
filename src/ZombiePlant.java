public class ZombiePlant {
    public int potencyRequired;
    public int treatmentsNeeded;
    public ZombiePlant(int potencyRequirement, int treatmentsNeeded) {
        this.potencyRequired = potencyRequirement;
        this.treatmentsNeeded = treatmentsNeeded;
    }
    public int getPotencyRequired() {
        return potencyRequired;
    }
    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }
    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }
    public void treat(int potency) {
        if (treatmentsNeeded != 0) {
            if (potency <= potencyRequired && potency > 0) {
                treatmentsNeeded -= 1;
            }
            else if (potency > 0) {
                treatmentsNeeded += 1;
            }
        }
        else {
            if (potency > potencyRequired)  {
                treatmentsNeeded += 1;
            }
        }
    }

}
