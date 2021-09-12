package sealed;

public sealed class Character permits Hero, Villain {
    public boolean hasPositiveVibes() {
        return true;
    }
}
