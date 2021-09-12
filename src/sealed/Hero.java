package sealed;

import sealed.Character;
import sealed.JusticeHammer;
import sealed.WhiteClaw;

public sealed class  Hero extends Character permits WhiteClaw, JusticeHammer {
}
