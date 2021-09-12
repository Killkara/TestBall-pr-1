class Ball
{
    private int size;
    private String material;
    public Ball(int size,String material)
    {
        this.size=size;
        this.material=material;
    }
    public Ball(int size)
    {
        this.size=size;
        material="Rubber";
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getMaterial() {
        return material;
    }
    public int getSize() {
        return size;
    }
    public String toString()
    {
        return "Материал= "+material+" Размер= "+size;
    }
}