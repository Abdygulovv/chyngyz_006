public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(boss);
        boss.setHealth(600);
        boss.setDamage(80);
        boss.weapon.setWeaponType(WeaponType.SNIPER);
        boss.weapon.setWeaponName("rifle");
        System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage() + " weaponType: " + boss.weapon.getWeaponType()
                + " weaponNam: " + boss.weapon.getWeaponName());

        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();;
        skeleton.setNumberOfArrows(15);
        skeleton.setHealth(450);
        skeleton.setDamage(65);
        skeleton.weapon.setWeaponType(WeaponType.GUN);
        skeleton.weapon.setWeaponName("injury");
        System.out.println("NumberOfArrows: " + skeleton.getNumberOfArrows() + " Health: " + skeleton.getHealth() + " damage: "
                + skeleton.getDamage() + " weaponType: " + skeleton.weapon.getWeaponType() + " weaponNam: " + skeleton.weapon.getWeaponName());


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setNumberOfArrows(18);
        skeleton1.setHealth(500);
        skeleton1.setDamage(70);
        skeleton1.weapon.setWeaponType(WeaponType.SHOTGUN);
        skeleton1.weapon.setWeaponName("m60");
        System.out.println("NumberOfArrows: " + skeleton1.getNumberOfArrows() + " Health: " + skeleton1.getHealth() + " damage: "
                + skeleton1.getDamage() + " weaponType: " + skeleton1.weapon.getWeaponType() + " weaponNam: " + skeleton1.weapon.getWeaponName());





    }
}