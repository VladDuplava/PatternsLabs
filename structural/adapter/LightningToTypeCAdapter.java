package structural.adapter;

// Адаптер
public class LightningToTypeCAdapter implements TypeC {
    private OldIPhone iPhone;
    public LightningToTypeCAdapter(OldIPhone iPhone) { this.iPhone = iPhone; }
    @Override
    public void connectWithTypeC() { iPhone.connectWithLightning(); }
}
