public class HufflepuffStudent extends HowardsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = this.ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем студент %s: %d VS %d%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем студент %s: %d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, чем студент %s: %d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        }
    }

    private int ability() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), diligence, loyalty, honesty);
    }
}