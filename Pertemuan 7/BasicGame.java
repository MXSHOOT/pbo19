interface BasicGame {
    public String skill();
    public int hp();
    public int exp();

    default void skillHp() {
        int damage = 150;
        System.out.println("Damage nya 150");
    }
}
