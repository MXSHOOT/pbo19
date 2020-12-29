class Main {
    public static void main(String[] args) {
        RainbowSix r6s = new RainbowSix();
        System.out.println("Skill dari r6s = "+ r6s.skill());
        System.out.println("hp dari r6s = "+ r6s.hp());
        System.out.println("exp dari r6s = "+ r6s.exp());
        System.out.println("agent pertama dari r6s = "+ r6s.karakterPertama());
        System.out.println("agent kedua dari r6s = "+ r6s.karakterKedua());
        System.out.println("agent ketiga dari r6s = "+ r6s.karakterKetiga());
        r6s.skillHp();
    }
}
