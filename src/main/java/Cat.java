import java.util.Objects;

public class Cat {

    String voice;
   public Cat(){}

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(voice, cat.voice);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(voice);
    }
}
