public class Invocation {
    private static final int BURST_FIRE_ROUNDS = 3;
    private static final int AUTO_FIRE_ROUNDS = 5;
    private int ammo;

    public Invocation(int ammo) {
        this.ammo = ammo;
    }

    @MultipleInvocation
    public void singleFire() {
        ammo--;
        System.out.println("Single Fire ammo left : " + ammo);
    }

    @MultipleInvocation(timeToInvoke = BURST_FIRE_ROUNDS)
    public void burstFire() {
        ammo--;
        System.out.println("Burst Fire ammo left : " + ammo);
    }

    @MultipleInvocation(timeToInvoke = AUTO_FIRE_ROUNDS)
    public void autofire() {
        ammo--;
        System.out.println("Auto Fire ammo left : " + ammo);
    }
}
