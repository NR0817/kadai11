package kadai11;

abstract class Koujyou {
public final Seihin create() {
Seihin seihin = factoryMethod(); touroku(seihin);
return seihin;
}
public abstract Seihin factoryMethod();
public abstract void touroku(Seihin s);
}

class TvKoujyou extends Koujyou {
public Seihin factoryMethod() {
return new Television();
}
public void touroku(Seihin s) {
Television t = (Television) s;
t.numberring();
t.setDate(Date.today());
}
}

class RadioKoujyou extends Koujyou {
public Seihin factoryMethod() {
return new Radio();
}
public void touroku(Seihin s) {
Radio r = (Radio) s;
r.numberring();
}
}
