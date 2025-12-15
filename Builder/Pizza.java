class Pizza {
    private String pate = "";
    private String sauce = "";
    private String garniture = "";

    public void setPate(String pate) { this.pate = pate; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void setGarniture(String garniture) { this.garniture = garniture; }

    public void print() {
        System.out.println("Pâte = " + pate);
        System.out.println("Sauce = " + sauce);
        System.out.println("Garniture = " + garniture);
    }
}
