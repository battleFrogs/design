package com.gjc.notes;

public class Player {

    private int life = 100;
    private int magic = 100;

    public void fightBoss() {
        life -= 100;
        magic -= 100;
        if (life <= 0) {
            System.out.println("壮烈牺牲");
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public Note saveState() {
        return new Note(this.life, this.magic);
    }

    public void restoreState(Note note) {
        this.life = note.life;
        this.magic = note.magic;

    }

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                ", magic=" + magic +
                '}';
    }
}
